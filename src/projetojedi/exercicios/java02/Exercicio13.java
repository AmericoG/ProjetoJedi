package projetojedi.exercicios.java02;
/*
Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100.
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int o = 0;
        int[] numeros = new int[10];
        System.out.println("Digite 10 números inteiros quaisquer");
        for (int i = 0; i <= 9; i++) {
        numeros [i] = teclado.nextInt();
            if (numeros[i] > 0 && numeros[i] < 100) {
                o++;
            }
        }
        System.out.println(o + " Números estão entre 0 e 100");}
}