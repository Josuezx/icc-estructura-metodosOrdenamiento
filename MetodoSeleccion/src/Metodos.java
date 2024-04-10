public class Metodos {

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


    //crea un metodo que reciva un arreglo de numero y lo imprima
    public void imprimir(int[] numeros)
    {
        for(int i=0; i<numeros.length; i++)
        {

            System.out.println(numeros[i]+ " - ");
        }

    }
    
}
