/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String args[]) {

        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        List<Trabalhador> lista = new ArrayList<>();

        System.out.print("Quantidade de pessoas: ");
        int quantidade = leitor.nextInt();

        for (int k = 1; k <= quantidade; k++) {

            System.out.println("Tranalhador " + k);

            System.out.print("Tercerizado S/N ? ");
            char escolha = leitor.next().toLowerCase().charAt(0);

            if (escolha == 'n') {
                System.out.print("Nome do Trabalhador: ");
                leitor.nextLine();
                String nome = leitor.nextLine();

                System.out.print("quantidade de horas: ");
                int horas = leitor.nextInt();

                System.out.print("Valor por Hora: ");
                double valorHora = leitor.nextDouble();

                Trabalhador trabalhador = new Trabalhador(nome, horas, valorHora);
                lista.add(trabalhador);

            } else if (escolha == 's') {

                System.out.print("Nome do Trabalhador: ");
                leitor.nextLine();
                String nome = leitor.nextLine();

                System.out.print("quantidade de horas: ");
                int horas = leitor.nextInt();

                System.out.print("Valor por Hora: ");
                double valorHora = leitor.nextDouble();

                System.out.print("Custo Adicional: ");
                double adicional = leitor.nextDouble();

                Trabalhador tercerizado = new Tercerizado(nome, horas, valorHora, adicional);

                lista.add(tercerizado);

            } else {
                System.out.println("Opção Inválida !!!");
            }

        }
        System.out.println("");
        System.out.println("Pagamentos: ");

        for (Trabalhador te : lista) {
            System.out.println(te.getNome() + " - R$ " + String.format("%.2f", te.pagamento()));

        }

    }

}
