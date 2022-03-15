package projetojedi.conquista04;

/*
Criar e inicializar um array de 10 posições que vai receber 10 valores inteiros. Criar também um fluxo que vai ler o
 array e ao final exibir os seguintes dados:
Quantos valores são maiores que 15
Quantos valores são negativos
Quantos valores são múltiplos de 5
Qual a soma total dos valores

 */
public class Exercicio05 {
    public static void main(String[] args) {
        int[] a = {1, -2, -3, 4, 5, 30, 7, 17, 25, 10};
        int maiores15 = 0;
        int negativos = 0;
        int multiplos5 = 0;
        int somaValores = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 15) {
                maiores15++;
            }
            if (a[i] < 0) {
                negativos++;
            }
            if (a[i] % 5 == 0) {
                multiplos5++;
            }
            somaValores += a[i];
        }
        System.out.println(maiores15 + " Números são maiores que 15\n" + negativos + " Números são negativos\n" + multiplos5 +
                " Números são múltiplos de 5\n" + "A soma total dos valores é = " + somaValores);
    }
}
