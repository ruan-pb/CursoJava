/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethod;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");

        double quantia = sc.nextDouble();

        System.out.print("Meses: ");

        int meses = sc.nextInt();

        ServicoDeJuros is = new ServicoDeJurosDoBrasil(2.0);

        double pagamento = is.pagamento(quantia, meses);

        System.out.println("Pagamento Depois " + meses + " meses:");

        System.out.println(String.format("%.2f", pagamento));

        sc.close();

    }

}
