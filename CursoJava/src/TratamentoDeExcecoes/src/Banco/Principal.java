
package Banco;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre com os dados da conta ");

        try {

            System.out.print("Numero da Conta ");
            int numero = leitor.nextInt();

            leitor.nextLine();

            System.out.print("Nome do Titular: ");
            String nome = leitor.nextLine();

            System.out.print("Saldo inicial: ");
            double saldo = leitor.nextDouble();

            System.out.print("Limite de Saque: ");
            double limiteDeSaque = leitor.nextDouble();

            Conta c = new Conta(numero, nome, saldo, limiteDeSaque);

            System.out.print("Informe o valor para fazer o saque: ");
            double saque = leitor.nextDouble();

            c.saque(saque);

            System.out.println("Saldo " + c.saldo);

        }
        catch(SaqueMaiorQueLimiteException e){
            System.out.println("Erro "+e.getMessage());
        }
        catch(SaqueMaiorQueSaldo e){
            System.out.println(":( "+e.getMessage());

    }
    }
}
