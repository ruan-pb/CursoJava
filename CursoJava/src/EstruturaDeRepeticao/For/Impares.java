/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeRepeticao.For;

import java.util.Scanner;


public class Impares {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        
        int x = leitor.nextInt();
        
        for(int k = x; k > 0;k-- ){
            if(k % 2 != 0){
                System.out.println(k);
            }
        }
    }
}
