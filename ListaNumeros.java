import java.util.ArrayList;
import java.util.Collections;

public class ListaNumeros {

    private static final int CANTIDAD = 20;
    private static final int RANGO_MIN = 1;
    private static final int RANGO_MAX = 100;

    private ArrayList<Integer> lista;

    public ListaNumeros() {
        this.lista = new ArrayList<>();
        generarNumeros();
    }

    // SRP: generar números es responsabilidad propia
    private void generarNumeros() {
        for (int i = 0; i < CANTIDAD; i++) {
            lista.add(generarAleatorio(RANGO_MIN, RANGO_MAX));
        }
    }

    // DRY: fórmula centralizada, igual que en Ejercicio 2
    private int generarAleatorio(int min, int max) {
        return (int)(Math.random() * max) + min;
    }

    public ArrayList<Integer> ordenarAscendente() {
        ArrayList<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia);
        return copia;
    }

    public ArrayList<Integer> ordenarDescendente() {
        ArrayList<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia, Collections.reverseOrder());
        return copia;
    }

    // DRY: separar por condición — pares e impares comparten la misma lógica base
    private ArrayList<Integer> filtrarPorParidad(boolean queremosPares) {
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int num : lista) {
            boolean esPar = num % 2 == 0;
            if (esPar == queremosPares) {
                resultado.add(num);
            }
        }
        return resultado;
    }

    // KISS: los métodos públicos son simples y descriptivos
    public ArrayList<Integer> obtenerPares() {
        return filtrarPorParidad(true);
    }

    public ArrayList<Integer> obtenerImpares() {
        return filtrarPorParidad(false);
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
}