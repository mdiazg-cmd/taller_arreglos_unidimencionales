public class main {
    public static void main(String[] args) throws Exception {
        Ejercicio_4 NumeroRandom = new Ejercicio_4();
        Ejercicio_5 ListaInversa = new Ejercicio_5();
        NumeroRandom.generarNumeroRandom();
        NumeroRandom.encontrarMayor();
        NumeroRandom.encontrarMenor();
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("");
        ListaInversa.generarNumeroRandom();
        ListaInversa.listaInversa();
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("");
        Ejercicio_6 ListaAleatoria = new Ejercicio_6();
        ListaAleatoria.generarNumeroRandom();
        ListaAleatoria.sumarNumeros();
        ListaAleatoria.promedioNumeros();
    }
}
