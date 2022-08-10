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
@WebService(serviceName = "CalculadoraN")
public class CalculadoraN {

    @WebMethod(operationName = "Suma")
    public String suma (@WebParam(name = "valor1") double valor1,  @WebParam(name = "valor2") double valor2 ) {
        
    double respuesta = valor1+valor2;
    return "Resultado= " + respuesta;
    }
    
     @WebMethod(operationName = "Resta")
    public String resta (@WebParam(name = "valor1") double valor1,  @WebParam(name = "valor2") double valor2 ) {
        
    double respuesta = valor1-valor2;
    return "Resultado= " + respuesta;
    }
      @WebMethod(operationName = "Multiplicacion")
    public String multiplicacion (@WebParam(name = "valor1") double valor1,  @WebParam(name = "valor2") double valor2 ) {
        
    double respuesta = valor1*valor2;
    return "Resultado= " + respuesta;
    }
      @WebMethod(operationName = "Division")
    public String division (@WebParam(name = "valor1") double valor1,  @WebParam(name = "valor2") double valor2 ) {
        
    double respuesta = valor1/valor2;
    return "Resultado= " + respuesta;
    }
}
