/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes11;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Funcoes11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data no formato DD/MM/AAAA");
        String data = input.nextLine();
        int dia = Integer.parseInt(data.substring(0,2));
        int mes = Integer.parseInt(data.substring(3,5));
        int ano = Integer.parseInt(data.substring(6,10));
        if (dia>31 || dia <1 || mes > 12 || mes < 01){
            System.out.println("Digite uma data correta");
        }else{
        System.out.println(dia+" de "+ converte(mes) + " de "+ano);
        }
        if (dia>30){
            
        
            switch (mes){
            case 04:
                System.out.println("Esse mes só tem 30 dias");
                break;
            case 06:
                System.out.println("Esse mes só tem 30 dias");
                break;
            case 09:
                System.out.println("Esse mes só tem 30 dias");
                break;
            case 11:
                System.out.println("Esse mes só tem 30 dias");
                break;
        }
            
    
    }
    public static String converte(int mes){
         String [] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
         String dataExtenso = meses[mes-1];
         return dataExtenso;
    }
    
    
}
