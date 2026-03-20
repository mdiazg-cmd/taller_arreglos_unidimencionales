import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio_5 {
    
    List<Integer> listaNumeros = new ArrayList<Integer>();
    List<Integer> listaInversa = new ArrayList<Integer>();
    Random random = new Random();
    int numeroRandom = 0;

    public void generarNumeroRandom() {
        for(int i = 0; i < 20; i++){
            numeroRandom = random.nextInt(50) + 1;
            listaNumeros.add(numeroRandom);
        }
        System.out.println("Los numeros generados son: " + listaNumeros);
    }

    public void listaInversa() {
        for(int i = listaNumeros.size() - 1; i >= 0; i--){
            listaInversa.add(listaNumeros.get(i));
        }
        System.out.println("La lista inversa es: " + listaInversa);
    }
}
    