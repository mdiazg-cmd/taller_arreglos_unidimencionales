
import java.util.Random;

public class Matriz {

    private int[][] datos;
    private int tamano;

    public Matriz(int tamano) {
        this.tamano = tamano;
        this.datos = new int[tamano][tamano];
        rellenarAleatorio();
    }

    private void rellenarAleatorio() {
        Random random = new Random();

        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                datos[fila][columna] = random.nextInt(101) - 50;
            }
        }
    }

    public int[][] getDatos() {
        return datos;
    }

    public int getTamano() {
        return tamano;
    }
}