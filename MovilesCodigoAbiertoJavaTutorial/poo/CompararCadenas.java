package com.cice.javatutorial.poo;

public class CompararCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Axel";
		String str2="Axel";
		System.out.println(str1==str2);

		// apuntar a bloques de memoria diferentes
		String str3 = new String("Axel3");
		String str4 = new String("Axel3");
		//compara bloques de memoria
		System.out.println(str3==str4);
		//compara los contenidos de los bloques de memoria
		System.out.println(str3.equals(str4));
	
	}

}
