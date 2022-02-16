package logicadeprogramacao.exercicios;
/* Elaborar uma rotina que apresente todos os números pares na faixa de 0 até 100.*/

public class ParesZeroACem {
    public static void main(String[] args) {
        System.out.println("Pares de 0 a 100:");
        for (int i = 0; i < 101; i++) {if (i % 2 == 0){
            System.out.println(i);}
        }
    }
}
