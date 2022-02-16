package logicadeprogramacao.Condicionais.IfElse;

import java.util.Scanner;

public class CadastroDeAlistamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Qual é o seu sexo? \nM para masculino\nF para feminino");
        char sexo = teclado.next().charAt(0);
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        if ((sexo == 'f' || sexo == 'F')  & idade >= 18) {
            System.out.println("Deseja se alistar?");}
        else if ((sexo == 'f' || sexo == 'F' || sexo == 'm' || sexo == 'M')  & idade < 18) {
            System.out.println("Alistamento não permitido.");}
        else if ((sexo == 'm' || sexo == 'M') & idade >= 18) {
            System.out.println("Alistamento obrigatório.");}
    }
}