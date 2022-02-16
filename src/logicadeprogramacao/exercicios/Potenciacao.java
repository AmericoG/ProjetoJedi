package logicadeprogramacao.exercicios;
/* Fazer a leitura de um valor numérico inteiro e apresentar
 o valor do número elevado ao quadrado, ao cubo e a 10, apresentar
  também a soma total dos três resultados anteriores.
*/
public class Potenciacao {
    public static void main(String[] args) {
        final int numero = 2;
        double quadrado = Math.pow(numero,2);
        double cubo = Math.pow(numero,3) ;
        double elevado10 = Math.pow(numero,10);
        System.out.println("O resultado ao quadrado: "+quadrado);
        System.out.println("O resultado ao cubo: "+cubo);
        System.out.println("O resultado do numero elevado a 10: "+elevado10);
        System.out.println("A soma dos 3 resultados: "+(quadrado+cubo+elevado10));
    }
}
