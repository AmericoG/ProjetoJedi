package logicadeprogramacao.Arrays.unidimensionais;

import java.util.Scanner;

public class ArrayAutomaticoFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas= new double[5];
        double media = 0;
        for (int i = 0; i <notas.length; i++) {
        System.out.println("Digite a nota "+(i+1));
        notas[i]= teclado.nextDouble();}

        for (int i = 0; i < notas.length ; i++) {
            media = media +notas[i];
            System.out.println("Nota " + (i+1) +": " +notas[i]);
        }
        System.out.println("Média das notas: "+media/5);
    }
}
