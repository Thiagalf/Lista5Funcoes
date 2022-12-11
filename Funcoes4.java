package funcoes4;

import java.util.Scanner;

public class Funcoes4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n = input.nextDouble();
        posNeg(n);
    }

    static void posNeg(double n) {
        if (n < 0) {
            System.out.println("O número " + n + " é negativo");
        } else {
            System.out.println("O número " + n + " é positivo");
        }
    }
}
