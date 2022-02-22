package projetojedi.exercicios.java03;
/*
Escreva um algoritmo para ler o número total de eleitores de um município, o número
de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
representa em relação ao total de eleitores
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o total de eleitores");
        int totalEleitores = teclado.nextInt();
        System.out.println("Digite o total de votos em branco");
        int votosBrancos = teclado.nextInt();
        System.out.println("Digite o total de votos nulos");
        int votosNulos = teclado.nextInt();
        System.out.println("Digite o total de votos válidos");
        int votosValidos = teclado.nextInt();

        double porcVotosBrancos = (votosBrancos * 100) / totalEleitores;
        double porcVotosNulos = (votosNulos * 100) / totalEleitores;
        double porcVotosValidos = (votosValidos * 100) / totalEleitores;
        System.out.println("Total de eleitores: " + totalEleitores + "\n\nVotos brancos representam: " + porcVotosBrancos + "%" + "\nVotos Nulos representam: " +
                porcVotosNulos + "%" + "\nVotos Válidos representam: " + porcVotosValidos + "%");
    }
}
