package com.poo.lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() throws InterruptedException{
    
    int andar;
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o número de andares desejado: ");
        andar = leia.nextInt();

        for (int i = 0; i <= andar; i++) {
            for(int j = 0; j < andar - i; j++){
                System.out.println(" ");
            }
        for (int k = 0; k < (2 * i - 1); k++) {
            System.out.println("*");
            }
            System.out.println();
        }
    }
}
