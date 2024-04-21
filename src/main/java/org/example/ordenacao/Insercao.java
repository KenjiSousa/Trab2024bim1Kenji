package org.example.ordenacao;

public class Insercao extends Ordenacao {
    public static int[] ordenar(int[] listaOrig) {
        int[] lista = new int[listaOrig.length];
        System.arraycopy(listaOrig, 0, lista, 0, listaOrig.length);

        marcaInicio();

        int chave, j;
        for (int i = 1; i < lista.length; i++) {
            chave = lista[i];
            j = i - 1;

            while (j >= 0 && lista[j] > chave) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = chave;
        }

        marcaFim();

        return lista;
    }
}
