public class MainPares {

    public static void main(String[] args) {

        GestorListaPares gestor = new GestorListaPares();
        EntradaConsola consola = new EntradaConsola(); // ✅ Nombre corregido

        consola.imprimirLista("Lista original de pares:", gestor.getLista());

        int numeroInsertar = consola.pedirNumero("\nIngresa un número para insertar en orden: ");
        gestor.insertarEnOrden(numeroInsertar);
        consola.imprimirLista("Lista después de insertar " + numeroInsertar + ":", gestor.getLista());

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
