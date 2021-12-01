package co.edu.unbosque.model;

public class Ejecutivo extends Gerente {
	
	protected int despidos= 7;
	protected int contrataciones=10;
	
	public String calcularDespidos() {
		return "por ordenes de " +super.nombre+ " se despidieron " +despidos;
	}
	
	public String calcularContrataciones() {
		return "se contrataron " +contrataciones+ " nuevos empleados";
	}

	//-----------getters y setters---------
	public int getDespidos() {
		return despidos;
	}

	public void setDespidos(int despidos) {
		this.despidos = despidos;
	}

	public int getContrataciones() {
		return contrataciones;
	}

	public void setContrataciones(int contrataciones) {
		this.contrataciones = contrataciones;
	}
	
	
	
	

}
