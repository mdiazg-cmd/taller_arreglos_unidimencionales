public class MatrizServiciodos {

    // Imprime la matriz en consola con columnas alineadas
    public void imprimirMatriz(MatrizDos matriz) {
        System.out.println("\n========================================");
        System.out.println("  MATRIZ " + matriz.getTamano()
                         + " x "      + matriz.getTamano());
        System.out.println("========================================");

        int[][] datos  = matriz.getDatos();
        int     tamano = matriz.getTamano();

        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.printf("%5d", datos[fila][columna]);
            }
            System.out.println();
        }
    }

    // Diagonal opuesta: fila i → columna (n - 1 - i)
    // Ejemplo n=4: [0][3], [1][2], [2][1], [3][0]
    public int calcularSumaDiagonalOpuesta(MatrizDos matriz) {
        int[][] datos  = matriz.getDatos();
        int     tamano = matriz.getTamano();
        int     suma   = 0;

        for (int fila = 0; fila < tamano; fila++) {
            int columnaOpuesta = tamano - 1 - fila;
            suma += datos[fila][columnaOpuesta];
        }
        return suma;
    }

    // Imprime el resultado de la sumatoria
    public void imprimirResultado(int suma) {
        System.out.println("\n========================================");
        System.out.println("  SUMATORIA DIAGONAL OPUESTA");
        System.out.println("========================================");
        System.out.println("Resultado: " + suma);
    }
}
