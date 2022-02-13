package exercicios;

import java.util.Scanner;

/* programa que calcula o fatorial de um número informado pelo usuário.
 */
public class Fatorial {
    public static void main(String[] args) {
        int fat = 1, num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Número: ");
        num = scan.nextInt();
        for (int i = num; i>0 ; i--){
            fat *= i;
        }
        System.out.println("O fatorial de "+num+" é: "+fat);
    }
}
