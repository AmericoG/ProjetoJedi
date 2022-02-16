package logicadeprogramacao.exercicios;
/*
Desenvolva uma calculadora de IMC (Índice de Massa Corporal), após realizado o cálculo classificar
o paciente de acordo com a tabela abaixo.
menor que 18,5	baixo peso
entre 18,5 e 24,9	intervalo normal
entre 25 e 29,9	sobrepeso
entre 30 e 34,9	obesidade classe I
entre 35 e 39,9	obesidade classe II
maior que 40	obesidade classe III

        Para realizar o cálculo de IMC utilize a fórmula abaixo:

        IMC=PESO/ALTURA^2*/
import java.util.Scanner;

public class CalculadoraDeImc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double altura = teclado.nextDouble();
        System.out.println("Digite o seu peso");
        double peso = teclado.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        System.out.println("O seu IMC é: "+imc);
        if (imc < 18.5) {
            System.out.println("Desnutrição");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade classe 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade classe 2");
        } else if (imc >= 40) {
            System.out.println("Obesidade mórbida");
        }
    }
}
