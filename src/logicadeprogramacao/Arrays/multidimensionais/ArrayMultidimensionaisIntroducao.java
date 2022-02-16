package logicadeprogramacao.Arrays.multidimensionais;

public class ArrayMultidimensionaisIntroducao {
    public static void main(String[] args) {
        int [][] multiArray = new int[2][3];
        multiArray [0][0] = 1;
        multiArray [0][1] = 2;
        multiArray [0][2] = 1;
        multiArray [1][0] = 3;
        multiArray [1][1] = 3;
        multiArray [1][2] = 7;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println("["+i+"] ["+j+"] = "+multiArray [i][j]);
                /* OBS: o for com a variavel "i" representa o número de posições da base, o for com
                * a variavel "j" representa o número de posições dos arrays. Nesse caso, como o número
                * de posições dos arrays é maior que o número de posições da base, "j" deve ser menor que
                * multiArray[i].lenght (pois representa o alcance do array enquanto o nº de posições da base
                * for "i". */
            }
        }
    }
}
