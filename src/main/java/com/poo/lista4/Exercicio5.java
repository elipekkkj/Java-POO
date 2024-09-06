package com.poo.lista4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicio5 {
    public static void resolucao() throws InterruptedException {

        Scanner leia = new Scanner(System.in);
        int opcao;
        ArrayList<String> lista = new ArrayList<>();
        
        do {
            
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            
        
            switch (opcao) {
                case 1: 
                    System.out.println("Insira o item desejado: ");
                    String item = leia.nextLine();
                    lista.add(item);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Item adicionado com sucesso!");
                    TimeUnit.SECONDS.sleep(2);
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Lista está vazia !");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                    }else{
                    System.out.println("----------- Lista -----------");
                    }
                    for(String i : lista)
                    System.out.println("- " + i);
                    break;
                default:
                System.out.println("Programa Encerrado !");
                System.exit(0);
                    break;
            }
        } while (opcao != 3);
    }
}