import java.util.ArrayList;

public class GestorListaPares {

    private ArrayList<Integer> lista;

    public GestorListaPares() {
        this.lista = new ArrayList<>();
        inicializarPares();
    }

    private void inicializarPares() {
        for (int i = 1; i <= 20; i++) {
            lista.add(i * 2);
        }
    }

    public void insertarEnOrden(int numero) {
        int posicion = calcularPosicion(numero);
        lista.add(posicion, numero);
    }

    private int calcularPosicion(int numero) {
        for (int i = 0; i < lista.size(); i++) {
            if (numero <= lista.get(i)) {
                return i;
            }
        }
        return lista.size();
    }

    public boolean eliminarNumero(int numero) {
        return lista.remove(Integer.valueOf(numero));
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
}