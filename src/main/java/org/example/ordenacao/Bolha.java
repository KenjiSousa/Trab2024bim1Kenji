package org.example.ordenacao;

public class Bolha extends Ordenacao {
    public static int[] ordenar(int[] listaOrig) {
        int[] lista = new int[listaOrig.length];
        System.arraycopy(listaOrig, 0, lista, 0, listaOrig.length);

        marcaInicio();

        int i, aux;
        int n = lista.length;
        boolean ordenado = false;

        while(!ordenado){
            ordenado = true;

            for(i = 0; i < n - 1; i++){
                if(lista[i] > lista[i + 1]){
                    aux = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = aux;
                    ordenado = false;
                }
            }
        }

        marcaFim();

        return lista;
    }
}
