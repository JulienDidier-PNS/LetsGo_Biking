package com.soc.testwsclient;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.soap.ws.client.generated.*;
import org.apache.activemq.ActiveMQConnectionFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.activemq.ConnectionFailedException;

import javax.jms.*;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class ActiveMQConsumer {
    private static String QUEUE_EMPTY_EXCEPTION = "QUEUE_EMPTY";
    private static int NUMBER_OF_STEP_DEQUEUED = 1;

    // Permet de désérialiser un message en Step
    // ObjectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false); permet de ne pas lever d'exception si des propriétés sont ignorées c'est une option
    public static Step deserialize(String text) throws JsonProcessingException {
        Step s = new Step();
        String[] stepsInformations = text.split("::");
        ObjectFactory objectFactory = new ObjectFactory();
        s.setInstruction(objectFactory.createString(stepsInformations[0]));
        s.setDuration(Double.parseDouble(stepsInformations[1].replace(",",".")));
        s.setDistance(Double.parseDouble(stepsInformations[2].replace(",",".")));
        s.setName(objectFactory.createString(stepsInformations[3]));

        JAXBElement<ArrayOfint> waypoints = objectFactory.createRouteWayPoints(objectFactory.createArrayOfint());
        for(int i=4;i<stepsInformations.length;i++){waypoints.getValue().getInt().add(Integer.parseInt(stepsInformations[i]));}
        s.setWayPoints(waypoints);
        return s;
    }

    public static void consume(String itineraryID, GeoCoordinate currentCoordonate) {
        try {
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://LEGION-JULIEN:61616");
            Connection connection = connectionFactory.createConnection();

            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("Itinerary"+itineraryID);
            MessageConsumer consumer = session.createConsumer(destination);
            // on va attendre pour recevoir un message
            Message message;
            Step s = null;
            for(int i=0;i<10;i++){
                message = consumer.receive(NUMBER_OF_STEP_DEQUEUED);
                if (message == null) {throw new Exception(QUEUE_EMPTY_EXCEPTION);}
                TextMessage textMessage = (TextMessage) message;
                s = deserialize(textMessage.getText());
                System.out.println(s.getInstruction().getValue()+" during "+s.getDistance()+" meters");
            }

            ItineraryService client = new ItineraryService();
            IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();
            //RETOURNE [(POSITION DEPART)(POSITION ARRIVEE)]
            ArrayOfArrayOfdouble coordonates = proxyClient.getCoordonatesFromWaypoint(s.getWayPoints().getValue().getInt().get(0),itineraryID);

            currentCoordonate.setLatitude(coordonates.getArrayOfdouble().get(s.getWayPoints().getValue().getInt().get(0)).getDouble().get(0));
            currentCoordonate.setLongitude(coordonates.getArrayOfdouble().get(s.getWayPoints().getValue().getInt().get(0)).getDouble().get(1));

            // fermer le message consumer, la session et la connection
            consumer.close();
            session.close();
            connection.close();
            System.out.println();

        } catch (JMSException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}