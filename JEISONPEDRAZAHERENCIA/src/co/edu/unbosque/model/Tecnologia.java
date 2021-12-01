package co.edu.unbosque.model;

public class Tecnologia extends Empleado {
	
	protected String nombreJefe= "Paco";
	protected int encargados= 3;
	
	public String mostrarNombreJefe() {
		return "Mi jefe se llama " +nombreJefe;
		
	}
	
	public String obtenerNumeroDeEncargado() {
		return "el numero de encargados de esta area son " +encargados;
	}

	
	// ----------getters y setters----------------------------
	public String getNombreJefe() {
		return nombreJefe;
	}

	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}

	public int getEncargados() {
		return encargados;
	}

	public void setEncargados(int encargados) {
		this.encargados = encargados;
	}
	
	
	

}
