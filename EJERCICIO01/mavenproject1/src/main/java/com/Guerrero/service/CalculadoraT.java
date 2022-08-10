/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.Guerrero.service;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author HOME
 */
@WebService(serviceName = "CalculadoraT")
public class CalculadoraT {

 
    @WebMethod(operationName = "FtC")
    public String FahreheitToCelsius (@WebParam(name = "Fahrenheit") double gradosF) 
    {
        double Celsius = (gradosF-32)*4/9;
        
        return "Temperatura en Celsius = " + Celsius + " !";
    }
    
     @WebMethod(operationName = "CtF")
    public String CelsiusToFahrenheit(@WebParam(name = "Celsius") double gradosC) 
    {
        double Fahrenheit= (gradosC * 9/5)*32 ;
        
        return  "Temperatura en Fahrenheit=" + Fahrenheit + " !";
    }
}
