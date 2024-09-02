package com.poo.lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        
        String nome;
        double nota1, nota2, media;
        double menorNota, recuperacao, mediaRecuperacao;
        
        System.out.println("Nome do aluno:");
        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.println("Nota 1: ");
        nota1 = leia.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = leia.nextDouble();

        media = (nota1+nota2)/2;
        if(media >= 6){
           System.out.println("Aprovado!!!");
        }
        else{
           System.out.println("Recuperação.");
           menorNota = (nota1<nota2)? nota1:nota2;
           System.out.println("Insira a nota da recuperação: ");
           recuperacao = leia.nextDouble();
           mediaRecuperacao = (recuperacao + Math.max(nota1,nota2)/2);
           if(mediaRecuperacao>=6){
               System.out.println("Aprovado!");
           }
           else{
               System.out.println("Reprovado.");
           }
        }
   leia.close();
   
    }     
}
