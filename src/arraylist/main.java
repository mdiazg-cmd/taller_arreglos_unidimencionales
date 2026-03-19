

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

      
        LectorArchivo lector  = new LectorArchivo();
        ArrayList<Partido> partidos = lector.leerPartidos("PartidoLiga.txt");

       
        if (partidos.isEmpty()) {
            System.out.println("No se encontraron partidos en el archivo.");
            return; 
        }

        
        PartidoServicio servicio = new PartidoServicio();

        servicio.mostrarVictoriasVisitante(partidos);   // punto 1
        servicio.contarVictoriasBarcelona(partidos);    // punto 2
        servicio.eliminarNoEmpates(partidos);           // punto 3
        servicio.contarVictoriasLocal(partidos);        // punto 4
    }
}



