package projetojedi.conquista01;

/* Criar um código que compara valores iguais, maiores e menores para
 variáveis de tipos diferentes. Ex: int numero1 = 20; long numero2 = 20;
  numero1 == numero2. (utilizar: int, long, double, float e short)
*/
public class Exercicio06 {
    public static void main(String[] args) {
        short a = 10;
        int b = 20;
        long c = 15;
        float d = 17;
        double e = 4;

        System.out.println(a == b);
        System.out.println(c < d);
        System.out.println(d > e);
        System.out.println(d != c);
        System.out.println(c <= e);
        System.out.println(c >= d);
    }
}
