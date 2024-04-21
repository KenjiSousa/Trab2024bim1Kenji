package org.example.ordenacao;

public class Selecao extends Ordenacao {
    public static int[] ordenar(int[] listaOrig) {
        int[] lista = new int[listaOrig.length];
        System.arraycopy(listaOrig, 0, lista, 0, listaOrig.length);

        marcaInicio();

        int j, menorElem, aux;
        int n = lista.length;

        for (int i = 0; i < n - 1; i++) {
            menorElem = i;
            for (j = i + 1; j < n; j++) {
                if (lista[j] < lista[menorElem])
                    menorElem = j;
            }

            if (menorElem != i) {
                aux = lista[menorElem];
                lista[menorElem] = lista[i];
                lista[i] = aux;
            }
        }

        marcaFim();

        return lista;
    }
}
