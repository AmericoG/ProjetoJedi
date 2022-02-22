package projetojedi.exercicios.java02;
/*
Leia a idade de 20 pessoas e exiba a soma das idades.
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] idade = new int[10];
        int soma = 0;
        System.out.println("Digite a idade de 10 pessoas");
        for (int i = 0; i <= 9; i++) {
            idade[i] = teclado.nextInt();
            soma += idade[i];
        }
        System.out.println("A soma das idades é = " + soma);
    }
}
