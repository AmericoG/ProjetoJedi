package projetojedi.exercicios.java02;
/*
Escreva um algoritmo que calcule a soma dos números de 1 a 15.
 */

public class Exercicio02 {
    public static void main(String[] args) {
        int o = 0;
        for (int i = 1; i <= 15; i++) {
            o += i;
            System.out.println(o);
        }
    }
}
