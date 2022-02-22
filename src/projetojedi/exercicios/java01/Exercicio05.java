package projetojedi.exercicios.java01;
/*
Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário");
        double salarioUsuario = teclado.nextDouble();
        double salarioMinimo = 788;
        double resultado = salarioUsuario / salarioMinimo;
        DecimalFormat deci = new DecimalFormat("0.000");
        System.out.println(salarioUsuario + " reais equivalem a " + deci.format(resultado)+ " salários mínimos");
    }
}
