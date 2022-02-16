package logicadeprogramacao.exercicios;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer");
        long digitado = teclado.nextLong();
        long antecessor = digitado - 1;
        long sucessor = digitado + 1;
        System.out.println("Antecessor: "+antecessor +"\nSucessor: "+sucessor);
    }
}
