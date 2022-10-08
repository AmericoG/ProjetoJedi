package projetojedi.exercicios.java01;
/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade em anos, meses e dias");

        System.out.println("Em anos:");
        int anos = teclado.nextInt();

        System.out.println("Em meses:");
        int meses = teclado.nextInt();

        System.out.println("Em dias:");
        int dias = teclado.nextInt();

        int resultado = (anos * 365) + (meses * 30) + dias;
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias = " + resultado + " dias");
    }
}
