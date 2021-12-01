package co.edu.unbosque.model;

public class Herencia {
	
	private Persona p;
	private Empleado emple;
	private Mantenimiento m;
	private Gerente g;
	private Tecnologia t;
	private Comercial c;
	private Ejecutivo eje;
	
	public Herencia() {
		p = new Persona();
		emple = new Empleado();
		m = new Mantenimiento();
		g = new Gerente ();
		t = new Tecnologia() ;
		c = new Comercial ();
		eje = new Ejecutivo ();
	}

	
	
	
	
	//-----getters y setters --------------------
	
	
	public Persona getP() {
		return p;
	}

	public void setP(Persona p) {
		this.p = p;
	}

	public Empleado getEmple() {
		return emple;
	}

	public void setEmple(Empleado emple) {
		this.emple = emple;
	}

	public Mantenimiento getM() {
		return m;
	}

	public void setM(Mantenimiento m) {
		this.m = m;
	}

	public Gerente getG() {
		return g;
	}

	public void setG(Gerente g) {
		this.g = g;
	}

	public Tecnologia getT() {
		return t;
	}

	public void setT(Tecnologia t) {
		this.t = t;
	}

	public Comercial getC() {
		return c;
	}

	public void setC(Comercial c) {
		this.c = c;
	}

	public Ejecutivo getEje() {
		return eje;
	}

	public void setEje(Ejecutivo eje) {
		this.eje = eje;
	}
	
	
	
	
	

}
