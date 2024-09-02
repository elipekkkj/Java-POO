package com.poo.lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        
         String login ="Luis2123";
         String senha ="Luis123";
         String verificaLogin;
         String verificaSenha;

         System.out.println("Login: ");
         Scanner leia = new Scanner(System.in);
         verificaLogin = leia.nextLine();

         System.out.println("Senha: ");
         verificaSenha = leia.nextLine();

         if(!verificaLogin.equals(login)){
            System.out.println("Login incorreto!");
         }
         else if (!verificaSenha.equals(senha)){
            System.out.println("Senha incorreta!");
         }
         else{
            System.out.println("Bem vindo ao sistema!");
         }
         
    leia.close();    
    }
}