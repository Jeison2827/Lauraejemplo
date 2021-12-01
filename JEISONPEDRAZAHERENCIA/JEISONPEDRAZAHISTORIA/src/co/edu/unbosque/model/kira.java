package co.edu.unbosque.model;

public class kira extends KublaKhan {

	@Override
	public String mostrarInfo() {
		super.setNombre("Kira");
		super.setEdad(190);
		super.setEstatura(3.00);
		super.setColorOjos("amarillo");
		super.setInfo(" puedo volar, crear fuego y detener el tiempo \n"
				+ "habito el norte del planeta \n"
				+ " y siento a seres de otros mundos");
		// TODO Auto-generated method stub
		return "Mi nombre es "+super.getNombre()
				+"\n Tengo "+super.getEdad()+" años"
				+"\n mido "+super.getEstatura()+ " metros"
				+"\n mi ojos son color "+super.getColorOjos()
				+"\n puedo "+super.getInfo();
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "SOY HEROE";
	}

	
	

}
