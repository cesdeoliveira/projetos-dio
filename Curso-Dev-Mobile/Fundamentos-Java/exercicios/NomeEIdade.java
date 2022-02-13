package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (pare inserindo o valor - no campo nome)
 */
public class NomeEIdade {
    public static void main(String[] args) {
        String nome = null;
        int idade;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
    }
}
