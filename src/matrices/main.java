import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Pedir el tamaño n al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño n de la matriz: ");
        int n = scanner.nextInt();
        scanner.close();

        // Crear la matriz de n x n con números aleatorios
        Matriz matriz = new Matriz(n);

        // Ejecutar las operaciones del servicio
        MatrizServicio servicio = new MatrizServicio();

        servicio.imprimirMatriz(matriz);

        int suma = servicio.calcularSumaDiagonalOpuesta(matriz);

        servicio.imprimirResultado(suma);
    }
}
