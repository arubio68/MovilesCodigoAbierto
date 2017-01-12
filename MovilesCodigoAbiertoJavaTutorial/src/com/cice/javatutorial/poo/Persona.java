package com.cice.javatutorial.poo;

public class Persona {
	
	/*
	 *  definicion de atributos:
	 *  	nombre - edad - omicilio
	 *  modificadores de accesos:
	 *  	private - public- protected
	 */
	
	private String nombre;
	private int edad;
	private String domicilio;
	
	// definicion de constructores
	/*
	public Persona(){
	};
	*/
	
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		setEdad(edad);
	};
	
	public Persona(String nombre, int edad, String domicilio){
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio= domicilio;
	};
	
	
	// definicion de metodos
	public void print(){
		System.out.println("nombre: " + nombre);
		System.out.println("edad: " + edad);
		System.out.println("domicilio: " + domicilio);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad>=0)
			this.edad = edad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	
	
}
