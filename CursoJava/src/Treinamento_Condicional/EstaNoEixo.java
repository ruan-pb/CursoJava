
package Treinamento_Condicional;

import java.util.Scanner;

public class EstaNoEixo {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        double x = leitor.nextDouble();
        double y = leitor.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
            
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
            
        } else if (y == 0.0) {
            System.out.println("Eixo X");
            
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
            
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
            
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
            
        } else {
            System.out.println("Q4");
        }

        leitor.close();

    }

}
