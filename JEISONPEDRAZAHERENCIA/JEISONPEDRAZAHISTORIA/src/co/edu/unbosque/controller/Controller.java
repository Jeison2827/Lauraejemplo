package co.edu.unbosque.controller;


import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.view.View;

public class Controller {
	
	
	private View vista;
	private Herencia h;
	
	public Controller() {
		vista= new View();
		h= new Herencia();
		
		funcionar();
		
	}
	public void funcionar() {
		vista.mostrarMensaje(h.getK().tipo());
		vista.mostrarMensaje(h.getK().mostrarInfo());
		vista.mostrarMensaje(h.getA().tipo());
		vista.mostrarMensaje(h.getA().mostrarInfo());
		vista.mostrarMensaje(h.getR().tipo());
		vista.mostrarMensaje(h.getR().mostrarInfo());
		vista.mostrarMensaje(h.getG().tipo());
		vista.mostrarMensaje(h.getG().mostrarInfo());
	}

}
