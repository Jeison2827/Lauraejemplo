package co.edu.unbosque.model;

public class Persona {
	
	protected String nombre = "pepe";
	protected int edad= 27;
	
	
	public String mostrarNombre() {
		return "mi nombre es " +nombre;
	}
	
	public String mostrarEdad() {
		return "y tengo " +edad+ " años";
	}
	
	//------ getters y setters--------------------------------------- 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}    	

}
