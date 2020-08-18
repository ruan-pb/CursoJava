
package Treinamento_Condicional.SwitchCase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main (String args[]){
        Scanner leitor = new Scanner(System.in);
        
        int x = leitor.nextInt();
        String dia = "";
        
        switch(x){
            case 1:
                dia = ("DOMINGO");
                break;
            case 2:
                dia = ("Segunda");
                break;
            case 3:
                dia = ("Terça");
                break;
            case 4:
                dia = ("Quarta");
                break;
            case 5: 
                dia = ("Quinta");
                break;
            case 6:
                dia = ("Sexta");
                break;
            case 7:
                dia = ("Sabádo");
                break;
            default:
                dia = "dia invalido";
                break;
        }
        
        System.out.printf("de acordo com a sua informaçao : %s%n",dia);
        
        
        
        
    }
    
}
