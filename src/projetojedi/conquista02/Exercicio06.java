package projetojedi.conquista02;
/* Criar um código com uma estrutura SWITCH que verifica se o valor
 de uma variável é igual ao case (a, b, c e default). O código deve executar
  apenas o default com a mensagem: “O valor não é compatível”.
*/
public class Exercicio06 {
    public static void main(String[] args) {
        int i = 10;
        switch (i) {
            case 2: {
                System.out.println("Igual ao case 1");
            }
            break;
            case 4: {
                System.out.println("Igual ao case 2");
            }
            break;
            case 6: {
                System.out.println("Igual ao case 3");
            }
            break;
            default: {
                System.out.println("O valor não é compatível");
            }
        }
    }
}