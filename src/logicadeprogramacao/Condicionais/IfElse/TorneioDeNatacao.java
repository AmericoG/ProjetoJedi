package logicadeprogramacao.Condicionais.IfElse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite seu nome");
        String nome = teclado.next();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
                if (idade < 11){
                    System.out.println(nome + " participará da categoria infantil");}
                else if (idade >= 11 & idade < 15) {
            System.out.println(nome + " participará da categoria juvenil");}
                else if (idade >= 15 & idade <18) {
                    System.out.println(nome + " participará da categoria pré-adulto");}
                else {
                    System.out.println(nome + " participará da categoria adulto");}
    }
}
