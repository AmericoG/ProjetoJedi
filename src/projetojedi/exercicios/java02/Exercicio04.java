package projetojedi.exercicios.java02;
/*
Leia o nome um número do usuário um número N e escreva o nome dele na tela N
vezes.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = teclado.next();
        System.out.println("Digite um número inteiro qualquer");
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(i + ". " + nome);
        }
    }
}
