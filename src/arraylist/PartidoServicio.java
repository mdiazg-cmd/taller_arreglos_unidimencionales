

import java.util.ArrayList;
import java.util.Iterator; 

public class PartidoServicio {


    public void mostrarVictoriasVisitante(ArrayList<Partido> partidos) {

        System.out.println("\n========================================");
        System.out.println("  PARTIDOS GANADOS POR EL VISITANTE");
        System.out.println("========================================");

        boolean hayResultados = false; 

    
        for (Partido partido : partidos) {

        
            if (partido.ganoVisitante()) {
                System.out.println(partido);
                hayResultados = true;
            }
        }

        
        if (!hayResultados) {
            System.out.println("No se encontraron partidos.");
        }
    }

    public void contarVictoriasBarcelona(ArrayList<Partido> partidos) {

        final String BARCELONA = "Barcelona";

        int contador = 0; 

        for (Partido partido : partidos) {

            boolean barcelonaEsLocal     = partido.getEquipoLocal().equalsIgnoreCase(BARCELONA);
            boolean barcelonaEsVisitante = partido.getEquipoVisitante().equalsIgnoreCase(BARCELONA);

        
            if (barcelonaEsLocal && partido.ganoLocal()) {
                contador++;
            }

           
            if (barcelonaEsVisitante && partido.ganoVisitante()) {
                contador++;
            }
        }

        System.out.println("\n========================================");
        System.out.println("  VICTORIAS DEL BARCELONA");
        System.out.println("========================================");
        System.out.println("Barcelona ganó " + contador + " partido(s).");
    }

  
 
    public void eliminarNoEmpates(ArrayList<Partido> partidos) {


        ArrayList<Partido> soloEmpates = new ArrayList<>(partidos);

       
        Iterator<Partido> iterador = soloEmpates.iterator();

        while (iterador.hasNext()) {       
            Partido partido = iterador.next(); 

            if (!partido.esEmpate()) {     
                iterador.remove();         
            }
        }

        System.out.println("\n========================================");
        System.out.println("  PARTIDOS EN EMPATE (resto eliminado)");
        System.out.println("========================================");

        if (soloEmpates.isEmpty()) {
            System.out.println("No hubo empates.");
        } else {
            for (Partido partido : soloEmpates) {
                System.out.println(partido);
            }
        }
    }

  
    public void contarVictoriasLocal(ArrayList<Partido> partidos) {

        int contador = 0;

        for (Partido partido : partidos) {
            if (partido.ganoLocal()) { 
                contador++;
            }
        }

        System.out.println("\n========================================");
        System.out.println("  VICTORIAS DEL EQUIPO LOCAL");
        System.out.println("========================================");
        System.out.println("El equipo local ganó " + contador + " partido(s).");
    }
}