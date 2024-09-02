package com.poo.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
      
        String condicao,nome;
        int idade;

        System.out.println("Digite seu seu nome: ");
        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.println("É deficiente ou gestante: ");
        condicao = leia.nextLine();

        System.out.println("Idade do cliente: ");
        idade = leia.nextInt();

        if(idade > 65 || condicao.equalsIgnoreCase("gestante")|| condicao.equalsIgnoreCase("deficiente")){
           System.out.println("Fila Preferêncial");
        }
        else{
           System.out.println("Fila Comum");}


        leia.close();
    }
}
