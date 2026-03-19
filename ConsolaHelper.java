import java.util.ArrayList;
import java.util.Scanner;

public class ConsolaHelper {

    private Scanner scanner;

    public ConsolaHelper() {
        this.scanner = new Scanner(System.in);
    }

    // DRY: imprimir lista se usa varias veces, un solo método
    public void imprimirLista(String titulo, ArrayList<Integer> lista) {
        System.out.println("\n" + titulo);
        System.out.println(lista);
    }

    public int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public void cerrar() {
        scanner.close();
    }
}