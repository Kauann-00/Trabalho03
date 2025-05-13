// Estrutura de decisão

package com.mycompany.aprovaemprestimo;

import java.util.Scanner;

public class AprovaEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do empréstimo (R$): ");
        double valorEmprestimo = scanner.nextDouble();
        
        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();
        
        System.out.print("Digite o salário do solicitante (R$): ");
        double salario = scanner.nextDouble();
        
        double valorParcela = valorEmprestimo / numeroParcelas;
        double limiteParcela = salario * 0.30;
        
        if (valorParcela <= limiteParcela) {
            System.out.printf("Empréstimo APROVADO! Valor da parcela: R$ %.2f%n", valorParcela);
        } else {
            System.out.printf("Empréstimo REPROVADO! Valor da parcela (R$ %.2f) excede 30%% do salário (R$ %.2f)%n", 
                valorParcela, limiteParcela);
        }
        
        scanner.close();
    }
}