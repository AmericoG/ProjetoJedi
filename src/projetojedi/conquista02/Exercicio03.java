package projetojedi.conquista02;
/* Criar um código que verifica 3 vezes (IF) se o valor de uma variável é
 igual a um valor qualquer, não atendendo em nenhum momentos as 3 condições
  e finalizando o fluxo no ELSE
*/
public class Exercicio03 {
    public static void main(String[] args) {
        int i = 5;
        if (i<2) {
            System.out.println("Condição 1 verdadeira");}
        else if (i==2) {
            System.out.println("Condição 2 verdadeira");}
        else if(i>=10) {
            System.out.println("Condição 3 verdadeira");}
        else {
            System.out.println("Nenhuma condição é verdadeira");}
    }
}
