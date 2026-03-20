import java.util.Random;

public class numerosEnteros {

    public static void main(String[] args) {

        GeneradorFactoriales generador = new GeneradorFactoriales(8);
        generador.procesar();

    }
}

class GeneradorFactoriales {

    private int[] numeros;
    private long[] factoriales;
    private Random random = new Random();

    public GeneradorFactoriales(int cantidad) {
        numeros = new int[cantidad];
        factoriales = new long[cantidad];
    }

    public void procesar() {
        generarNumeros();
        calcularFactoriales();
        mostrarResultados();
    }

    private void generarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(6) + 1;
        }
    }

    private void calcularFactoriales() {
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }
    }

    private long factorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    private void mostrarResultados() {

        System.out.println("Numeros:");
        for (int n : numeros) System.out.print(n + " ");

        System.out.println("\nFactoriales:");
        for (long f : factoriales) System.out.print(f + " ");
    }
}