package com.poo.lista4;

public class Exercicio4 {
    public static void resolucao(){
        int lista[] = {3,5,6,7,8,10,22,55,110,133,166,185,210,235,320,324,444};

        for (int i = 0; i <= 16 ; i++) {
            if (lista[i] % 2 == 0) {
                System.out.println(lista[i]);
            }
        }
    }
}
