package projetojedi.exercicios.java03;
/*
Escrever um algoritmo que lê um valor inteiro, calcula o fatorial desse número e
mostra o resultado.

 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        System.out.println("Digite um valor inteiro qualquer");
        int numero = teclado.nextInt();
        for (i = numero; numero > 2; numero--) {
            i *= (numero - 1);
        }
        System.out.println("Fatorial = " + i);
    }
}
