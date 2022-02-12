package exercicios.calculadora;

import java.util.Scanner;

/**
 * Enunciado da questão: Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("Qual operação deseja realizar: \tSoma: 1\tSubtração: 2\tMultiplicação: 3\tDivisão: 4");
        System.out.println("Opção: ");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                soma();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }
    private static void soma(){
        float a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os números a serem somados:");
        System.out.println("A = ");
        a = sc.nextFloat();
        System.out.println("B = ");
        b = sc.nextFloat();
        sum = a + b;
        System.out.println("A + B = " + sum);
    }
    private static void subtracao(){
        float a,b,sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os números a serem subtraídos:");
        System.out.println("A = ");
        a = sc.nextFloat();
        System.out.println("B = ");
        b = sc.nextFloat();
        sub = a - b;
        System.out.println("A - B = " + sub);
    }
    private static void multiplicacao(){
        float a,b,mult;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os números a serem multiplicados:");
        System.out.println("A = ");
        a = sc.nextFloat();
        System.out.println("B = ");
        b = sc.nextFloat();
        mult = a * b;
        System.out.println("A * B = " + mult);
    }
    private static void divisao(){
        float a,b,div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os números a serem divididos:");
        System.out.println("A = ");
        a = sc.nextFloat();
        System.out.println("B = ");
        b = sc.nextFloat();
        div = a / b;
        System.out.println("A / B = " + div);
    }
}
