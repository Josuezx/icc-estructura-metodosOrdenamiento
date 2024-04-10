import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosOrdenamientos metodos = new MetodosOrdenamientos();

        int[] numeros = {30,7,32,5,2};
        int opcion;

        do
        {
            System.out.println("MENU");
            System.out.println("1.Ordenamiento por seleccion");
            System.out.println("2.Ordenamineto por Inserccion");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    metodos.metodoSeleccion(numeros);
                    System.out.println("Ordenamineto por Seleccion:");
                    metodos.imprimirArreglo(numeros);
                    break;
                case 2:
                    metodos.insertionSort(numeros); 
                    System.out.println("Ordenamineto por Inserccion:");
                    metodos.imprimirArreglo(numeros);  
                    break;
                case 3:
                    System.out.println("Saliendo del programa....");
                    break;     
            
                default:
                    System.out.println("Opcion Incorrecta. Ingrese nuevamente: ");
                
            }
            
        }while(opcion !=3);

        scanner.close();
    }

}
