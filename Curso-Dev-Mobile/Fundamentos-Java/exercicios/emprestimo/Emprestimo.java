package exercicios.emprestimo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Questão: Calcular o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina arbitráriamente as faixas que influenciam nos valores
 */
public class Emprestimo {
    public static void main(String[] args) {
        float valor,principal,taxa;
        int parcelas;
        // Leitura dos dados do valor do empréstimo e quantidade de parcelas.
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do empréstimo desejado: ");
        principal = sc.nextFloat();
        System.out.println("Em quantos meses deseja pagar: ");
        parcelas = sc.nextInt();
        // Cálculo da taxa de juros de acordo com o prazo para pagamento.
        taxa = taxaVariavel(parcelas);
        valor = valorFinal(principal,taxa, parcelas);
        // Formatação do dado de saída e informe ao consumidor.
        DecimalFormat df = new DecimalFormat("0.00");
        String str = df.format(valor);
        System.out.println("O valor total a ser pago é: " + str);
    }
    // Método para cálculo do valor total do a pagar.
    private static float valorFinal(float principal, float taxa, int parcelas){
        float montante;
        montante = (float) (principal * Math.pow((1 + taxa),parcelas));
        return montante;
    }
    // Método de cálculo da taxa variável.
    private static float taxaVariavel(int parcelas){
        float taxa;
        // A taxa de juros aumenta 100% a cada 12 meses.
        taxa = (float) (0.015 * (parcelas/12));
        return taxa;
    }
}
