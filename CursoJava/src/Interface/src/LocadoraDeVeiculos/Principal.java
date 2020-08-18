/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocadoraDeVeiculos;

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

    public static void main(String args[]) throws ParseException {

        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        System.out.println("Entre com os Dados da locação: ");

        System.out.print("Informe seu carro: ");
        String carro = leitor.nextLine();

        System.out.print("Data de saida ( dd/MM/yyyy ) ");
        Date saida = format.parse(leitor.nextLine());

        System.out.print("Data de chegada ( dd/MM/yyyy ) ");
        Date chegada = format.parse(leitor.nextLine());

        Veiculo v = new Veiculo(carro);
        AluguelDeCarros aluguelDeCarros = new AluguelDeCarros(saida, chegada, v);

        System.out.print("Preço por Hora: ");
        double precoDeHora = leitor.nextDouble();

        System.out.print("Preço por Dia: ");
        double precoDoDia = leitor.nextDouble();
        
        
        
        BrasilTaxas taxasDeServico = new BrasilTaxas();
        
        ServicosDeAluguel sda = new ServicosDeAluguel(precoDoDia, precoDeHora, taxasDeServico);
        
         sda.processamentoDeFatura(aluguelDeCarros);
        

        System.out.println("Nota Fiscal: \n"+ "Horario" + new Date());
        
        System.out.println("Pagamento Básico: "+aluguelDeCarros.getFatura().getPagamentoBasico());
        
        System.out.println("taxa "+aluguelDeCarros.getFatura().getTaxa());
        
        
        System.out.println("Valor Total "+aluguelDeCarros.getFatura().getTotalPagamento());

        leitor.close();
    }

}
