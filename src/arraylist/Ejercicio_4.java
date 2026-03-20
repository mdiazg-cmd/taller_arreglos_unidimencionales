import java.util.ArrayList;
import java.util.Random;

public class Ejercicio_4 {
    private ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
    private Random random = new Random();
    private int min;
    private int max;
    private int contador;

    public void generarNumeroRandom() {
        for (int i = 0; i < 25; i++) {
        int numero = random.nextInt((50) - (-50) + 1) + (-50);
        listaNumeros.add(numero);
        }
        System.out.println("Los numeros generados son: " + listaNumeros);
    }

    public void encontrarMayor() {
        contador = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (contador < listaNumeros.get(i)) {
                contador = listaNumeros.get(i);
                max = contador;
            }       
        }
        System.out.println("El numero mayor es: " + max);
    }

     public void encontrarMenor() {
        contador = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (contador > listaNumeros.get(i)) {
                contador = listaNumeros.get(i);
                min = contador;
                
            }       
        }
        System.out.println("El numero menor es: " + min);
    }
    
}