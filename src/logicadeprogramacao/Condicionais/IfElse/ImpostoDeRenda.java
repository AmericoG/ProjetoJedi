package logicadeprogramacao.Condicionais.IfElse;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Qual é o seu salário?");
        double salario = teclado.nextDouble();
        if (salario <= 1903.98) {
            System.out.println("ISENTO");}
        else if (salario > 1903.98 & salario <= 2826.65) {
            System.out.println("Alíquota de 7,5% = "+ salario * 0.075);}
        else if (salario > 2826.65 & salario <= 3751.05) {
            System.out.println("Alíquota de 15% = "+ salario * 0.15);}
        else if (salario > 3751.05 & salario <= 4664.68) {
            System.out.println("Alíquota de 22,5% = "+ salario * 0.225);}
        else {
            System.out.println("Alíquota de 27,5% = "+ salario * 0.275);}
    }
}
