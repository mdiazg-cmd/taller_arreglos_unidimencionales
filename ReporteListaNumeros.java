import java.util.ArrayList;

public class ReporteListaNumeros {

    // DRY: un solo método para imprimir cualquier lista con su título
    public void mostrarLista(String titulo, ArrayList<Integer> lista) {
        System.out.println("\n" + titulo);
        System.out.println(lista);
    }
}