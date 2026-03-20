public class numerosPrimos {

    public static void main(String[] args) {

        ListaPrimos lista = new ListaPrimos();
        lista.mostrarNumeros();

    }
}

class ListaPrimos {

    private int[] numeros = {2,3,5,7,11,13,17,19,23,29};

     public void mostrarNumeros() {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en índice " + i + " : " + numeros[i]);
        }

    }
}