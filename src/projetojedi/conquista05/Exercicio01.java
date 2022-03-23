package projetojedi.conquista05;
/*
Criar um array do tipo String de 10 posições e inicializar. Para cada iteração do for, o valor da posição deve ser concatenado ao valor da variável ex:
Nome
Nome nome
Nome nome casa

 */

public class Exercicio01 {
    public static void main(String[] args) {
        String[] a = {"Em","dezembro","de","81","botou","os","ingleses","na","roda","!!!"};
        String b = "";

        for (String i: a) {
            b += i + " ";
            System.out.println(b);
        }
    }
}
