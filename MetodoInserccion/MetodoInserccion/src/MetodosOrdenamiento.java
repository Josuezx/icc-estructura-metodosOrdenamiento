public class MetodosOrdenamiento {


    public void insertionSort(int[] numeros){
        int tamano = numeros.length;
        for(int i = 1; i < tamano; i++)
        {
            //El elemento a comparar
            int elementoActual = numeros[i];
            int j = i-1;

            while (j >= 0 && numeros[j] > elementoActual) 
            {
                numeros[j+1] = numeros[j];
                j = j - 1;    
            }
            numeros[j+1] = elementoActual;
        }

        imprimirArreglo(numeros);
    }


    
    //metodo para imprimir un arreglo de int
    public void imprimirArreglo (int[] numeros){
        for(int i=0; i<numeros.length; i++)
        {

            System.out.println(numeros[i]);
        }
        System.out.println();
    }
    
}
