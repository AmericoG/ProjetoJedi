package logicadeprogramacao.exercicios;
/* Elaborar um programa que calcule o fatorial de um número inteiro
*/

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer");
        long numero = teclado.nextLong();
        for (long i = numero; numero > 1 ; numero--) {i = i* (numero - 1);
            System.out.println(i);
        }
    }
}
