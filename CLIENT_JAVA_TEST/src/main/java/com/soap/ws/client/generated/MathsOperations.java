
package com.soap.ws.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MathsOperations", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8090/MyService/SimpleCalculator?wsdl")
public class MathsOperations
    extends Service
{
    private final static URL MATHSOPERATIONS_WSDL_LOCATION;
    private final static WebServiceException MATHSOPERATIONS_EXCEPTION;
    private final static QName MATHSOPERATIONS_QNAME = new QName("http://tempuri.org/", "SimpleCalculator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/MyService/SimpleCalculator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MATHSOPERATIONS_WSDL_LOCATION = url;
        MATHSOPERATIONS_EXCEPTION = e;
    }

    public MathsOperations() {
        super(__getWsdlLocation(), MATHSOPERATIONS_QNAME);
    }


    /**
     * 
     * @return
     *     returns IMathsOperations
     */
    @WebEndpoint(name = "BasicHttpBinding_IMathsOperations")
    public IMathsOperations getBasicHttpBindingIMathsOperations() {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_ISimpleCalculator"), IMathsOperations.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMathsOperations
     */
    @WebEndpoint(name = "BasicHttpBinding_IMathsOperations")
    public IMathsOperations getBasicHttpBindingIMathsOperations(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IMathsOperations"), IMathsOperations.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MATHSOPERATIONS_EXCEPTION!= null) {
            throw MATHSOPERATIONS_EXCEPTION;
        }
        return MATHSOPERATIONS_WSDL_LOCATION;
    }

}
