package com.cice.javatutorial.streams;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;



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
			//Files.lines(Paths.get("palabras2"))
			//.filter(line->line.length()<=10)
			//.forEach(line->System.out.println(line));
			// otro jemplo 
			//Files.lines(Paths.get("palabras2"))
			//.map(line->line.length())
			//.forEach(x->System.out.println("lomgitud: "+ x));
			//oto ejemplo
			/*
			 * String str = "Axel mauricio 28 11 68 48 rubio macea";
			String[] tokens=str.split("\\s+");
			for (String token:tokens){
				System.out.println(token);
			}
			Stream.of(tokens)
			.forEach(token->System.out.println(token)); 
			*/
			// otro ejemplo
			/*Files.lines(Paths.get("palabras2"))
			.flatMap(line->Stream.of(line.split("\\s+")))
			.forEach(token->System.out.println(token));
			*/
			// otro ejemplo
				/*
				 * Files.lines(Paths.get("palabras2"))
				.flatMap(line->Stream.of(line.split("\\s+")))
				.filter(token->{try{
									Double.parseDouble((String)token);
									return true;
									}catch(NumberFormatException e){
										e.printStackTrace();
										return false;
									}
								}
				)
				.forEach(token->System.out.println(token));
				*/
				// otro ejemplo
				Serializable opt=Files.lines(Paths.get("palabras2"))
				.flatMap(line->Stream.of(line.split("\\s+")))
				.filter(token->{try{
									Double.parseDouble((String)token);
									return true;
									}catch(NumberFormatException e){
										return false;
									}
								}
				).mapToDouble(x->Double.parseDouble(x.toString()))
				.reduce(0,(x,y)->x+y);
				System.out.println(opt);
				
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
