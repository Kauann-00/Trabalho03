package com.mycompany.calcculacomissao;

import java.util.Scanner;

public class CalcculaComissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da corretora: ");
        String nome = scanner.nextLine().trim();
        
        if (nome.isEmpty()) {
            System.out.println("Erro: O nome da corretora não pode ser vazio.");
            scanner.close();
            return;
        }
        
        System.out.print("Digite o valor da venda (R$): ");
        double valorVenda;
        try {
            valorVenda = scanner.nextDouble();
            if (valorVenda < 0) {
                System.out.println("Erro: O valor da venda não pode ser negativo.");
                scanner.close();
                return;
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um valor numérico válido.");
            scanner.close();
            return;
        }
        
        double percentualComissao;
        if (valorVenda > 50000.00) {
            percentualComissao = 0.12; // 12% para vendas acima de R$ 50.000,00
        } else if (valorVenda >= 30000.00 && valorVenda <= 50000.00) {
            percentualComissao = 0.095; // 9,5% para vendas entre R$ 30.000,00 e R$ 50.000,00
        } else {
            percentualComissao = 0.07; // 7% para outros casos
        }
        
        double comissao = valorVenda * percentualComissao;
        
        System.out.printf("Corretora: %s%n", nome);
        System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);
        System.out.printf("Comissão: R$ %.2f%n", comissao);
        
        scanner.close();
    }
}