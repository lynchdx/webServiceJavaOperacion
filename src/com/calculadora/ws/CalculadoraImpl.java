package com.calculadora.ws;

import javax.jws.WebService;

//este es la segunda clase creada (primer la interfaz)
//se crea una CalculadoraImpl, se pone Impl a esta clase ya que esta va a
//implementar los métodos creados en la interfaz anterior.
//add implements methods

//annotación web service, hay que poner donde se encuentra la interfaz de 
//donde viene la operación
//La operación viene de com.Calculadora.ws.Calculadora

@WebService(endpointInterface="com.calculadora.ws.Calculadora")
public class CalculadoraImpl implements Calculadora{

	@Override
	public double operacion(int opcion, int valor1, int valor2) {
		// TODO Auto-generated method stub
		
		double resultado = 0;
		
		switch (opcion) {
		case 1:
			resultado = valor1 + valor2;
			break;
			
		case 2:
			resultado = valor1 - valor2;
			break;
			
		case 3:
			resultado = valor1*valor2;
			break;
			
		case 4:
			resultado = valor1/valor2;
			break;
			
		default:
			break;
		}

		return resultado;
	}
	
}
