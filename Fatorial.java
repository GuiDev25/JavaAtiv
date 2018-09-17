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
public class Fatorial {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int fat = 1;
        int fat2= 1;
        System.out.println("Digite o valor que desejar");
        int valor = tcl.nextInt();
        System.out.println("Digite o 2º valor");
        int valor2 = tcl.nextInt();
        for (int i = 1; i <= valor; i++) {
            fat *= i;
        }System.out.println("O fatorial de "+valor+" é igual a "+fat);
        for (int i = 1; i <= valor2; i++) {
            fat2 *= i;
        }System.out.println("O fatorial de "+valor2+" é igual a "+fat2);
        
        int valorFinal = fat + fat2;
        System.out.println("A soma dos fatoriais é de "+valorFinal);
    }
}
