package logicadeprogramacao.LacosDeRepeticao.Whiles;

import java.util.Scanner;

public class GameDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int desejaContinuarJogando = 1;
        do {
            System.out.println("Digite um número de 1 a 5");
            System.out.println("Player 1: ");
            int num1 = teclado.nextInt();
            System.out.println("Player 2:");
            int num2 = teclado.nextInt();
            System.out.println("Acertou!" + (num2 == num1));
            System.out.println("------------------");
            System.out.println("Deseja continuar jogando?\n 1.SIM\n 2.NÃO");
            desejaContinuarJogando = teclado.nextInt();}
        while (desejaContinuarJogando == 1);
        System.out.println("Programa encerrado");
    }
}
