package com.cice.javatutorial.ejercicios;

public class TiposPrimitivosTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=67;
		short s=34;
		float f=56.7f;
		double d=98.7;
		boolean b=true;
		char c='c';
		String str="Manuela";
		System.out.println("Valor de x : " + x);
		System.out.println("Valor de c : " + c);
		System.out.println("Valor de d : " + d);
		System.out.println("Valor de str: " + str);
		x=0xff56;
		System.out.println("Valor de x : " + x);
		x=0b1011;
		System.out.println("Valor de x : " + x);
		c='\t';
		c='\0';
		System.out.println(c + "Pepa");
		System.out.println("\nPepa");
	}

}
