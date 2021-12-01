package co.edu.unbosque.model;

public class Gerente extends Empleado{
	
	protected String reuniones = "todos los lunes";
	protected String nombreSecretaria = "pepita";
	
	
	public String llamarSecretaria() {
		return "necesito a " +nombreSecretaria+ " ya mismo";
	}
	
	
	public String mostrarDiaDeReunion () {
		return "tengo reunion " +reuniones;
		
		
	}
	
	//-----------getters y setters-----------


	public String getReuniones() {
		return reuniones;
	}


	public void setReuniones(String reuniones) {
		this.reuniones = reuniones;
	}


	public String getNombreSecretaria() {
		return nombreSecretaria;
	}


	public void setNombreSecretaria(String nombreSecretaria) {
		this.nombreSecretaria = nombreSecretaria;
	}
	
	

}
