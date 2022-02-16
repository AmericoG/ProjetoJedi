package logicadeprogramacao.Arrays.unidimensionais;

import java.util.Scanner;

public class ExercicioMultArraysAutomatico {
    public static void main(String[] args) {
        int [] a = new int[3];
        int [] b = new int[3];
        int [] c = new int[3];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Vetor 1, posição: " + i);
            a[i] = teclado.nextInt();}
        for (int i = 0; i < 3; i++) {
            System.out.println("Vetor 2, posição: "+i);
            b[i] = teclado.nextInt();}
        System.out.println("A multiplicação das posições correspondentes entre A e B é: ");
        for (int i = 0; i < 3; i++) {
            c[i] = a[i] * b[i];
            System.out.println("Posição"+ i+":  "+c[i]);
        }
    }
}
