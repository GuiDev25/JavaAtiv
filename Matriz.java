/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilherme;
import java.util.Scanner;
/**
 *
 * @author Roberta
 */
public class Matriz {
    
    public static void main(String[] args) {
        String matriz [][]= new String [2][2];
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o codigo do produto");
        int code= tcl.nextInt();
        
        matriz [0][1]="541";
        matriz [0][2]="Caneta";
        matriz [0][3]="R$:2";
        
        matriz [1][1]="441";
        matriz [1][2]="Lápis";
        matriz [1][3]="R$:1";
        
        matriz [2][1]="341";
        matriz [2][2]="Caderno";
        matriz [2][3]="R$:25";
        
       
            switch (code){
            
                case 1:
                    System.out.println(matriz [0][1]+" "+matriz [0][2]+" "+matriz [0][3]);
            
                case 2:
                    System.out.println(matriz [1][1]+" "+matriz [1][2]+" "+matriz [1][3]);
            
                case 3:
                    System.out.println(matriz [2][1]+" "+matriz [2][2]+" "+matriz [2][3]);   
            }
            
        
        
    }
}
