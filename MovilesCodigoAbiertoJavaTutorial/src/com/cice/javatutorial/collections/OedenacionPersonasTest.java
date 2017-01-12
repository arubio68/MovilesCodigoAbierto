package com.cice.javatutorial.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

import com.cice.javatutorial.poo.Persona;

import com.cice.javatutorial.poo.Persona;

public class OedenacionPersonasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> list = new ArrayList<>();
		list.add(new Persona("Axel",52));
		list.add(new Persona("Mauricio",45));
		list.add(new Persona("Rubio",23));
		list.add(new Persona("Macea",98));
		list.add(new Persona("Rubio11111",23));
		list.add(new Persona("Macea2222",38));
		/*
		 * Collections.sort(list, new Comparator<Persona>(){

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getEdad() - o2.getEdad();
			}
		});
		*/
		// usando lambda
		Collections.sort(list,(o1,o2)->o1.getEdad()-o2.getEdad());

		for (Persona p:list){
			p.print();
		}
	}

}
