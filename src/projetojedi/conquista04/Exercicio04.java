package projetojedi.conquista04;

/*
Criar e inicializar um array de inteiros de tamanho 10. Criar também um fluxo que vai ler os dados desse array
 e ao final dizer quantos valores são pares e quantos são ímpares

 */
public class Exercicio04 {
    public static void main(String[] args) {
        int[] a = {2, 2, 4, 4, 5, 6, 7, 8, 9, 10};
        int impares = 0;
        int pares = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println(impares + " Números são impares e " + pares + " números são pares");
    }
}
