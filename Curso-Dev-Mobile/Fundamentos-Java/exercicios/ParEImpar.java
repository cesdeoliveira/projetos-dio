package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que peça N números inteiros, calucle  e mostre a quantidade de números pares e a quantidade de números ímpares.
 */
public class ParEImpar {
    public static void main(String[] args) {
        int quantidade, numero, pares = 0, impares = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos números deseja testar: ");
        quantidade = scan.nextInt();
        for (int i = quantidade; i>0; i--){
            System.out.println("Número "+(quantidade -i +1)+": ");
            numero = scan.nextInt();
            if(numero%2 == 0)pares++;
            else impares++;
        }
        System.out.println("Total de Pares: "+pares+" Total de Ímpares: "+impares);
    }
}
