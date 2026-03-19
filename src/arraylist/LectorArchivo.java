

import java.io.BufferedReader;    
import java.io.FileReader;
import java.io.IOException;       
import java.util.ArrayList;       

public class LectorArchivo {


    public ArrayList<Partido> leerPartidos(String ruta) {

        ArrayList<Partido> partidos = new ArrayList<>();


        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {

            String linea;

        
            while ((linea = lector.readLine()) != null) {

                

                
                Partido partido = parsearLinea(linea);


                partidos.add(partido);
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return partidos; 
    }

    
    private Partido parsearLinea(String linea) {

        
        String[] partes = linea.split("::");

        String equipoLocal      = partes[0].trim(); // .trim() quita espacios extra
        String equipoVisitante  = partes[1].trim();
        int    golesLocal       = Integer.parseInt(partes[2].trim()); // texto → número
        int    golesVisitante   = Integer.parseInt(partes[3].trim());

        return new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
    }
}
