package projetojedi.exercicios.java01;
/*
Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de peças e o valor unitário de cada");
        System.out.println("Quantidade (Peça 1)");
        int quantidadePeca1 = teclado.nextInt();
        System.out.println("Valor unitário (Peça 1)");
        double valorPeca1 = teclado.nextDouble();
        System.out.println("Quantidade (Peça 2)");
        int quantidadePeca2 = teclado.nextInt();
        System.out.println("Valor unitário (Peça 2)");
        double valorpeca2 = teclado.nextDouble();
        final double ipi = 10;
        double resultadoTotal = (valorPeca1 * quantidadePeca1 + valorpeca2 * quantidadePeca2) * (ipi / 100 + 1);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Valor das peças + imposto = " + dec.format(resultadoTotal));
        System.out.println("Imposto a ser pago = " + (resultadoTotal - (valorPeca1 * quantidadePeca1 + valorpeca2 * quantidadePeca2)));
    }
}
