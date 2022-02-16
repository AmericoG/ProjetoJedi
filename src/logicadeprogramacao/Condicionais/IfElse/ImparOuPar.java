package logicadeprogramacao.Condicionais.IfElse;

public class ImparOuPar {
    public static void main(String[] args) {
        long numero = 21;
        if (numero % 2 == 0){ /* 1) se lê: Se (if) o resto da divisão por 2 (% 2) for igual a 0 (== 0)
                                 2) Usa-se o sinal de "igual" 2 vzs (==) pois o = apenas umas vez é atribuição
                                 e não comparação */
            System.out.println("é par");}
        else {
            System.out.printf("é impar");}
    }
}
