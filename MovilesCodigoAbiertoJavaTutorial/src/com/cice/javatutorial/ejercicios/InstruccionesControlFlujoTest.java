package com.cice.javatutorial.ejercicios;
/**
 * Comentario para generar documentación
 * @author cice
 *
 */

public class InstruccionesControlFlujoTest {
	public static void main(String[] args){
		
		// Comentario de una sola línea
		/*ALTERNATIVA SIMPLE
		 * Comentario de varias líneas
		 * if (condicion) {
		 *    <instrucciones>
		 *  }
		 *  if (condicion) {
		 *    <instrucciones>
		 *  } else {
		 *    <instrucciones>
		 *  }   
		 */
		int puntuacion = 10;
		if (puntuacion>5) {
			System.out.println("Aprobado");
		} else{
			System.out.println("Suspenso");
			
		}
		/*
		 * ALTERNATIVA MÚLTIPLE
		 * switch(expresión){
		 *    casos
		 * }
		 */
		switch (puntuacion){
		case 0:
			System.out.println("Suspenso");
			break;
		case 1:
			System.out.println("Suspenso");
			break;
		case 2:
			System.out.println("Suspenso");
			break;
		case 3:
			System.out.println("Suspenso");
			break;
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
			System.out.println("Notable");
			break;
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Matrícula de Honor");
			break;
		default:
			System.out.println("Puntuación no válida");
		}
		//BUCLES
		/* while (condicion){
		 *   instrucciones
		 * }
		 * for (expr1; expr2; expr3){
		 *    instrucciones
		 * }
		 */
		puntuacion =0;
		while (puntuacion<10){
			System.out.println("Incrementando puntuación...puntuación = " + puntuacion);
			
			puntuacion++;
		}
		System.out.println("Puntuación final =" + puntuacion);
		
		for(puntuacion=0;puntuacion<10;puntuacion++){
			System.out.println("Bucle FOR - Incrementando puntuación...puntuación = " + puntuacion);
		}
		System.out.println("Puntuación final =" + puntuacion);
		
		do {
			puntuacion++;
			System.out.println("Bucle do-while - Incrementando puntuación...puntuación = " + puntuacion);
		} while(puntuacion<10);
		System.out.println("Puntuación final =" + puntuacion);
		
		
		/*
		 * Saltos incondicionales
		 * break  despaza el flujo fuera del bucle donde se ejecute
		 * continue  desplaza el flujo a la siguiente iteración dentro de un bucle
		 */
		
		puntuacion=0;
		while(puntuacion<10){
			System.out.println("Prueba break - Incrementando puntuación...puntuación = " + puntuacion);
		
			 if (puntuacion==5)
				 continue;
				 puntuacion++;
		}
		
	
	}

}
