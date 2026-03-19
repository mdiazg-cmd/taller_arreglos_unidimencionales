import java.util.ArrayList;

public class GestorListaPares {

    private ArrayList<Integer> lista;

    // KISS + SRP: el constructor solo inicializa
    public GestorListaPares() {
        this.lista = new ArrayList<>();
        inicializarPares();
    }

    // DRY + SRP: la generación de pares tiene su propio método
    private void inicializarPares() {
        for (int i = 1; i <= 20; i++) {
            lista.add(i * 2);
        }
    }

    // SRP: un método, una responsabilidad — insertar en orden
    public void insertarEnOrden(int numero) {
        int posicion = calcularPosicion(numero);
        lista.add(posicion, numero);
    }

    // DRY: la lógica de buscar posición está separada y reutilizable
    private int calcularPosicion(int numero) {
        for (int i = 0; i < lista.size(); i++) {
            if (numero <= lista.get(i)) {
                return i;
            }
        }
        return lista.size();
    }

    // SRP: eliminar tiene su propio método
    public boolean eliminarNumero(int numero) {
        return lista.remove(Integer.valueOf(numero));
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
}