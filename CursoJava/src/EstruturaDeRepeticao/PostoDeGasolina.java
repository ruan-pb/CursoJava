/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeRepeticao;

import java.util.Scanner;

public class PostoDeGasolina {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (numero != 4) {
            
            if(numero == 1){
                alcool+=1;
            }
            else if(numero ==2){
                gasolina+=1;
            }
            else if (numero ==3){
                diesel+=1;
            }
            else{
                System.out.println("Numero Inválida digite outro");
            }
            numero = leitor.nextInt();

        }
        System.out.printf("Muito Obrigado%n Alcool: %d %nGasolina: %d %nDiesel: %d",alcool, gasolina, diesel);
        
        leitor.close();

    }

}
