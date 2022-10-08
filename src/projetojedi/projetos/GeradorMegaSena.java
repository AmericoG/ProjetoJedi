package projetojedi.projetos;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GeradorMegaSena {

    static Scanner scan = new Scanner(System.in);
    static int num;
    static Set<Integer> jogo = new TreeSet<>();
    static Random random = new Random();

    public static void main(String[] args) {

        boolean sistema = true;

        while (sistema) {

            System.out.println("----- Gerador da Mega Sena -----");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println("1.Gerar jogo com quaisquer números");
            System.out.println("2.Gerar jogo apenas com números IMPARES");
            System.out.println("3.Gerar jogo apenas com números PARES");
            System.out.println("4.Encerrar programa");

            String opcaoDesejada = scan.nextLine();

            switch (opcaoDesejada) {

                case "1":
                    qualquerNumero();
                    break;
                case "2":
                    apenasImpares();
                    break;
                case "3":
                    apenasPares();
                    break;
                case "4":
                    System.out.println("Encerrando...");
                    sistema = false;
                    break;
                default:
                    System.out.println("Opção não reconhecida");
            }

        }

    }

    public static void qualquerNumero() {
        jogo.clear();

        for (int i = 0; i < 30; i++) {
            jogo.add(1 + random.nextInt(60));
        }
        System.out.println(jogo);
    }

    public static void apenasImpares() {
        jogo.clear();

        for (int i = 0; i < 30; ) {
            num = 1 + random.nextInt(60);
            if (num % 2 != 0 && jogo.add(num)) i++;
        }
        System.out.println(jogo);
    }

    public static void apenasPares() {
        jogo.clear();

        for (int i = 0; i < 30; ) {
            num = 1 + random.nextInt(60);
            if (num % 2 == 0 && jogo.add(num)) i++;
        }
        System.out.println(jogo);
    }
}
