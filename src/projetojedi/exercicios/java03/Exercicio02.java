package projetojedi.exercicios.java03;
/*
Crie um algoritmo que receba 3 números e informe qual o maior entre eles.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maiorNumero = 0;
        int[] numeros = new int[3];
        System.out.println("Digite 3 números inteiros quaisquer");
        for (int i = 0; i < 3; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        System.out.println("Maior numero: " + maiorNumero);
    }
}
