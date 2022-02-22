package projetojedi.exercicios.java02;
/*
Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
maiores do que 8
 */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int o = 0;
        int[] numeros = new int[20];
        System.out.println("Digite 20 números inteiros quaisquer");
        for (int i = 0; i <= 19; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i] > 8) {
                o++;
            }
        }
        System.out.println(o + " Números são maiores que 8");
    }
}