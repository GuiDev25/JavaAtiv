package guilherme;

import java.util.Scanner;

/**
 *
 * @author Roberta
 */
public class Guilherme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite quantas posições você quer: ");
        int valor = tcl.nextInt();
        System.out.println("--FIBONACCI--");
        int F = 0 ;
        int F1 = 1;
        int aux;
        for (int i = 0; i < valor; i++) {
            aux = F1;
            F1 = F+F1;
            F = aux;
        //Por favor ignore essas aspas kkk , só para deixar bonito    
        System.out.println(F);
        }System.out.println("-------------");
    }
    
}
