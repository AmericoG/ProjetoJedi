package projetojedi.exercicios.java03;
/*
Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja
calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção escolhida
pelo usuário e calcule a média.
1 -aritmética
2 -ponderada (pesos: 3,3,4)
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[3];
        double aritmetica;
        double ponderada;

        System.out.println("Digite 3 notas");
        notas[0] = teclado.nextDouble();
        notas[1] = teclado.nextDouble();
        notas[2] = teclado.nextDouble();
        aritmetica = (notas[0] + notas[1] + notas[2]) / 3;
        ponderada = (notas[0] * 3 + notas[1] * 3 + notas[2] * 4) / 10;

        System.out.println("Qual é o tipo de média desejado?\nDigite '1' para ARITMÉTICA\n" +
                "Digite '2' para PONDERADA");
        int mediaDesejada = teclado.nextInt();
        if (mediaDesejada == 1) {
            System.out.println("Média aritmética = " + aritmetica);
        } else if (mediaDesejada == 2) {
            System.out.println("Média ponderada = " + ponderada);
        } else {
            System.out.println("Tipo de média não reconhecido");
        }
    }
}