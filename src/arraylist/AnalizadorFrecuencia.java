import java.util.ArrayList;
import java.util.Collections;

public class AnalizadorFrecuencia {

    private static final int TOTAL_NUMEROS = 100;
    private static final int RANGO_MIN = 1;
    private static final int RANGO_MAX = 20;

    private ArrayList<Integer> lista;

    public AnalizadorFrecuencia() {
        this.lista = new ArrayList<>();
        generarNumerosAleatorios();
    }

    private void generarNumerosAleatorios() {
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            lista.add(generarAleatorio(RANGO_MIN, RANGO_MAX));
        }
    }

    private int generarAleatorio(int min, int max) {
        return (int)(Math.random() * max) + min;
    }

    public int obtenerFrecuencia(int numero) {
        return Collections.frequency(lista, numero);
    }

    public int obtenerNumeroMasFrecuente() {
        int numeroMasFrecuente = RANGO_MIN;
        int maxFrecuencia = 0;

        for (int num = RANGO_MIN; num <= RANGO_MAX; num++) {
            int frecuencia = obtenerFrecuencia(num);
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                numeroMasFrecuente = num;
            }
        }
        return numeroMasFrecuente;
    }

    public int getRangoMin() { return RANGO_MIN; }
    public int getRangoMax() { return RANGO_MAX; }
    public ArrayList<Integer> getLista() { return lista; }
}