package com.cice.javatutorial.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class ProcesandoFicheroStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// sin lambda
			//Stream str = Files.lines(Paths.get("palabras2"));
			//str.forEach(line->System.out.println("line:"+ line));
			// usando lambda
			//Files.lines(Paths.get("palabras2")).forEach(line->System.out.println("line:"+ line));
			// otro ejemplo 
			Files.lines(Paths.get("palabras2"))
			.filter(line->line.length()<10)
			.forEach(line->System.out.println(line));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
