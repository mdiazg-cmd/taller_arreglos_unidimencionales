public class MainOrden {

    public static void main(String[] args) {

        ListaNumeros lista = new ListaNumeros();
        ReporteListaNumeros reporte = new ReporteListaNumeros();

        reporte.mostrarLista("Lista original:", lista.getLista());
        reporte.mostrarLista("Ordenada de MENOR a MAYOR:", lista.ordenarAscendente());
        reporte.mostrarLista("Ordenada de MAYOR a MENOR:", lista.ordenarDescendente());
        reporte.mostrarLista("Números PARES:", lista.obtenerPares());
        reporte.mostrarLista("Números IMPARES:", lista.obtenerImpares());
    }
}
