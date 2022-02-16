package logicadeprogramacao.Condicionais.SwitchCase;

import java.util.Scanner;

public class ContasBancosSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String conta = teclado.next();
        switch (conta) {
            case "CONTAPOUPANCA":
                System.out.println("0.05%");
            break;
            case "CONTACORRENTE":
                System.out.println("0.02%");
            break;
            case "CONTAINVESTIMENTO":
                System.out.println("0.1%");
            break;
            default:
                System.out.println("Conta inexistente");
        }

    }
}
