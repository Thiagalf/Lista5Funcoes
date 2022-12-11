/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes9;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Funcoes9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String numero = input.nextLine();
        System.out.println(inverte(numero));
        
    }
    public static String inverte (String numero){
        return new StringBuilder(numero).reverse().toString();
       
    }
    
}
