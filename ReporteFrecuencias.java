public class ReporteFrecuencias {

    public void imprimirTablaFrecuencias(AnalizadorFrecuencia analizador) {
        System.out.println("\n--- TABLA DE FRECUENCIAS ---");
        System.out.printf("%-10s %-15s%n", "Número", "Frecuencia");
        System.out.println("----------------------------");

        for (int num = analizador.getRangoMin(); num <= analizador.getRangoMax(); num++) {
            System.out.printf("%-10d %-15d%n", num, analizador.obtenerFrecuencia(num));
        }

        System.out.println("----------------------------");
    }

    public void imprimirMasFrecuente(AnalizadorFrecuencia analizador) {
        int numero = analizador.obtenerNumeroMasFrecuente();
        int frecuencia = analizador.obtenerFrecuencia(numero);
        System.out.println("\nNúmero más frecuente: " + numero + " (aparece " + frecuencia + " veces)");
    }
}