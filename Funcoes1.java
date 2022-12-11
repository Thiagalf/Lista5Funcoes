package funcoes1;
import java.util.Scanner;
public class Funcoes1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantas linha você quer imprimir: ");
        int n = input.nextInt();
        
        funcao(n);
     
        
    }
    static void funcao(int n){
           for(int i = 1; i <= n; i++){
            for(int k =0; k<i;k++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    
}
