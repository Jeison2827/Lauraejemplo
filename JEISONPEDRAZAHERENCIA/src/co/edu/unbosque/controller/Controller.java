package co.edu.unbosque.controller;

import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.view.View;

public class Controller {
	
	
	private Herencia h;
	private View vista;
	
	public Controller() {
		vista= new View();
		h= new Herencia();
		
		funcionar();
	}
	
	public void funcionar() {
		
		vista.mostrarMensaje(h.getP().mostrarNombre());
		vista.mostrarMensaje(h.getP().mostrarEdad());
		vista.mostrarMensaje(h.getEmple().mostrarCargo());
		vista.mostrarMensaje(h.getEmple().mostrarSalario());
		vista.mostrarMensaje(h.getG().mostrarDiaDeReunion());
		vista.mostrarMensaje(h.getG().llamarSecretaria());
		vista.mostrarMensaje(h.getT().mostrarNombreJefe());
		vista.mostrarMensaje(h.getT().obtenerNumeroDeEncargado());
		vista.mostrarMensaje(h.getM().mostrarDiaDescanso());
		vista.mostrarMensaje(h.getM().mostrarHoraAlmuerzo());
		vista.mostrarMensaje(h.getC().mostrarAnioExpe());
		vista.mostrarMensaje(h.getC().mostrarCatidadDeVentas());
		vista.mostrarMensaje(h.getEje().calcularDespidos());
		vista.mostrarMensaje(h.getEje().calcularContrataciones());
	}
	

	
}
