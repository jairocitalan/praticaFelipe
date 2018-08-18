package com.java.mx.modelo;

public abstract class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private double peso;
	
	
	public Persona(String nombre, String apellidos, int edad, double peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.peso = peso;
	}
	
     public void imprimeDatos() {
		System.out.println("Nombre: " + this.nombre.trim().toUpperCase() + " " + "Apellidos: " + this.apellidos.trim().toUpperCase() + " " + "Edad: " + this.edad
				+ " " + "Peso:" + this.peso);

	}
     

     public String checaAumento(double sueldo) {
    	 String aumento;
    	 if(sueldo <= 10000) {
    		 aumento = "Si aplica Aumento";
    	 }else {
    		 aumento = "No aplica Aumento";
    	 }
    	 
    	 return aumento;
     }

}
