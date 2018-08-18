package com.java.mx.modelo;

public class Administrativo extends Persona{
	private String cedula;
	private String puesto;

	
	public Administrativo(String nombre, String apellidos, int edad, double peso, String cedula, String puesto) {
		super(nombre, apellidos, edad, peso);
		this.cedula = cedula;
		this.puesto = puesto;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void imprimeDatos() {
		super.imprimeDatos();
		System.out.println("Cedula: "+this.cedula.toUpperCase()+"puesto: "+this.puesto.toUpperCase());
	}

}
