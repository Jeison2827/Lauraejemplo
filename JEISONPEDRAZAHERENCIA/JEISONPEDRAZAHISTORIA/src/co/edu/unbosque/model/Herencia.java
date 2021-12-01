package co.edu.unbosque.model;

public class Herencia {
	

	private kira k;
	private Renk r;
	private Gabriel g;
	private Astar a;
	
	
	public Herencia() {
		
		k = new kira();
		r= new Renk();
		g= new Gabriel();
		a= new Astar();
		
	}


	public kira getK() {
		return k;
	}


	public void setK(kira k) {
		this.k = k;
	}


	public Renk getR() {
		return r;
	}


	public void setR(Renk r) {
		this.r = r;
	}


	public Gabriel getG() {
		return g;
	}


	public void setG(Gabriel g) {
		this.g = g;
	}


	public Astar getA() {
		return a;
	}


	public void setA(Astar a) {
		this.a = a;
	}

	
	
	
	
}
