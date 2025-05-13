// Estrutura de decisão

package com.mycompany.customacas;

import java.util.Scanner;

public class CustoMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        
        double precoUnitario = quantidade < 12 ? 1.30 : 1.00;
        double custoTotal = quantidade * precoUnitario;
        
        System.out.printf("O custo total da compra é R$ %.2f%n", custoTotal);
        
        scanner.close();
    }
}