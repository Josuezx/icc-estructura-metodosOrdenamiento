public class MetodosOrdenamientos {
    
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
    
    public void metodoSeleccion (int[]numeros)
    {
        int tamano = numeros.length;
        //System.out.println(tamano);

        for(int i = 0; i < tamano-1; i++)
        {
            //encontrar el menor
            int index_menor = i;

            for(int j = i+1; j<tamano; j++)
            {
                if (numeros[j]<numeros[index_menor]) 
                {
                    index_menor = j;
                }
            }
            //intercambiar el menor
            int aux = numeros[index_menor];
            numeros[index_menor] = numeros[i];
            numeros[i] = aux;

        }
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
