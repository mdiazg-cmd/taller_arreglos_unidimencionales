public class numerosPares {

    private static final int cantidad = 100;
    private static final int lineas = 10;

    private static int[] generarPares() {
        int[] pares = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            pares[i] = (i + 1) * 2;
        }
        return pares;
    }

    private static void imprimirEnUnaLinea(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) sb.append(", ");
        }
        System.out.println(sb);
    }

    private static void imprimirEn10Lineas(int[] arreglo) {
        int porLinea = cantidad / lineas;
        for (int linea = 0; linea < lineas; linea++) {
            System.out.print("Línea " + (linea + 1) + ": ");
            System.out.println(construirLinea(arreglo, linea * porLinea, porLinea));
        }
    }

    private static String construirLinea(int[] arreglo, int inicio, int cantidad) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            sb.append(arreglo[inicio + i]);
            if (i < cantidad - 1) sb.append(", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] pares = generarPares();
        System.out.println("=== En una sola línea ===");
        imprimirEnUnaLinea(pares);
        System.out.println("\n=== En 10 líneas ===");
        imprimirEn10Lineas(pares);
    }
}