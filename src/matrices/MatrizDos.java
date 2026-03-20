import java.util.Random;

public class MatrizDos {

    private int[][] datos;
    private int tamano;

    // Constructor: crea y rellena la matriz con números entre -50 y 50
    public MatrizDos(int tamano) {
        this.tamano = tamano;
        this.datos  = new int[tamano][tamano];
        rellenarAleatorio();
    }

    // Rellena cada celda: nextInt(101) genera 0..100, al restar 50 → -50..50
    private void rellenarAleatorio() {
        Random random = new Random();
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                datos[fila][columna] = random.nextInt(101) - 50;
            }
        }
    }

    public int[][] getDatos()  { return datos; }
    public int     getTamano() { return tamano; }
}