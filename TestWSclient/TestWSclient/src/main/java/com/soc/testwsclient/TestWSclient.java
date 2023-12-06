/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.soc.testwsclient;


import com.soap.ws.client.generated.*;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class TestWSclient {

    public static String STARTADRESS_WORKING = "toulouse musée des augustins";
    public static String ENDADRESS_WORKING = "intermarché 362 rue faventines valence";
    public static void main(String[] args)
    {
        showSteps(getItinerary(STARTADRESS_WORKING, ENDADRESS_WORKING));
        System.out.println("Appuyez sur un touche pour quitter !");

        new Scanner(System.in).nextLine();
    }
    private static Itinerary getItinerary(String start, String end)
    {
        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();
        return proxyClient.getItinerary(start, end);
    }

    private static void showSteps(Itinerary itinerary)
    {
        for(Segment segment : itinerary.getRoutes().getValue().getRoute().get(0).getSegments().getValue().getSegment())
        {
            for(Step step : segment.getSteps().getValue().getStep())
            {
                System.out.println(step.getInstruction().getValue() + " during " + step.getDistance().toString() + " meters ");
            }
        }

    }
}
