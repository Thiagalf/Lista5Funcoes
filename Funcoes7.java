/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes7;

import java.util.Scanner;

public class Funcoes7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da parcela: ");
        double prestacao = input.nextDouble();
        System.out.print("Digite a quantidade de dias de atraso: ");
        int diasAtraso = input.nextInt();
        System.out.println("o valor final da parcela é R$"+valorPagamento(prestacao, diasAtraso));
    }

    public static double valorPagamento(double prestacao, int diasAtraso) {
        double valorFinal;
        if (diasAtraso == 0) {
            valorFinal = prestacao;
        } else {
            valorFinal = (prestacao * 0.03 + prestacao) + (prestacao * 0.001 + diasAtraso);

        }
        return valorFinal;
    }

}
