package redes;

import java.util.Scanner;
import java.util.Random; 

public class Java2 {
    public static void main(String[] args) {
        int matriz [][] = new int[5][3];
        Random num = new Random();
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0;c < matriz[0].length; c++) {
                matriz [l][c]= num.nextInt(101);
            }
       }
       Scanner tcl = new Scanner(System.in);
       System.out.println("Digite o valor que deseja encontrar: ");
       int num1 = tcl.nextInt();
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (num1 == matriz[0][0]) {
               System.out.println("Numero encontrado");
                i = i++;
           }
           else {
            System.out.println("Numero nao encontrado");
             break;
           }
            }
        }
       
    }
}
