package org.example.ordenacao;

public class Ordenacao {
    private static long inicio;
    private static long fim;

    protected static void marcaInicio() {
        inicio = System.currentTimeMillis();
    }

    protected static void marcaFim() {
        fim = System.currentTimeMillis();
    }

    public static long calculaTempo() {
        return fim - inicio;
    }
}
