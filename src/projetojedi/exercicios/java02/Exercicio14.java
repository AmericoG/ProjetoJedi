package projetojedi.exercicios.java02;
/*
 Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200.

 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        int condicao1 = 0;
        int condicao2 = 0;
        int condicao3 = 0;
        for (int i = 0; i <= 19; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i] > 0 && numeros[i] < 100) {
                condicao1++;
            } else if (numeros[i] > 101 && numeros[i] < 200) {
                condicao2++;
            } else if (numeros[i] >= 200) {
                condicao3++;
            }
        }
        System.out.println(condicao1 + " Números estão entre 0 e 100\n" + condicao2 + " Números estão entre 101 e 200\n"
                + condicao3 + " Números são iguais ou maiores que 200");
    }
}