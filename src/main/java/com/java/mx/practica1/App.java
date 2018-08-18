package com.java.mx.practica1;

import com.java.mx.modelo.Alumno;
import com.java.mx.modelo.Profesor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Profesor p1= new Profesor("felipe","ortiz morales", 25, 75.450, "tyf74744",9000.456);
    	p1.imprimeDatos();
    	
    	Alumno a1 = new Alumno("Jairo Alberto", "Citalán Chavéz", 25, 78.567, "B110031");
    	a1.imprimeDatos();
    }
}
