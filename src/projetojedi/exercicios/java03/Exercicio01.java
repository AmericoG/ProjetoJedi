package projetojedi.exercicios.java03;
/*
Crie um algoritmo que leia um número diferente de zero e diga se este número é
positivo ou negativo.
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("POSITIVO");
        } else if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NEUTRO");
        }
    }
}
