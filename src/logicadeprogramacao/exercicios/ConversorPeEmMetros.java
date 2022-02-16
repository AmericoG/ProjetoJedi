package logicadeprogramacao.exercicios;/*
Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm, desenvolva um programa que leia uma medida em pés
e calcule o equivalente em metros.*/

import java.util.Scanner;

public class ConversorPeEmMetros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a medida em ft (feet)");
        double digitado = teclado.nextDouble();
        double ftm = digitado * 0.3048;
        double ftcm = digitado * 30.48;
        System.out.println(digitado + "\nEm metros: " + ftm);
        System.out.println("Em centímetros: " +ftcm);
    }
}
