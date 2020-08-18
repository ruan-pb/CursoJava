package Generis;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruanc
 */
public class LendoNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        //a vantagem È que voce precisa apenas mudar os parametros na classe principal e n„o na classe que est· instanciada.
        
        PrintService<String> ps = new PrintService<>();

        System.out.print("quantas repeti√ß√µes? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String valor = sc.next();
            ps.addValue(valor);
        }

        ps.print();
        String x = ps.first();
        System.out.println("Primeiro: " + x);

        sc.close();
    }

}
