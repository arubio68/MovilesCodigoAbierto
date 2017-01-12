package com.cice.javatutorial.poo;

public class PersonaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("construyendo un objeto de tipo persona");
		
		// construir una clase
		Persona newPersona = new Persona("Axel",40);

		
		System.out.println("objeto persona instanciado");
		//System.out.println(newPersona.getDomicilio());
		newPersona.print();

		
		
	}

}
