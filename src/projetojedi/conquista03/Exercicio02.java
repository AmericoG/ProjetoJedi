package projetojedi.conquista03;

import java.util.Scanner;

/*
Criar um código que pede para o usuário inserir um valor numérico de 1 a 10, e caso o valor digitado
 seja diferente desse intervalo, ele deve exibir uma mensagem pedindo para inserir o valor correto.
  O PROGRAMA NÃO PODE ENCERRAR ATÉ O USUÁRIO COLOCAR O VALOR CORRETO.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10");
        while (true) {
            int num = teclado.nextInt();
            if (num >= 1 && num <= 10) {
                System.out.println("Nice");
                break;
            } else {
                System.out.println("É de 1 a 10 po... ");
            }
        }
    }
}