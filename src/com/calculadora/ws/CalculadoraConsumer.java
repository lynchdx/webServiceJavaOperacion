package com.calculadora.ws;

public class CalculadoraConsumer {

	public static void main(String[] args) {
		
		//instancear clase CalculadoraImplService para consumir el ws
		//tambien a la clase de la interfaz para consumir el m�todo
		
		CalculadoraImplService calculadoraService =  new CalculadoraImplService();
		Calculadora consumer = calculadoraService.getCalculadoraImplPort();
		//a trav�s del gecalculadoraimpImpor se puede acceder al webservice.
		
		System.out.println("Suma");
		System.out.println(consumer.operacion(1, 6, 4));
		
		System.out.println("Resta");
		System.out.println(consumer.operacion(2, 7, 5));
		
		System.out.println("Multiplicaci�n");
		System.out.println(consumer.operacion(3, 6, 4));
		
		System.out.println("Divisi�n");
		System.out.println(consumer.operacion(4, 10, 5));
		

	}

}
