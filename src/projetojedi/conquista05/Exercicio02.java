package projetojedi.conquista05;
/*
Criar um array de tipo inteiro de 100 posições que vai receber valores de 0 a 100. Inicializar esse valores usando um
 laço de Repetição. E utilizando o foreach, printar todos os valores multiplicando por 2.

 */

public class Exercicio02 {
    public static void main(String[] args) {
        int[] a = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i : a) {
            System.out.println(i + " X 2 = " + i * 2);
        }
    }
}
