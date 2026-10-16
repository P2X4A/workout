package co.edu.unbosque.model;

import java.util.ArrayList;

public class RutinaLogica {

    private final ArrayList<Rutina> organizacionRutina = new ArrayList<>();

    public void registrarEntrenamiento(String diaRutina, String musculosTrabajados, String notaEntrenamiento) {
        // Crear la Rutina y añadirla a la lista
        organizacionRutina.add(new Rutina(diaRutina, musculosTrabajados, notaEntrenamiento));
    }

    public ArrayList<Rutina> listarEntrenamiento() {
        return organizacionRutina;
    }
}
