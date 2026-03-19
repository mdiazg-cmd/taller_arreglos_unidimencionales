public class MainPares {

    public static void main(String[] args) {

        GestorListaPares gestor = new GestorListaPares();
        ConsolaHelper consola = new ConsolaHelper();

        // Imprimir lista original
        consola.imprimirLista("Lista original de pares:", gestor.getLista());

        // Insertar número en orden
        int numeroInsertar = consola.pedirNumero("\nIngresa un número para insertar en orden: ");
        gestor.insertarEnOrden(numeroInsertar);
        consola.imprimirLista("Lista después de insertar " + numeroInsertar + ":", gestor.getLista());

        // Eliminar número
        int numeroEliminar = consola.pedirNumero("\nIngresa un número para eliminar: ");
        boolean eliminado = gestor.eliminarNumero(numeroEliminar);

        if (eliminado) {
            consola.imprimirLista("Lista después de eliminar " + numeroEliminar + ":", gestor.getLista());
        } else {
            System.out.println("El número " + numeroEliminar + " no existe en la lista.");
        }

        consola.cerrar();
    }
}
