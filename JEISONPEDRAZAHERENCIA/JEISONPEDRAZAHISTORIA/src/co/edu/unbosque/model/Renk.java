package co.edu.unbosque.model;

public class Renk extends KublaKhan {
	

	@Override
	public String mostrarInfo() {
		super.setNombre("Renk");
		super.setEdad(1390);
		super.setEstatura(2.20);
		super.setColorOjos("gris");
		super.setInfo("soy rechazado por KublaKan por mi falsa alma \n"
				+ "habito el extremo sur del planeta \n"
				+ "no siento a nadie que no sea yo");
		// TODO Auto-generated method stub
		return "Mi nombre es "+super.getNombre()
				+"\n Tengo "+super.getEdad()+" años"
				+"\n mido "+super.getEstatura()+ " metros"
				+"\n mi ojos son color "+super.getColorOjos()
				+"\n "+super.getInfo();
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "SOY DESTERRADO";
	}
	
	
	
	
	

}
