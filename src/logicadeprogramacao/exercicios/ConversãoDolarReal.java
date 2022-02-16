package logicadeprogramacao.exercicios;

import java.util.Scanner;

public class ConversãoDolarReal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double dolarCotacao = 5.25;
        System.out.println("Digite o valor em dólar que deseja converter");
        double dolar = teclado.nextDouble();
        System.out.println("O valor "+dolar+" em dólar é igual a: "+(dolarCotacao *dolar)+" em real");
    }
}
