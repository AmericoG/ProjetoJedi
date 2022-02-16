package logicadeprogramacao.LacosDeRepeticao.Fors;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int o = 1;
        System.out.println("Digite um número para saber a tabuada");
        for (int numero = teclado.nextInt(); o <=10;o++) {
            System.out.println(numero+"x"+o+" = "+numero*o);
        }
    }
}
