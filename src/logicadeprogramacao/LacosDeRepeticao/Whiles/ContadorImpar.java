package logicadeprogramacao.LacosDeRepeticao.Whiles;
/* Contador de número impar até o número que o usuario digitar*/
import java.util.Scanner;

public class ContadorImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite valor desejado: ");
        int numero = teclado.nextInt();
        int i = 0;
        while (i <= numero){
            if (i % 2 != 0 ){
                System.out.println(i);}
                ++i;}
    }
}
