package projetojedi.conquista04;

/*
Criar um array de 10 posições de tipo inteiro que vai receber 10 valores. Criar também um segundo array de tipo
 String que vai receber o valor do primeiro multiplicado por 5 com a seguinte descrição: "O valor multiplicado por 5 é:"

 */
public class Exercicio02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        String[] numerosarray = new String[10];

        for (int i = 0; i < array.length ; i++) {
            numerosarray[i] = "O valor multiplicado por 5 é: " + (array[i] * 5);
            System.out.println(numerosarray[i]);
        }
    }
}
