package co.edu.unbosque.model;

public abstract class KublaKhan {
	
	
	protected String nombre;
	protected int edad;
	protected String colorOjos;
	protected double estatura;
	protected String info;
	
	abstract String mostrarInfo();
	abstract String tipo();
	
	
	//getters y setters

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected String getColorOjos() {
		return colorOjos;
	}

	protected void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	protected double getEstatura() {
		return estatura;
	}

	protected void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	protected String getInfo() {
		return info;
	}

	protected void setInfo(String info) {
		this.info = info;
	}
	
	
	
	
	
	
	
	
	

}
