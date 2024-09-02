package com.poo.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){
        
       int numero;

        System.out.println("Digite um número: ");
        Scanner leia = new Scanner(System.in);
        numero = leia.nextInt();

        
        if(numero == 0){
            System.out.println("O número digitado e zero");
        }
        else if(numero%2==0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Número ímpar");
        }
    }
}
