package com.poo.lista3;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        
/*6) Escreva um programa que seja capaz de desenhar uma retangulo de
asteriscos. O usuário deverá informar a largura e a altura que ele deseja que o
retangulo tenha.*/

        int largura;
        int altura;
        
        System.out.println("Altura: ");
        Scanner leia = new Scanner(System.in);
        altura = leia.nextInt();

        System.out.println("Largura: ");
        largura = leia.nextInt();
        
        for (int j = 0; j < altura; j++) {
            for (int i = 0; i < largura; i++) {
                System.out.print("*");
            }  
            System.out.println();
        }
    }
}