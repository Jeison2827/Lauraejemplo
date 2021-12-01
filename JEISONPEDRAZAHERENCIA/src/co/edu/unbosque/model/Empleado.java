package co.edu.unbosque.model;

public class Empleado extends Persona {
	
	protected String cargo = "conductor";
	protected int salario = 200000;

	
	
	public String mostrarCargo () {
		 return "yo soy " +super.nombre+ " y tengo el cargo de " +cargo;
		
	}
	
	public String mostrarSalario() {
		return "en mi puesto como " +cargo+ " gano " +salario+ " en un mes";
	}
	
	//----------getters y setters --------------

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	
}
