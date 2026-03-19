public class MainOrden {
    public static void main(String[] args) {

        // Se crea el objeto — internamente ya genera los 20 números
        ListaNumeros miLista = new ListaNumeros();

        System.out.println("Lista original:");
        System.out.println(miLista.getLista());

        System.out.println("\nLista ordenada de MENOR a MAYOR:");
        System.out.println(miLista.ordenarAscendente());

        System.out.println("\nLista ordenada de MAYOR a MENOR:");
        System.out.println(miLista.ordenarDescendente());

        System.out.println("\nNúmeros PARES:");
        System.out.println(miLista.obtenerPares());

        System.out.println("\nNúmeros IMPARES:");
        System.out.println(miLista.obtenerImpares());
    }
}