
package Treinamento_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class EstaNoIntervalo {

    public static void main(String arg[]) {
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double numero = leitor.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        leitor.close();

    }

}
