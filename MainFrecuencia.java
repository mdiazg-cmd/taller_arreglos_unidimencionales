public class MainFrecuencia {

    public static void main(String[] args) {

        AnalizadorFrecuencia analizador = new AnalizadorFrecuencia();
        ReporteFrecuencias reporte = new ReporteFrecuencias(); // ✅ Nombre corregido

        System.out.println("Lista generada:");
        System.out.println(analizador.getLista());

        reporte.imprimirTablaFrecuencias(analizador);
        reporte.imprimirMasFrecuente(analizador);
    }
}