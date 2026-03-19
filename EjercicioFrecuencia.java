import java.util.ArrayList;
import java.util.Collections;

public class EjercicioFrecuencia {
    public static void main(String[] args) {

        // 1. Generar ArrayList con 100 números aleatorios entre 1 y 20
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int aleatorio = (int)(Math.random() * 20) + 1; // Entre 1 y 20
            lista.add(aleatorio);
        }

        System.out.println("Lista generada (100 números):");
        System.out.println(lista);

        // 2. Contar frecuencia de cada número del 1 al 20
        System.out.println("\n--- TABLA DE FRECUENCIAS ---");
        System.out.printf("%-10s %-15s%n", "Número", "Frecuencia");
        System.out.println("-------------------------");

        int maxFrecuencia = 0;
        int numeroMasFrecuente = 0;

        for (int num = 1; num <= 20; num++) {
            int frecuencia = Collections.frequency(lista, num);
            System.out.printf("%-10d %-15d%n", num, frecuencia);

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                numeroMasFrecuente = num;
            }
        }

        System.out.println("-------------------------");
        System.out.println("\n✔ Número más frecuente: " + numeroMasFrecuente +
                           " (aparece " + maxFrecuencia + " veces)");
    }
}