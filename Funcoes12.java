/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Funcoes12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine().toUpperCase();

        embaralha(palavra);
    }

    public static void embaralha(String palavra) {
        ArrayList<String> word = new ArrayList<String>();
        
        for (int t = palavra.length(); t > 0; t--) {
            word.add(palavra.substring(t - 1, t));

        }

        Collections.shuffle(word);
        System.out.println("*************************************************");
        System.out.print("A sua palavra embaralhada ficou assim: ");
        String acabada = word.toString();
        //gambiarra pq não sei ainda como transformar um arraylist em uma String
        acabada = acabada.replace("[", "");
        acabada = acabada.replace(",", "");
        acabada = acabada.replace("]", "");
        acabada = acabada.replace(" ", "");
        System.out.println(acabada);
    }

}
