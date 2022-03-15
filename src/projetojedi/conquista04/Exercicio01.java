package projetojedi.conquista04;
/*
Criar um código que inicializa um array com 5 valores e também um segundo array que vai receber os mesmo valores
do primeiro utilizando atribuição. B[0] = A[0]. Deve se usar um laço de Repetição e não atribuir de forma direta
os valores.
 */

import java.util.Arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b =  new int [5];

        for (int i = 0; i < a.length ; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
