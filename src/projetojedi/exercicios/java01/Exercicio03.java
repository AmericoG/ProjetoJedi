package projetojedi.exercicios.java01;
//Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Exercicio03 {
    public static void main(String[] args) {

        double saldo = 100;
        final double reajuste = 1.01;

        System.out.println("Saldo reajustado = " + (saldo *= reajuste));
    }
}
