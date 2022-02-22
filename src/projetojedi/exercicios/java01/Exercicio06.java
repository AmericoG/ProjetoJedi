package projetojedi.exercicios.java01;
/*
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer");
        int numero = teclado.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        System.out.println("Numero: "+numero+"\nSucessor = " + sucessor + "\nAntecessor = " + antecessor);
    }
}
