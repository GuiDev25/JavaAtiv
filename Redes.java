/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;
 import java.util.Random;
/**
 *
 * @author Roberta
 */
public class Redes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz [][] = new int [5][3];
        Random num =  new Random();
        
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz [l][c] = num.nextInt(101);
            }
            }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }System.out.println(" ");
        }
    }
    
}
