package exercicios;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};
        int[] inversoVetor = new int[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6;i++){

            inversoVetor[5-i] = vetor[i];
        }
        System.out.println("O vetor e seu inverso: ");
        for (int i = 0 ; i < 6 ; i++){
            System.out.println(vetor[i]+ " -> "+ inversoVetor[i]);
        }
    }
}