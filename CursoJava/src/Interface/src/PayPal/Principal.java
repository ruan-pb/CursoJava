/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayPal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Dados com dados Da Compra");

        System.out.print("Numero da Conta: ");

        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");

        Date date = sdf.parse(sc.next());

        System.out.print("Valor do Produto: ");

        double totalValue = sc.nextDouble();

        Contrato contrato = new Contrato(number, date, totalValue);
        
        

        System.out.print("Quantidades De Parcela:  ");

        int n = sc.nextInt();

        ServicoContrato contratoServico = new ServicoContrato(new ServicoDePagamento());

        contratoServico.ProcessamentoDeContrato(contrato, n);

        System.out.println("Parcelas:");

        for (Parcelas x : contrato.getParcelas()) {
            
            System.out.println(x);

        }

        sc.close();

    }

}
