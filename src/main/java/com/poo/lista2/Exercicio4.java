package com.poo.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        String condicao, nome;
        int idade;

        System.out.println("Nome: ");
        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.println("Idade: ");
        idade = leia.nextInt();

        if(idade >= 16 && idade <= 18){
           System.out.println("Acesso somente acompanhado pelo responsável.");
        }
        else if(idade > 18){
           System.out.println("Acesso Liberado.");
        }
        else{
           System.out.println("Acesso Negado.");
        }

        leia.close();
   }     
}
