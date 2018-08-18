package com.java.mx.modelo;

public class Alumno extends Persona{
	private String matricula;
	
	public Alumno(String nombre, String apellidos, int edad, double peso, String matricula ) {
		super(nombre, apellidos, edad, peso);
		this.matricula = matricula;
	}
	
	@Override
	public void imprimeDatos() {
		super.imprimeDatos();
		System.out.println("Matricula: "+this.matricula);
		System.out.println("------------------------------------------------");
	}

}
