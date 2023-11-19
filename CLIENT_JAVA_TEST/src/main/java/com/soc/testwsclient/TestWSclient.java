/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.soc.testwsclient;

import com.soap.ws.client.generated.IMathsOperations;
import com.soap.ws.client.generated.MathsOperations;

/**
 *
 * @author franc
 */
public class TestWSclient {

    public static void main(String[] args) {
        System.out.println("Hello World! we are going to test a SOAP client written in Java");
        MathsOperations mop=new  MathsOperations();
        IMathsOperations proxyMath= mop.getBasicHttpBindingIMathsOperations();
        int r=proxyMath.Add(100,25);
        System.out.println("Resultat du subtract = "+r);
    }
}
