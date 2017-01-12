package com.cice.javatutorial.poo.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.cice.javatutorial.poo.interfaces.Racional;
public class ListTest {

	public static void main(String[] args){
		List<String> myStringList = new ArrayList<>();
		List<Racional> myRacionalList = new ArrayList<>();
		
		myStringList.add("Axel");
		myStringList.add("Mauricio");
		myStringList.add("Rubio");
		myStringList.add("Macea");

		for(int i=0; i<myStringList.size();i++){
			System.out.println(myStringList.get(i));
		}
		
		for (String str:myStringList){
			System.out.println(str);
		}
		
		Iterator<String> it=myStringList.iterator();
		while(it.hasNext()){
			String st=it.next();
			System.out.println(st);
		}
		
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(1,3));
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(9,3));
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(4,6));
		
		System.out.println("myRacionalList.size(): " + myRacionalList.size());
		
		Iterator<Racional> it2=myRacionalList.iterator();
		while(it2.hasNext()){
			Racional st=it2.next();
			System.out.println(st);
		}
		
	}

}
