import java.util.Scanner;

public class maindos {
    public static void main(String[] args) {

        // Pedir el tamaño n al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño n de la matriz: ");
        int n = scanner.nextInt();
        scanner.close();

        // Crear matriz y ejecutar operaciones
        MatrizDos         matriz   = new MatrizDos(n);
        MatrizServiciodos servicio = new MatrizServiciodos();

        servicio.imprimirMatriz(matriz);

        int suma = servicio.calcularSumaDiagonalOpuesta(matriz);

        servicio.imprimirResultado(suma);
    }
}
