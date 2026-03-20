

public class MatrizServicio {

   
    public void imprimirMatriz(Matriz matriz) {

        System.out.println("\n========================================");
        System.out.println("  MATRIZ " + matriz.getTamano()
                         + " x " + matriz.getTamano());
        System.out.println("========================================");

        int[][] datos   = matriz.getDatos();
        int     tamano  = matriz.getTamano();

        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {

                
                System.out.printf("%5d", datos[fila][columna]);
            }
        }
    }

    
    
    public int calcularSumaDiagonalOpuesta(Matriz matriz) {

        int[][] datos   = matriz.getDatos();
        int     tamano  = matriz.getTamano();
        int     suma    = 0;

        for (int fila = 0; fila < tamano; fila++) {

            
            int columnaOpuesta = tamano - 1 - fila;

            suma += datos[fila][columnaOpuesta];
        }

        return suma;
    }

    
    public void imprimirResultado(int suma){
        System.out.println("\n========================================");
        System.out.println("  SUMATORIA DIAGONAL OPUESTA");
        System.out.println("========================================");
        System.out.println("Resultado: " + suma);
    }
}
