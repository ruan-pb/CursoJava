/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MembrosEstaticos;

import java.util.Scanner;

public class MainDoMelhorForma {

    public static void main(String args[]) {
        Scanner leitor = new Scanner (System.in);
        MelhorFormaDeUsaEstatico Calculator = new MelhorFormaDeUsaEstatico();

        System.out.print("Enter radius: ");
        double radius = leitor.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

    }

}
    