package projetojedi.exercicios.java02;
/*
 Leia a idade de 20 pessoas e exiba a média das idades.
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        double media;
        int[] idade = new int[10];
        System.out.println("Digit a idade de 10 pessoas");
        for (int i = 0; i <= 9; i++) {
            idade[i] = teclado.nextInt();
            soma += idade[i];
        }
        media = soma / idade.length;
        System.out.println("SOMA DAS IDADES = " + soma);
        System.out.println("MÉDIA DAS IDADES = " + media);
    }
}
