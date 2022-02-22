package projetojedi.exercicios.java01;
/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
*/

public class Exercicio02 {
    public static void main(String[] args) {
        int[] nums1 = {8, 9, 7};
        double media1 = (nums1[0] + nums1[1] + nums1[2]) / 3;
        System.out.println("Média 1 = " + media1);
        int[] nums2 = {4, 5, 6};
        double media2 = (nums2[0] + nums2[1] + nums2[2]) / 3;
        System.out.println("Média 2 = " + media2);
        double mediaTotal = (media1 + media2) / 2;
        System.out.println("Média das médias = " + mediaTotal);
    }
}
