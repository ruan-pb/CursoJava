
import java.util.Scanner;


public class OperaçõesBitWise {
    
    public static void main(String args[]){
        
        
        
        int x = 89;
        int y = 60;
        
        System.out.println( x & y);
        System.out.println( x | y);
        System.out.println( x ^ y);
        
        
        // exemplo mostrando a funcionalidade do Bitwise
        
        Scanner leitor = new Scanner (System.in);
        // os dois primeiros digitos da variavel mask, serve para dizer que a variavei inteiro vai receber um numero binario.
        int mask = 0b00100000;
        int a  = leitor.nextInt();
        
        if((a & mask )!= 0){
            System.out.println("O 6� bit � true !");
        }else{
            System.out.println("O 6� bit � false");
        }
        
        
        
        
        
        
        
    }
    
}
