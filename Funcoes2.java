package funcoes2;

import java.util.Scanner;

public class Funcoes2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Escreva a quantidade de linhas você quer imprimir: ");
        int n = input.nextInt();
        
        printing(n);

    }

    static void printing(int n) {
        if (n < 1) {
            System.out.println(" ");
        } else {

            for (int i = 1; i <= n; i++) {

                int j = 1;
                
                while (j <= i) {
                    System.out.print(j + " ");
                    j++;
                }
                System.out.println("\n");
            }
        }
    }
}
