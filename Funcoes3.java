package funcoes3;
import java.util.Scanner;
public class Funcoes3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro argumento: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo argumento: ");
        int b = input.nextInt();
        System.out.print("Digite o terceiro argumento: ");
        int c = input.nextInt();
        
       sum(a,b,c);
        
    }
    static void sum(int a,int b,int c){
        System.out.println("A soma dos três argumentos é "+(a+b+c));
    }
}
