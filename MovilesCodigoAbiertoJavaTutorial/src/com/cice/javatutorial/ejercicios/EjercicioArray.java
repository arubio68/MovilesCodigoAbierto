package com.cice.javatutorial.ejercicios;

public class EjercicioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] miArray ={"Eva","Juanita", "Pedro","Casimira", "Jonathan Lucas", "Lola", "Silvia","Lidia","Jose","Luis"};
		String masLargo="";
		for(String x: miArray){
			if (x.length()>masLargo.length()){
				masLargo=x;
			}
		}
		System.out.println("El nombre más largo es: " + masLargo + " con una longitud de " + masLargo.length());
		
		
		
		String masCorto = masLargo;
		for(String x: miArray){
			if(x.length()<masCorto.length())
				masCorto=x;
		}
		System.out.println("El nombre más corto es: " + masCorto + " con una longitud de " + masCorto.length());

	}

}
