import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Inicializar ArrayList con los 20 primeros números pares
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            lista.add(i * 2); // 2, 4, 6, 8, ... 40
        }

        // 2. Imprimir el ArrayList original
        System.out.println("Lista original de pares:");
        System.out.println(lista);

        // 3. Leer un número e insertarlo en la posición correcta
        System.out.print("\nIngresa un número para insertar en orden: ");
        int numero = scanner.nextInt();

        int posicion = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (numero <= lista.get(i)) {
                posicion = i;
                break;
            } else {
                posicion = lista.size(); // Va al final si es mayor que todos
            }
        }
        lista.add(posicion, numero);
        System.out.println("\nLista después de insertar " + numero + " en posición " + posicion + ":");
        System.out.println(lista);

        // 4. Borrar un valor solicitado por el usuario
        System.out.print("\nIngresa un número para borrar de la lista: ");
        int borrar = scanner.nextInt();

        if (lista.contains(borrar)) {
            lista.remove(Integer.valueOf(borrar)); // remove por valor, no por índice
            System.out.println("\nLista después de borrar " + borrar + ":");
        } else {
            System.out.println("\nEl número " + borrar + " no está en la lista.");
            System.out.println("Lista sin cambios:");
        }
        System.out.println(lista);

        scanner.close();
    }
}