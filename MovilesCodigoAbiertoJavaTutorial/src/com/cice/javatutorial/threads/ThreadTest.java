package com.cice.javatutorial.threads;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * new Thread (new Runnable(){
			public void run(){
				while(true){
					System.out.println("Ejecutando Hilo 1");
				}
			}
		}).start();
		*/
		// usando lambda
		new Thread(()->{
			while(true){
				System.out.println("Ejecutando Hilo 1");
			}
		}).start();
		new Thread (new Runnable(){
			public void run(){
				while(true){
					System.out.println("Ejecutando Hilo 2");
				}
			}
		}).start();
		
	}

}
