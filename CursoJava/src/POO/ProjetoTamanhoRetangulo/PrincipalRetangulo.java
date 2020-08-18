
package POO.ProjetoTamanhoRetangulo;

import java.awt.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalRetangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        TamanhoRetangulo r = new TamanhoRetangulo();

        System.out.println(
                "Enter rectangle width and height:");
        r.width = (int) sc.nextDouble();
        r.height = (int) sc.nextDouble();

        System.out.printf("AREA = %.2f%n", r.area());
        System.out.printf(
                "PERIMETER = %.2f%n", r.perimeter());
        System.out.printf(
                "DIAGONAL = %.2f%n", r.diagonal());
        sc.close();

    }
}
