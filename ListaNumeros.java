import java.util.ArrayList;
import java.util.Collections;

public class ListaNumeros {

    // ATRIBUTO: la lista vive dentro del objeto
    private ArrayList<Integer> lista;

    // CONSTRUCTOR: cuando se crea el objeto, genera los 20 números automáticamente
    public ListaNumeros() {
        lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int aleatorio = (int)(Math.random() * 100) + 1;
            lista.add(aleatorio);
        }
    }

    // MÉTODO: retorna la lista original
    public ArrayList<Integer> getLista() {
        return lista;
    }

    // MÉTODO: retorna una nueva lista ordenada de menor a mayor
    public ArrayList<Integer> ordenarAscendente() {
        ArrayList<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia);
        return copia;
    }

    // MÉTODO: retorna una nueva lista ordenada de mayor a menor
    public ArrayList<Integer> ordenarDescendente() {
        ArrayList<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia, Collections.reverseOrder());
        return copia;
    }

    // MÉTODO: retorna solo los números pares de la lista
    public ArrayList<Integer> obtenerPares() {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }

    // MÉTODO: retorna solo los números impares de la lista
    public ArrayList<Integer> obtenerImpares() {
        ArrayList<Integer> impares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 != 0) {
                impares.add(num);
            }
        }
        return impares;
    }
}
