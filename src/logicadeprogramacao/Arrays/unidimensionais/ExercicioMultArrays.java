package logicadeprogramacao.Arrays.unidimensionais;

public class ExercicioMultArrays {
    public static void main(String[] args) {
        int[] a = {1,6,4};
        int [] b = {4,7,9};
        int[] c = {a[0]*b[0],a[1]*b[1],a[2]*b[2]};
        System.out.println("A multiplicação é: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(c[i]);
        }
    }
}


