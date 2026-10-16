package co.edu.unbosque.model;

public class Rutina {

	private String diaRutina;
	private String musculosTrabajados;
	private String notaEntrenamiento;

	public Rutina(String diaRutina, String musculosTrabajados, String notaEntrenamiento) {
		super();
		this.diaRutina = diaRutina;
		this.musculosTrabajados = musculosTrabajados;
		this.notaEntrenamiento = notaEntrenamiento;
	}

	public Rutina() {
		super();
	}

	public String getDiaRutina() {
		return diaRutina;
	}

	public void setDiaRutina(String diaRutina) {
		this.diaRutina = diaRutina;
	}

	public String getMusculosTrabajados() {
		return musculosTrabajados;
	}

	public void setMusculosTrabajados(String musculosTrabajados) {
		this.musculosTrabajados = musculosTrabajados;
	}

	public String getNotaEntrenamiento() {
		return notaEntrenamiento;
	}

	public void setNotaEntrenamiento(String notaEntrenamiento) {
		this.notaEntrenamiento = notaEntrenamiento;
	}

}
