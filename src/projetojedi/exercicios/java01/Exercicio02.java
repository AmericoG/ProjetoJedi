package projetojedi.exercicios.java01;
/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
*/

public class Exercicio02 {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 7;
        double media1 = (a + b + c) / 3;
        System.out.println("Média 1 = " + media1);
        int d = 4;
        int e = 5;
        int f = 6;
        double media2 = (d + e + f) / 3;
        System.out.println("Média 2 = " + media2);
        double mediaTotal = (media1 + media2) / 2;
        System.out.println("Média das médias = " + mediaTotal);
    }
}
