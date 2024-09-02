package com.poo.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao2() {
       
        int numero1, numero2;

        System.out.println("Digite um numero: ");
        Scanner leia = new Scanner(System.in);
        numero1=leia.nextInt();
        System.out.println("Digite outro numero: ");
        numero2=leia.nextInt();

        if(numero1 > numero2){
        System.out.println("Número 1 maior que número 2");
        }
        else if(numero1 < numero2){
           System.out.println("Número 1 menor que número 2");
        }
        else{
           System.out.println("Número 1 igual a número 2");
        }
       
       leia.close(); 
   }

}
