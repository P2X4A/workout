package co.edu.unbosque.controller;

import co.edu.unbosque.model.RutinaLogica;
import co.edu.unbosque.view.Consola;
import java.util.List;

public class Controlador {

    private final RutinaLogica rutinaLogica = new RutinaLogica();
    private final Consola consola = new Consola();

    public void ejecutar() {
        int opcion;
        do {
            opcion = consola.mostrarMenu();
            switch (opcion) {
                case 1:
                    registrarEntrenamiento();
                    break;
                case 2:
                    listarEntrenamiento();
                    break;
                case 3:
                    cerrarPrograma();
                    break;
                default:
                    consola.mostrarMensaje("Opción inválida. Digite de nuevo la opción a hacer:");
                    break;
            }
        } while (opcion != 3);
    }


    private void registrarEntrenamiento() {
        String pedirDiaRutina = consola.pedirDiaRutina();
        String pedirMusculosTrabajados = consola.pedirMusculosTrabajados();
        String pedirNotaEntrenamiento = consola.pedirNotaEntrenamiento();
        rutinaLogica.registrarEntrenamiento(pedirDiaRutina, pedirMusculosTrabajados, pedirNotaEntrenamiento);
        consola.mostrarMensaje("Entrenamiento registrado.");
    }

    // no se importa Rutina: tratamos cada elemento como Object (o ?)
    private void listarEntrenamiento() {
        List<?> lista = rutinaLogica.listarEntrenamiento(); // evita referenciar Rutina directamente
        if (lista == null || lista.isEmpty()) {
            consola.mostrarMensaje("No hay entrenamientos registrados.");
            return;
        }
        int i = 1;
        for (Object obj : lista) {
            // delegamos a toString() del objeto; no necesitamos conocer la clase Rutina aquí
            consola.mostrarMensaje(i + ". " + obj.toString());
            i++;
        }
    }

    private void cerrarPrograma() {
        consola.mostrarMensaje("Saliendo...");
        // Si quieres forzar salida: System.exit(0); — pero lo dejé controlado desde el flujo normal.
    }
}
