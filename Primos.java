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
public class Primos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o número a ser checado: ");
        //Váriavel é recebida do usuário
        int num1 = tcl.nextInt();
        //Contador de divisões
        int div = 0;
        //laço para checar se num1 é primo ou não
        for (int i = 1; i <= num1; i++) {
            if ( num1 % i == 0) {
                div++;
            }
        }
        //Mostrando Resultado
        if( div == 2){
            System.out.println("O número digitado é primo");
        }else{
            System.out.println("O número digitado não é primo");
        }
    }
}
