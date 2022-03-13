package projetojedi.conquista02;

/* Criar um código que verifica 3 vezes (IF) se o valor de uma variável
 é igual a um valor qualquer, sendo atendida na segunda condição, não
  executando a terceira e nem um ELSE
 */
public class Exercicio04 {
    public static void main(String[] args) {
        int i = 6;
        if (i == 43) {
            System.out.println("Condição 1 verdadeira");
        } else if (i > 2) {
            System.out.println("Condição 2 verdadeira");
        } else if (i == 0) {
            System.out.println("Condição 3 verdadeira");
        } else {
            System.out.println("Nenhuma condição é verdadeira");
        }
    }
}
