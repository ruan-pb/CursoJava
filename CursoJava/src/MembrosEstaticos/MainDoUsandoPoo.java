/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MembrosEstaticos;

import java.util.Scanner;

public class MainDoUsandoPoo {

    public static void main(String args[]) {
        UsandoPoo calc = new UsandoPoo();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = leitor.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf(
                "Circumference: %.2f%n", c);
        System.out.printf(
                "Volume: %.2f%n", v);
        System.out.printf(
                "PI value: %.2f%n", calc.PI);

    }

}
