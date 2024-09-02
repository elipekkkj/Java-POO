package com.poo.lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao2() {
        
        double numero1, numero2;
        
        System.out.println("Digite um número: ");
        Scanner leia = new Scanner(System.in);
        numero1 = leia.nextInt();

        System.out.println("Digite outro número: ");
        numero2 = leia.nextInt();

        if(numero1%numero2 == 0){
           System.out.println("Número "+numero1+" é divisivel por "+numero2);
        }
        else if(numero2%numero1 == 0){
           System.out.println("Número "+numero1+" é divisivel por "+numero2);
        }
        else{
           System.out.println("Números informados não são divisiveis.");
        }

   leia.close();
   }
}
