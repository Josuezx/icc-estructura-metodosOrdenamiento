public class App {
    public static void main(String[] args) throws Exception {

        Metodos metodosClase = new Metodos();
        int [] numeros = {10,15,3,5,1};

        //metodosClase.imprimir(numeros);

        metodosClase.metodoSeleccion(numeros);
        metodosClase.imprimir(numeros);

    }
}
