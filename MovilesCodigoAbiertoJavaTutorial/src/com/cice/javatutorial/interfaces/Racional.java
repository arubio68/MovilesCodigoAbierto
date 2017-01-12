package com.cice.javatutorial.interfaces;

public class Racional implements Comparable {
	private int numerador;
	private int denominador;
	
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}


	@Override
	public int compareTo(Object other) throws ComparationException {
		// TODO Auto-generated method stub
		if(!(other instanceof Racional))
			throw new ComparationException("el elemento comparado "
					+ "debe ser un objeto de tipo Racional");
		Racional r=(Racional)other;
		if(numerador*r.getDenominador()>denominador*r.getNumerador())
			return 1;
		else if(numerador*r.getDenominador()<denominador*r.getNumerador())
			return -1;
		return 0;
	}


	public String toString() {
		StringBuffer buffer=new StringBuffer();
		String sg=(numerador>=0 && denominador>0)||(numerador>=0&&denominador<0)?"+":"-";
		buffer.append(sg);
		buffer.append(Math.abs(numerador) + "/" + Math.abs(denominador));
		System.out.println("pasa");
		return buffer.toString();
	}
// https://github.com/uc3mfjiglesi/moviles_codigo_abierto
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		System.out.println("pasa" + 25);
		return true;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1000;
	}

	
}