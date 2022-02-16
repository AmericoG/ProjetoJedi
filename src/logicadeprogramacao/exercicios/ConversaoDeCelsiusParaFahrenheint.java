package logicadeprogramacao.exercicios;

import java.util.Scanner;

/* Escreva um programa que realize a conversão de graus Celsius (C)
para graus Fahrenheit (F). Utilize a fórmula abaixo:

F = ( 9 x C) 5
*/
public class ConversaoDeCelsiusParaFahrenheint {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double fahrenheint = 0;
        System.out.println("Digite o valor em graus Celsius");
        double celsius = teclado.nextDouble();
        fahrenheint = ((celsius * 9/5)+32);
        System.out.println("O valor em Fahrenheint é: "+ fahrenheint);
    }
}
