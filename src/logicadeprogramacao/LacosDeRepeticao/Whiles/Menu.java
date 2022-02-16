package logicadeprogramacao.LacosDeRepeticao.Whiles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1.Calcular Imposto");
            System.out.println("2.Calcular Salário");
            System.out.println("3.Sair");
            System.out.println("Digite 1,2 ou 3");
            opcao = teclado.nextInt();}
        System.out.println("Programa encerrado!");}
    }

