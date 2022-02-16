package logicadeprogramacao.exercicios;

import java.util.Scanner;

/* Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:

V=(4x3)pi(R^3)

Onde:   V = Volume
        pi = 3.141592654
        R = Raio
*/
public class VolumeEsfera {
    public static void main(String[] args) {
        final double pi = 3.141592654;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do raio da esfera");
        double raio = teclado.nextDouble();
        System.out.println("O volume da esfera é: "+ (4 * pi * Math.pow(raio,3))/3);
    }
}
