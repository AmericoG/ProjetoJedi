package logicadeprogramacao.exercicios;

import java.util.Scanner;

/* Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.
A = (pi)R^2

Onde:   A representa a área do círculo
  	    (pi) = 3.141592654
	    R = Raio do círculo (deve ser fornecido pelo usuário)
*/
public class Circunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double pi = 3.141592654;
        double area = 0;
        System.out.println("Digite o raio desejado");
        double raio = teclado.nextDouble();
        area = pi * (Math.pow(raio,2));
        System.out.println("A área da circunferência é: "+area);


    }
}
