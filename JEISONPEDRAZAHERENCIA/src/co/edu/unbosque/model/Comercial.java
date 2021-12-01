package co.edu.unbosque.model;

public class Comercial extends Gerente {
	
	protected int numeroVentasSemana= 325244142;
	protected int aniosExperiencia= 13;
	
	public String mostrarAnioExpe() {
		return "tengo " +aniosExperiencia+ " años de experiencia";
	}
	
	public String mostrarCatidadDeVentas() {
		return "en la semana se vendieron " +numeroVentasSemana+ " productos";
	}

	//-----------getters y setters-----------
	public int getNumeroVentasSemana() {
		return numeroVentasSemana;
	}

	public void setNumeroVentasSemana(int numeroVentasSemana) {
		this.numeroVentasSemana = numeroVentasSemana;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

}
