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
public class Troco {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("--SUPERMERCADO--");
        System.out.println("Preço da compra:");
        float compra = tcl.nextInt();
        System.out.println("Valor recebido do cliente:");
        float pago = tcl.nextInt();
        float troco ; 
        if (pago<compra)  {
            troco = compra - pago;
            System.out.println("Faltam R$:"+troco );
        }else{
            troco = pago - compra;
            System.out.println("O troco é de R$:"+troco);    
        }
        troco = pago-compra  ;
        Troco obj = new Troco();
        obj.TrocoFinal(troco);
        System.out.println("----------------");
    }public void TrocoFinal(float troco){
        while (troco > 0 ){
            if(troco == 1){
                System.out.println("Pague com 1 moeda de 1 real");
                break;
            }  
            if(troco == 1.5){
                System.out.println("Pague com 1 moeda de 1 real e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 2 ){
                System.out.println("Pague com 2 moedas de 1 real");
                break;
            }  
            if(troco == 2.5){
                System.out.println("Pague com 1 cédula de 2 reais e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 3){
                System.out.println("Pague com 1 cédula de 2 reais e 1 moeda de 1 real");
                break;
            }  
            if(troco == 3.5){
                System.out.println("Pague com 1 cédula de 2 reais, 1 moeda de 1 real e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 4){
                System.out.println("Pague com 2 cédulas de 2 reais");
                break;
            }  
            if(troco == 4.5){
                System.out.println("Pague com 2 cédulas de 2 reais e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 5){
                System.out.println("Pague com 1 cédula de 5 reais");
                break;
            }  
            if(troco == 5.5){
                System.out.println("Pague com 1 cédula de 5 reais e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 6){
                System.out.println("Pague com 1 cédula de 5 reais e 1 moeda de 1 real");
                break;
            }  
            if(troco == 7){
                System.out.println("Pague com 1 cédula de 5 reais e 1 cédula de 2 reais");
                break;
            }  
            if(troco == 7.5){
                System.out.println("Pague com 1 cédula de 5 reais, 1 cédula de 2 reais e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 8){
                System.out.println("Pague com 1 cédula de 5 reais e 3 moedas de 1 real");
                break;
            }  
            if(troco == 8.5){
                System.out.println("Pague com 1 cédula de 5 reais ,3 moedas de 1 real e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 9){
                System.out.println("Pague com 1 cédula de 5 reais e 2 cédulas de 2 reais");
                break;
            }  
            if(troco == 9.5){
                System.out.println("Pague com 1 cédula de 5 reais, 2 cédulas de 2 reais e 1 moeda de 50 centavos");
                break;
            }  
            if(troco == 10){
                System.out.println("Pague com 1 cédula de 10 reais");
                break;} 
        }
}
}
