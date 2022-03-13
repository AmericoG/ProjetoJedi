package projetojedi.conquista03;

/*
Criar um código que declara uma variável do tipo String com um nome qualquer que você quiser e dentro
 do for, contado até 10, o valor da variável deve ser concatenado a ela mesma sempre que encontrar um
 valor par na variável do índex.

Exemplo:
	1. Iteração: nome
	2. Iteração: nome, nome
	3. Iteração: nome, nome, nome
 */
public class Exercicio04 {
    public static void main(String[] args) {
        String nome = "jorgim";
        String concatenar = nome;
        for (int i = 1; i <= 10; ++i) {
            if (i % 2 == 0) {
                nome += ", " + concatenar;
                System.out.println(i + ". Iteração: " + nome);
            }
        }
    }
}
