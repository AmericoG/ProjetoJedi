package projetojedi.exercicios.java02;
/*
Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado
 */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int o = 0;
        int[] numeros = new int[5];
        System.out.println("Digite 5 números inteiros positivos");
        for (int i = 0; i <= 4; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i] >= 0) {
                o += numeros[i];
                System.out.println("SOMA = " + o);
            } else {
                System.out.println("PROGRAMA ENCERRADO");
                break;
            }
        }
    }
}
