package projetojedi.exercicios.java02;
/*
Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
números.
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numero = new double[10];
        double soma = 0;
        System.out.println("Digite 10 números quaisquer");
        for (int i = 0; i <= 9; i++) {
            numero[i] = teclado.nextDouble();
            soma += numero[i];
        }
        System.out.println("A soma dos números é = " + soma);
    }
}
