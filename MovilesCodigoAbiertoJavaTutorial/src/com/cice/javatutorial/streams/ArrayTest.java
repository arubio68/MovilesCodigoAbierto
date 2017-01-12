package com.cice.javatutorial.streams;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] miArray=new int[10];
		miArray[0]=12;
		miArray[1]=72;
		miArray[2]=2;
		miArray[3]=212;
		miArray[4]=132;
		miArray[5]=122;
		miArray[6]=121;
		miArray[7]=128;
		miArray[8]=125;
		miArray[9]=1;
		for(int i=0;i<miArray.length;i++){
			System.out.println(miArray[i]);
		}
		
		for(int elemento:miArray){
			System.out.println(elemento);
		}
		//Inicialización de matrices: declararla y darle valores
		String[] miStringArray={"Juan", "Pepita", "Manuela"};
		
		for(String s:miStringArray){
			System.out.println(s + ", tamaño: "+ s.length());
		}
		//En Java las variables tienen ámbito de bloque
		}

}
