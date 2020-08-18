/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeRepeticao;

import java.util.Scanner;

public class DoWhile {

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        char resposta;

        do{
            System.out.print("digite a temperatura em celsius");
            double c = leitor.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente a Fahrenrith %.1f%n", f);
            System.out.print("deseja repetir s/n");
            resposta = leitor.next().charAt(0);

        } while (resposta != 'n');

        leitor.close();

    }
}
