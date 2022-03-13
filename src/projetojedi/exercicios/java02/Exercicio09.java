package projetojedi.exercicios.java02;
/*
Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
 */

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        int[] idades = new int[5];
        int idadePessoaMaisNova = 500;
        String nomePessoaMaisNova = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome e a idade de 5 pessoas");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "º Nome");
            nomes[i] = teclado.next();
            System.out.println((i + 1) + "ª Idade");
            idades[i] = teclado.nextInt();
            if (idades[i] < idadePessoaMaisNova) {
                idadePessoaMaisNova = idades[i];
                nomePessoaMaisNova = nomes[i];
            }
        }
        System.out.println("A pessoa mais nova é: " + nomePessoaMaisNova + "\nIdade: " + idadePessoaMaisNova + " anos");
    }
}
