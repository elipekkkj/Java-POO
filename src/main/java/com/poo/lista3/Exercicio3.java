package com.poo.lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao(){

        int num1, num2;
        int pares;

        System.out.println("Digite o primeiro número: ");
        Scanner leia = new Scanner(System.in);
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();
        
        System.out.println("Numeros pares entre " + num1 + " e " + num2 + ": ");

        for (int i = num1; i <= num2; i++) {

            if(i % 2==0){
                System.out.println(i);
            }
        }
    }
}
