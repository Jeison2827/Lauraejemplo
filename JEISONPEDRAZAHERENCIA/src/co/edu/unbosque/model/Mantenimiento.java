package co.edu.unbosque.model;

public class Mantenimiento extends Empleado {
	
	protected String diaDescanso= "jueves";
    protected String horaAlmuerzo= "13:00";
    
    
    public String mostrarDiaDescanso () {
    	return "mi dia de descanso es el " +diaDescanso;
    	
    }
    
    public String mostrarHoraAlmuerzo() {
    	return "Mi tiempo para el almuerzo inicia a la " +horaAlmuerzo;
    }
	//-----------------getters y setters ------------------------

	public String getHoraAlmuerzo() {
		return horaAlmuerzo;
	}

	public void setHoraAlmuerzo(String horaAlmuerzo) {
		this.horaAlmuerzo = horaAlmuerzo;
	}

	public String getDiaDescanso() {
		return diaDescanso;
	}

	public void setDiaDescanso(String diaDescanso) {
		this.diaDescanso = diaDescanso;
	} 
}
