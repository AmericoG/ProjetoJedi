package logicadeprogramacao.LacosDeRepeticao.Whiles;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int i = teclado.nextInt();
        int contador = 0;
        while (contador <= i) {
            System.out.println("Contador: "+contador);
           ++contador;
        }
    }
}
