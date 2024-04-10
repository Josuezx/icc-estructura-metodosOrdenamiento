import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //instanciar
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();

        int opcion;

        //opcion = scanner.nextInt();

        //System.out.println(opcion);
        do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Ingrese al metodo");
            System.out.println("2. Salir del programa");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    System.out.println("ingreso al metodo de ordenamiento inserccion");
                    int[] numeros = {30,7,32,5,2};
                    metodos.imprimirArreglo(numeros);
                    metodos.insertionSort(numeros);
                    break;
            
                case 0:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida, ingrese una opcion del menu:");
            }


        }while(opcion != 0);
        //cerrar scanner
        scanner.close();

    }
}
