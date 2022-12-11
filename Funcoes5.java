package funcoes5;

import java.util.Scanner;

public class Funcoes5 {
/*Faça um programa com uma 
    função chamada somaImposto. A função possui dois parâmetros 
    formais: taxaImposto, que é a quantia de imposto sobre 
    vendas expressa em porcentagem e custo, que é o custo de 
    um item antes do imposto. A função “altera” o valor de 
    custo para incluir o imposto sobre vendas.*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a taxa do imposto: ");
        double taxaImposto = input.nextDouble();
        System.out.print("Digite o custo do item: ");
        double custo = input.nextDouble();
        
        System.out.println("O valor do custo+taxa é:  "+somaImposto(taxaImposto,custo));
    }
    public static double somaImposto(double taxaImposto, double custo){
        return (taxaImposto/100*custo+custo);
    }
}
