package co.edu.unbosque.model;

public class Gabriel extends KublaKhan {

	@Override

	 public String mostrarInfo() {
		super.setNombre("Gabriel");
		super.setEdad(18);
		super.setEstatura(1.70);
		super.setColorOjos("violeta");
		super.setInfo(" puedo tener familia, ejercer una profesion y adquirir conocientos \n"
				+ "habito el este del planeta \n"
				+ " y siento la presencia de otros mortales");
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
		return "SOY MORTAL";
	}
	
	

}
