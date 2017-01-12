package com.cice.javatutorial.poo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.cice.javatutorial.poo.interfaces.Racional;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> mySetList = new HashSet<>();
		Set<Racional> myRacionalSet = new HashSet<>();
		
		mySetList.add("Axel");
		mySetList.add("Axel");
		mySetList.add("Mauricio");
		mySetList.add("Rubio");
		mySetList.add("Gabriel");
		mySetList.add("Macea");

		System.out.println(mySetList.size());
		
		
		for (String str:mySetList){
			System.out.println(str);
		}
		
		Iterator<String> it=mySetList.iterator();
		while(it.hasNext()){
			String st=it.next();
			System.out.println(st);
		}
		
		
		System.out.println("Pruebas con Racional");
		
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(1,3));
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(9,3));
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(4,6));
		
		Iterator<Racional> it2=myRacionalSet.iterator();
		while(it.hasNext()){
			Racional st=it2.next();
			System.out.println(st);
		}
		
	}
		
		
		

	}


