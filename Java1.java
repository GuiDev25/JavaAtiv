/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;

public class Java1 {
     public static void main(String[] args) {
        int matriz [][] = new int[5][3];
        
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0;c < matriz[0].length; c++) {
                matriz [l][c]= 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }System.out.println(" ");
        }   
    }
    
}
