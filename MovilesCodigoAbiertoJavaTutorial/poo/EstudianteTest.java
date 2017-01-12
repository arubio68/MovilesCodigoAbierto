package com.cice.javatutorial.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante e = new Estudiante("Axel",45,"2222","pol","car","val");
		System.out.println(e.getNumCursos());
		
		Estudiante e2 = new Estudiante("Mauricio",35,"111","far","gal","cel");
		System.out.println("primera parte "+e2.getNumCursos());
		e2.print();
		
		e2.removeCurso("gal");
		System.out.println("segunda parte " + e2.getNumCursos());
	}

}
