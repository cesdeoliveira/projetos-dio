package exercicios;

import java.util.Random;

/**
 * Faça um programa que leia 20 números inteiros aleatórios entre 0 e 100. Armazene-os num vetor. Ao final mostre os números e seus sucessores.
 *
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        vetorSucessor(vetorRandom());
    }

    private static int[] vetorRandom(){
        Random random = new Random();
        int[] vetor = new int[20];
        for(int i = 0; i < 20 ;i++){
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i]+" ");
        }
        return vetor;
    }
    private static int  sucessor(int numero){
        int numeroSucessor = numero + 1;
        return numeroSucessor;
    }
    private static void vetorSucessor(int[] vetor){
        System.out.println();
        for(int i = 0; i < vetor.length; i++){
            System.out.print(sucessor(vetor[i])+" ");
        }
    }
}
