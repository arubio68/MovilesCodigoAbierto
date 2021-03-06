package com.cice.javatutorial.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Diccionario {
	Map<Character, List<String>> buffer;

	public Diccionario(String file) throws FileNotFoundException{
		FileInputStream in = new FileInputStream(file);
		Scanner sc = new Scanner(in);
		load(sc);
		
	}
	private void load(Scanner sc){
		while(sc.hasNext()){
			String line = sc.nextLine();
			// Guarda la linea leida en el Buffer
			char c= line.charAt(0);
			List<String> l = buffer.get(c);
			if(l==null){
				l = new ArrayList<>();
				buffer.put(c, l);
			}
			l.add(line);
		}
	}
	
	public void print(){
		Set<Character> keys = buffer.keySet();
		for (Character c:keys){
			List<String> values = buffer.get(c);
			System.out.print(c + "[");
			for (String word:values){
				System.out.println(word + " ");
			}
			System.out.println("]");
		}
	}
}
