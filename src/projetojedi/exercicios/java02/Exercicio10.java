package projetojedi.exercicios.java02;
/*
Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
multiplicação
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer");
        int numero = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
