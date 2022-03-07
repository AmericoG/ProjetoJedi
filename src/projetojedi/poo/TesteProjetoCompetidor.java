package projetojedi.poo;

import java.util.Scanner;

public class TesteProjetoCompetidor {
    public static void main(String[] args) {
        Competidor novoCompetidor = new Competidor();
        String usuarioCriado = "";
        String senhaCriada = "";
        String usuarioDigitado = "";
        String senhaDigitada = "";
        int opcaoDesejadaMenu;
        String nomeDigitado;
        int idadeDigitada;
        char sexoDigitado;
        String cpfDigitado;
        double pesoDigitado;
        int procardDigitado;
        String nivelCategoria = "";
        String categoria = "";
        int categoriaDigitadaM;
        int categoriaDigitadaF;

        Scanner scan = new Scanner(System.in);

        System.out.println("Crie um nome de usuário");
        usuarioCriado = scan.next();

        System.out.println("Crie uma senha");
        senhaCriada = scan.next();

        Login login = new Login(usuarioCriado, senhaCriada);

        while (!usuarioDigitado.equals(login.getLogin()) && !senhaDigitada.equals(login.getSenha())) {
            System.out.println("Digite seu usuário");
            usuarioDigitado = scan.next();

            System.out.println("Digite sua senha");
            senhaDigitada = scan.next();

            if (usuarioDigitado.equals(usuarioCriado) && senhaDigitada.equals(senhaCriada)) {
                System.out.println("Login realizado!");
                break;
            } else {
                System.out.println("Usuário ou senha incorreta");
            }
        }

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Fazer inscrição para competir");
            System.out.println("2 - Ver dados de competidor");
            System.out.println("3 - Ver Modalidades disponíveis");
            System.out.println("4 - Sair");

            opcaoDesejadaMenu = scan.nextInt();

            switch (opcaoDesejadaMenu) {
                case 1:
                    System.out.println("-----CADASTRO-----");
                    System.out.println("Digite o seu nome:");
                    nomeDigitado = scan.next();

                    System.out.println("Digite a sua idade:");
                    idadeDigitada = scan.nextInt();

                    if (idadeDigitada < 18) {
                        System.out.println("Idade não permitida (apenas maiores de 18 anos)");
                        break;
                    }

                    do {
                        System.out.println("Digite o seu sexo:\nDigite 'M' para MASCULINO ou 'F' para FEMININO");
                        sexoDigitado = scan.next().charAt(0);
                    }
                    while (sexoDigitado != 'F' && sexoDigitado != 'f' && sexoDigitado != 'M' && sexoDigitado != 'm');

                    System.out.println("Digite o seu CPF:");
                    cpfDigitado = scan.next();

                    do {
                        System.out.println("Digite o seu peso:");
                        pesoDigitado = scan.nextDouble();
                    }
                    while (pesoDigitado <= 0);

                    if (sexoDigitado == 'M' || sexoDigitado == 'm') {
                        do {
                            System.out.println("------ Modalidades Masculinas ------");
                            System.out.println("Qual categoria deseja participar?");
                            System.out.println("1 - Men's Physique");
                            System.out.println("2 - BodyShape");
                            System.out.println("3 - Classic");
                            categoriaDigitadaM = scan.nextInt();

                            switch (categoriaDigitadaM) {
                                case 1:
                                    categoria = "Men's Physique";
                                    break;
                                case 2:
                                    categoria = "BodyShape";
                                    break;
                                case 3:
                                    categoria = "Classic";
                                    break;
                                default:
                                    System.out.println("Categoria inválida");
                                    break;
                            }
                        }
                        while (categoriaDigitadaM != 1 && categoriaDigitadaM != 2 && categoriaDigitadaM != 3);

                    } else {
                        do {
                            System.out.println("------ Modalidades Femininas ------");
                            System.out.println("Qual categoria deseja participar?");
                            System.out.println("1 - Bikini");
                            System.out.println("2 - Wellness");
                            System.out.println("3 - Bumbum na nuca");
                            categoriaDigitadaF = scan.nextInt();

                            switch (categoriaDigitadaF) {
                                case 1:
                                    categoria = "Bikini";
                                    break;
                                case 2:
                                    categoria = "Wellness";
                                    break;
                                case 3:
                                    categoria = "Bumbum na nuca";
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    break;
                            }
                        } while (categoriaDigitadaF != 1 && categoriaDigitadaF != 2 && categoriaDigitadaF != 3);
                    }

                    do {
                        System.out.println("Você possui ProCard?\nDigite 1 para 'SIM'\nDigite 2 para 'NÃO'");
                        procardDigitado = scan.nextInt();

                        switch (procardDigitado) {
                            case 1:
                                nivelCategoria = "Profissional";
                                System.out.println("Nível selecionado: " + nivelCategoria);
                                System.out.println("Cadastro finalizado!");
                                break;
                            case 2:
                                nivelCategoria = "Amador";
                                System.out.println("Nível selecionado: " + nivelCategoria);
                                System.out.println("Cadastro finalizado!");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    while (procardDigitado != 1 && procardDigitado != 2);

                    novoCompetidor = new Competidor(nomeDigitado, idadeDigitada, sexoDigitado, cpfDigitado, pesoDigitado,
                            categoria, nivelCategoria);
                    break;
                case 2:
                    novoCompetidor.dados();
                    break;

                case 3:
                    System.out.println("------ Modalidades Masculinas ------");
                    System.out.println("1 - Men's Physique");
                    System.out.println("2 - BodyShape");
                    System.out.println("3 - Classic");
                    System.out.println("\n------ Modalidades Femininas ------");
                    System.out.println("1 - Bikini");
                    System.out.println("2 - Wellness");
                    System.out.println("3 - Bumbum na nuca");

                    break;

                case 4:
                    System.out.println("Saindo...");
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        while (opcaoDesejadaMenu != 4);
    }
}