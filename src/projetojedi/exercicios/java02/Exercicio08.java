package projetojedi.exercicios.java02;
/*
 Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
 */

public class Exercicio08 {
    public static void main(String[] args) {
        int o = 0;
        int[] idade = {4, 8, 9, 10, 45, 6, 63, 1, 2, 11, 98, 88, 47, 54, 50, 60, 23, 22, 19, 18};
        for (int i = 0; i <= 19; i++) {
            if (idade[i] >= 18) {
                o++;
            }
        }
        System.out.println("Número de pessoas maiores de idade: " + o);
    }
}