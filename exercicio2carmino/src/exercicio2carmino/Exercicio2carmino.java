/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2carmino;

import java.util.Scanner;
/**
 *
 * @author Renan
 */
public class Exercicio2carmino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codProd = 1;
        int quantVend = 0;
        double valorUnit = 0;
        double totalVenda = 0;
        Scanner entrada = new Scanner (System.in);
        
        while ((codProd >= 1) && (codProd <= 4327)) {
            System.out.println("Digite o codigo do produto: ");
                codProd = entrada.nextInt();
                        System.out.println("Digite a quantidade vendida: ");
                quantVend = entrada.nextInt();
            System.out.println("Digite o valor unitario: ");
                valorUnit = entrada.nextInt();
            totalVenda = (quantVend * valorUnit);
                System.out.println("O valor total da venda e de: R$" + totalVenda);
            if ((codProd <1) || (codProd > 4327)) {
                System.out.println("Obrigado por usar o algoritmo!");
            }
            
        } 
    }
    
}
