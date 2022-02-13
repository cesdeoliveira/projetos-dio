package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe o maio rnúmero e a média desses números.
 */
public class MaiorEMedia {
    public static void main(String[] args) {
        int numero, maiorNum = 0,soma = 0;
        float media;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5;i++){
            System.out.println("Número "+(i+1)+": ");
            numero = scan.nextInt();
            soma += numero;
            if(maiorNum < numero) maiorNum = numero;
        }
        media = soma /5;
        System.out.println("O maior número é: "+maiorNum+" e a média dos números é: "+media);
    }
}
