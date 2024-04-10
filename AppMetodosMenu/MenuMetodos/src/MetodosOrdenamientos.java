public class MetodosOrdenamientos {
    
    public int[] insertionSort(int[] numeros){
        int tamano = numeros.length; //obtener tamano arreglo
        for(int i = 1; i < tamano; i++)
        {
            //El elemento a comparar
            int elementoActual = numeros[i];
            int j = i-1;

            while (j >= 0 && numeros[j] > elementoActual)
            {
                // Se desplaza el elemento en la posición j hacia la derecha (incrementando su índice en 1). 
                numeros[j+1] = numeros[j];
                //Se decrementa j en 1 para moverse hacia la izquierda en el arreglo 'numeros'.
                j = j - 1;    
            }
            //Se coloca el 'elementoActual' en la posición j+1 del arreglo numeros después de encontrar la posición adecuada.
            numeros[j+1] = elementoActual;
        }

        return numeros;
    }
    
    public int[] metodoSeleccion (int[]numeros)
    {
        int tamano = numeros.length;//obtener el tamano del arreglo
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
        return numeros;
    }

    public int[] metodoBurbuja (int[] arreglo,boolean logs)
    {
        int tamano = arreglo.length; //obtiene el tamano del arreglo
        //bucle externo que recorre todo el arreglo
        for (int i = 0; i < tamano - 1; i++) 
        {
            if (logs) {
            System.out.println("\nPasada numero: "+i);
            }
            //bucle interno que compara elemento actual con los siguientes
            for (int j = i+1 ; j < tamano ; j++) 
            {
                if (logs) {
                    System.out.println("i ="+arreglo[i] +" j="+arreglo[j]);    
                }
    
                if (arreglo[i] > arreglo[j]) 
                {
                    if (logs) {
                        System.out.println("Es mayor- cambio");    
                    }
                    // Intercambiar arr[i] y arr[j]
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    
                    if (logs) {
                    System.out.println(" ");
                    imprimirArreglo(arreglo);
                    }
                }
            }
        }


        return arreglo;
    }

    //metodo para imprimir un arreglo de int
    public void imprimirArreglo (int[] numeros)
    {

        for(int i=0; i<numeros.length; i++)
        {

            System.out.println(numeros[i]+ " ");
        }
        System.out.println();
    }
}
