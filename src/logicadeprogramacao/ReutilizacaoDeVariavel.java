package logicadeprogramacao;

public class ReutilizacaoDeVariavel {
    public static void main (String [] angs){
        double salario = 2000;
        double resultado = salario * 0.3;
        System.out.println("30% é: " + resultado);
        resultado = salario * 0.15;
        System.out.println("15% é: " + resultado);
        resultado = salario * 0.05;
        System.out.println("5% é: " + resultado);
    }
}
