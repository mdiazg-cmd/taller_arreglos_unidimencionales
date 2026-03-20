import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio_6 {
    List<Integer> numerosAleatorios = new ArrayList<Integer>();
    Random random = new Random();
    int numeroRandom = 0;

    public void generarNumeroRandom() {
            numeroRandom = random.nextInt((10) - (-10)) + (-10);
            while(numeroRandom != 10){
                numerosAleatorios.add(numeroRandom);
                numeroRandom = random.nextInt((10) - (-10) + 1) + (-10);
            }
            numerosAleatorios.add(numeroRandom);
        System.out.println("Los numeros generados son: " + numerosAleatorios);
    }

    public void sumarNumeros() {
        int suma = 0;
        for(int i = 0; i < numerosAleatorios.size(); i++){
            suma += numerosAleatorios.get(i);
        }
        System.out.println("La suma de los numeros es: " + suma);
    }       

    public void promedioNumeros() {
        int suma = 0;
        for(int i = 0; i < numerosAleatorios.size(); i++){
            suma += numerosAleatorios.get(i);
        }
        double promedio = (double) suma / numerosAleatorios.size();
        System.out.println("El promedio de los numeros es: " + promedio);
    }   
}
