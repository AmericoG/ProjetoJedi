package projetojedi.conquista02;

/* Criar um código com uma estrutura SWITCH que verifica se o valor de uma
 variável é igual ao case (1, 2, 3). Os cases devem escrever quando o valor
  for igual ao seu próprio. Mostrando apenas a frase do case referente ao valor.
*/
public class Exercicio05 {
    public static void main(String[] args) {
        int i = 2;
        switch (i) {
            case 1:
                System.out.println("Igual ao caso 1");
                break;
            case 2:
                System.out.println("Igual ao caso 2");
                break;
            case 3:
                System.out.println("Igual ao caso 3");
                break;
            default:
                System.out.println("Deu errado");

        }
    }
}