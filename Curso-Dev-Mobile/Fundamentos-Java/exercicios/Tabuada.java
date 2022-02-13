package exercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número, o usuário invorma o número o qual deseja ver a tabuada.
 */
public class Tabuada {
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Gerar a tabuade de: ");
        numero = scan.nextInt();
        System.out.println("Tabuada de "+numero+":");
        for (int i=1 ; i<=10 ; i++){
            System.out.println(numero+" X "+i+" = "+(numero * i));
        }
    }
}
