package logicadeprogramacao.exercicios;

import java.util.Scanner;

/* Desenvolver um programa que apresente e calcule o volume
 de uma caixa retangular, utilize a fórmula abaixo:

V=CxLxA
Onde:
	V = Volume em cm3
	C = Comprimento
	L = Largura
	A = Altura
*/
public class VolumeCaixa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double volume = 0;
        System.out.println("Digite o comprimento da caixa");
        double comprimento = teclado.nextDouble();
        System.out.println("Digite a largura da caixa");
        double largura = teclado.nextDouble();
        System.out.println("Digite a altura da caixa");
        double altura = teclado.nextDouble();
        volume = comprimento * largura * altura;
        System.out.println("O volume da caixa é: "+ volume);
    }
}
