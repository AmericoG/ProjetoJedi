package projetojedi.conquista04;

import java.util.Arrays;

/*
Criar dois arrays de tipo inteiro de tamanho 10 e inicializar os dois com valores diferentes. Criar também um terceiro
 array de 10 posições que vai receber como valor para cada posição a subtração do array A pelo array B.
C = A - B

 */
public class Exercicio03 {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10,12,14,16,18,20};
        int[] b = {0,1,3,2,4,6,7,9,8,12};
        int[] c = new int [10];

        for (int i = 0; i < 10; i++) {
            c[i] = a[i] - b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
