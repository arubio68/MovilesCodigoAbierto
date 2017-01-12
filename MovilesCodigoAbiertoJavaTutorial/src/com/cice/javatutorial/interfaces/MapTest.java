package com.cice.javatutorial.interfaces;
import com.cice.javatutorial.poo.Persona;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Persona> myPersonaMap = new HashMap<>();
		myPersonaMap.put("p-90871", new Persona("Axel",48));
		myPersonaMap.put("p-90872", new Persona("Mauricio",48));
		myPersonaMap.put("p-90873", new Persona("Rubio",48));
		myPersonaMap.put("p-90874", new Persona("Macea",48));
		myPersonaMap.put("p-90871", new Persona("Gabriela",48));
		
		Set<String> keys = myPersonaMap.keySet();
		for (String key:keys){
			Persona p = myPersonaMap.get(key);
			p.print();
			
		}
	}

}
