package com.cice.javatutorial.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		try {
			Scanner sc = new Scanner(new FileInputStream("Palabras2"));
			//sc.useDelimiter("\\s*ax\\s*");
			float suma=0;
			while (sc.hasNext()){
				try{
					int x=sc.nextInt();
					System.out.println("Numero: "+ x);
					suma+= x;
					
				}catch(InputMismatchException e){
					try {
						float f =sc.nextFloat();
						suma+=f;
					} catch (InputMismatchException e2){
						sc.next();
					}
				}
				//System.out.println(sc.next());
			}
			
			System.out.println(suma);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}

}
