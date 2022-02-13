package exercicios;

import java.util.Random;

/**
 * Gere e imprima uma matriz M 4x4 com os valores aleatórios entre 0 e 9.
 */
public class ArrayMultidimensionall {
    public static void main(String[] args) {
        geratriz();
    }
    private static void geratriz(){
        int[][] M = new int[4][4];
        Random random = new Random();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                M[i][j] = random.nextInt(9);
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

    }
}
