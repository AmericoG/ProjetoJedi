package logicadeprogramacao.exercicios;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/* Desenvolva um rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4),
 e informe o status do aluno baseado na tabela abaixo:

Média Status

Se a média for menor que 5
REPROVADO
Se a média for igual a 5
RECUPERAÇÃO
Se a média for maior que 5
APROVADO
*/
public class MediaBimestres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as notas em cada bimestre.\n1º Bimestre:");
        double bm1 = teclado.nextDouble();
        System.out.println("2° Bimestre:");
        double bm2 = teclado.nextDouble();
        System.out.println("3° Bimestre:");
        double bm3 = teclado.nextDouble();
        System.out.println("4° Bimestre:");
        double bm4 = teclado.nextDouble();
        double media = (bm1+bm2+bm3+bm4)/4;
        System.out.println("Média: "+media);
        if (media < 5) {
            System.out.println("REPROVADO");}
        else if (media > 5) {
            System.out.println("APROVADO");}
        else if (media == 5) {
            System.out.println("RECUPERAÇÃO");}
    }
}
