package com.cice.javatutorial.poo.collections;

import java.io.FileNotFoundException;

public class DiccionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Diccionario d = new Diccionario("plabras.txt");
			d.print();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
