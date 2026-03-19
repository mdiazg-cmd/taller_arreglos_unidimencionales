import java.util.ArrayList;
import java.util.Scanner;

public class EntradaConsola {

    private Scanner scanner;

    public EntradaConsola() {
        this.scanner = new Scanner(System.in);
    }

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