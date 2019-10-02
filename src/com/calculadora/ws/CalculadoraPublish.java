package com.calculadora.ws;

import javax.xml.ws.Endpoint;

public class CalculadoraPublish {

	
	
	//este es la tercer clase, y se creo como main.
	//cuando se inicia la aplicación se va a generar el contrado wsdl, todo 
	//esto acá.
	public static void main(String[] args) {
		 
		//en esta ruta general el wsdl en este servidor virtual.
		Endpoint.publish("http://localhost:1515/Calculadora", new CalculadoraImpl());
		
		//para ver la publicación del archivo wsdl poner en el buscador
		//http://localhost:1515/Calculadora?wsdl
		
		//para crear un cliente que consuma este ws dentro de la carpeta
		//workspace>proyecto>src arbri un cmd y poner los siguientes comandos:
		//wsimport -s .  http://localhost:1515/Calculadora?wsdl
		//esto es para crear todas las clases y consumir el servicio
		
		//darle refresh al proyecto, y crear una clase llamada
		//CalculadoraConsumer con método main
		
		
		

	}

}
