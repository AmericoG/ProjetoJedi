package logicadeprogramacao.Arrays.multidimensionais;

import java.util.Scanner;

public class MultiplicacaoDiagonalPrincipal {
    public static void main(String[] args) {
        int [][] array = new int[2][2];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
        System.out.println("Digite os valores da array");
        array [i][j] = teclado.nextInt();}
        }
        System.out.println("O valor da multiplicação entre os valores da diagonal principal é: "+(array[0][0] * array[1][1]));
    }
}
