/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Funcoes10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = 2, max = 12;
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja iniciar o jogo? s/n");
        String iniciar = input.nextLine();

        if (iniciar.equals("s")) {
            int jogo1 = jogada(min, max);
            System.out.println("Você tirou: " + jogo1 + " nos dados");
            if (jogo1 == 7) {
                System.out.println("Parabens, você ganhou o jogo!");

            }
            if (jogo1 == 2 || jogo1 == 3 || jogo1 == 12) {
                System.out.println("Craps! Você perdeu o jogo!");
            } else {
                System.out.println("Esse é seu ponto: " + jogo1);
                System.out.println("Agora você precisa tirar na próxima jogada o número " + jogo1);
                System.out.println("Aperte s para continuar o jogo.");
                String continuar = input.nextLine();
                if (continuar.equals("s")) {
                    int jogo2 = jogada(min, max);
                    while (jogo2 != jogo1) {
                        jogo2 = jogada(min, max);
                        if (jogo2 == jogo1) {
                            System.out.println("Parabens, você ganhou: Acertou seu ponto " + jogo2);

                        }
                        if (jogo2 == 7) {
                            System.out.println("Você tirou 7 e perdeu");
                            break;
                        } else {

                            System.out.println("seu resultado foi " + jogo2 + " Jogando novamente...");
                            System.out.println("*****************************************************");

                        }

                    }
                }
            }
        }

    }

    public static int jogada(int min, int max) {
        Random dados = new Random();
        return dados.nextInt((max - min) + 1) + min;
    }

}
