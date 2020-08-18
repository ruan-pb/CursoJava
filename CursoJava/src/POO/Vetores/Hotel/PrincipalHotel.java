
package POO.Vetores.Hotel;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalHotel {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        // pode se fazer tamb�m : Dados[] vect = new Dados[]{"ruan,neuza,valdir,victor,caro,luzia}; 
        Dados[] vect = new Dados[10];

        System.out.print("quantos quartos ");
        int n = sc.nextInt();
        for (int i = 1;i<= n; i++) {
            System.out.println();
            System.out.println("posição #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Dados(nome, email);
        }

        System.out.println();

        System.out.println("Quarto:");
        for (int i = 0;i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();

    }

}
