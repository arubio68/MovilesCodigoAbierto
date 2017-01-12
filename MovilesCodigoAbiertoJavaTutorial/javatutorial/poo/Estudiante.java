package com.cice.javatutorial.poo;

public class Estudiante extends Persona{
	
	private String nie;
	private String[] cursos;
	
	public Estudiante(String nombre, int edad, String nie, String...cursos) {
		// el uso del constructor de la superclase debe ir al principio
		super(nombre, edad);
		// luego los demas atributos de la clase nueva que hereda
		this.nie = nie;
		this.cursos=cursos;

	}
	
	public int getNumCursos(){
		return cursos.length;
	}

	
	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	
	public void addCurso(String curso){
		int nc = cursos.length+1;
		String[] newCursos = new String[nc];
		int i;
		for (i=0; i<cursos.length;i++){
			newCursos[i]= cursos[i];
		}
		newCursos[i]=curso;
		cursos = newCursos;
	}
	
	public void removeCurso(String curso){
		
		
		try {
			int nc = cursos.length-1;
	
			int c=0;
			
			for (int i=0; i<cursos.length;i++){
	
				if (cursos[i]==curso){
					c=1;
					break;
				};
			}
			
			
			
			String[] newCursos = new String[nc];
			//otra forma de crear la matriz seria
			// String[] newCursos=cursos.length>0?new String[cursos.length-1]:null; 
			
			String temp;
			int y=0;
			if (c==1){
				for (int i=0; i<cursos.length;i++){
					if (cursos[i]!=curso) {
						temp=cursos[i];
						newCursos[y]= temp;
						y++;
					}
				}
			}
	
			cursos = newCursos;
			for (int i=0; i<cursos.length;i++){
				System.out.println(cursos[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void print(){
		System.out.println("Alumno: "+ getNombre());
		System.out.println("Edad: "+ getEdad());
		System.out.println("Domicilio: "+ getDomicilio());
		System.out.println("nie: "+ getNie());
		System.out.println("Num. Cursos: "+ getNumCursos());
	}

}

