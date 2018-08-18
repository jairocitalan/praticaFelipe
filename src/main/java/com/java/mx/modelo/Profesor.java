package com.java.mx.modelo;

public class Profesor extends Persona{
	public String folio;
	private double sueldo;
	
	public Profesor(String nombre, String apellidos, int edad, double peso, String folio, double sueldo) {
		super(nombre, apellidos, edad, peso);
		this.folio = folio;
		this.sueldo = sueldo;
	}
	
	@Override
	public void imprimeDatos() {
		super.imprimeDatos();
		System.out.println("Folio: "+this.folio+" "+"Sueldo: "+this.sueldo);
		System.out.println(this.checaAumento(this.sueldo));
		System.out.println("------------------------------------------------");
	}
	
	
}
