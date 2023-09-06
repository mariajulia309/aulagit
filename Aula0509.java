
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 

package aula0509;


/**
 *
 * @author profslpa
 */
public class Aula0509 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int falta;
        double nota1, nota2, media, exame;
         

       System.out.println("Digite a quantidade de faltas");
        falta = entrada.nextInt();
       
       if (falta >= 16){
           System.out.println ("Voce foi reprovado por faltas!");
       }
       else {
        System.out.println ("Voce nao foi reprovado por faltas.");
        System.out.println ("Insira a sua primeira nota");
        nota1 = entrada.nextDouble();
        
        System.out.println ("Insira a sua ultima nota");
        nota2 = entrada.nextDouble();
        
        media = (nota1 + nota2)/2;
        
        if (media >= 6) {
             System.out.println ("Voce foi aprovado!"); 
        }
        else {
            System.out.println ("Digite sua nota de exame:");
            exame = entrada.nextDouble();
            
        media = media + exame/2;
        
        if (media >= 5){
            System.out.println("Voce foi aprovado! Parabens!");
        }
        else {
            System.out.println ("Voce foi reprovado");
            }
        
            }
       
        }
    
    }
}
