/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes8;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Funcoes8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        
//esse if serve para acabar com o sinal de negativo se digitarem um número menor que zero.
        if (numero >= 0) {
            String numerostr = Integer.toString(numero);
            System.out.println(numerostr.length());
        } else {
            numero = numero * -1;
            String numerostr = Integer.toString(numero);
            System.out.println(numerostr.length());
        }

    }

}
