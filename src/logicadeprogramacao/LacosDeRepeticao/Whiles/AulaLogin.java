package logicadeprogramacao.LacosDeRepeticao.Whiles;

import java.util.Scanner;

public class AulaLogin {
    public static void main(String[] args) {
        final String login = "brz";
        final String password = "123ba";
        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.println("Digite seu login");
            String loginDigitado = teclado.next();
            System.out.println("Digite sua senha");
            String passwordDigitado = teclado.next();
            if (loginDigitado.equals (login) & passwordDigitado.equals (password)) {
                System.out.println("Login realizado com sucesso!");
            break;}
                System.out.println("Acesso negado");}
        System.out.println("Programa Finalizado");}
        }