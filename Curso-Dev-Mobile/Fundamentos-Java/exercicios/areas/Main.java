package exercicios.areas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lado1,lado2,altura;
        int opcao;
        System.out.println("Qual figura deseja calcular a área: \tQuadrado: 1\tRetângulo: 2\tTrapézio: 3");
        opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Lado: ");
                lado1 = sc.nextFloat();
                System.out.println("A área do Quadrado de Lado "+lado1+" é: "+Quadrilateros.area(lado1));
                break;
            case 2:
                System.out.println("Lado menor: ");
                lado1 = sc.nextFloat();
                System.out.println("Lado maior: ");
                lado2 = sc.nextFloat();
                System.out.println("A área do Retângulo de Lados "+lado1+" e "+lado2+" é: "+Quadrilateros.area(lado1,lado2));
                break;
            case 3:
                System.out.println("Base menor: ");
                lado1 = sc.nextFloat();
                System.out.println("Base maior: ");
                lado2 = sc.nextFloat();
                System.out.println("Altura: ");
                altura = sc.nextFloat();
                System.out.println("A área do Trapézio de Bases "+lado1+" e "+lado2+" com altura "+altura+" é: "+Quadrilateros.area(lado1,lado2,altura));
                break;
            default:
                System.out.println("Figura inválida!");
                break;
        }
    }
}
