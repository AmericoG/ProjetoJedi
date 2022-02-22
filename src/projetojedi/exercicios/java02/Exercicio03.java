package projetojedi.exercicios.java02;
/*
 Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = teclado.next();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + nome);
        }
    }
}
