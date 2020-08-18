package AlgumasExcecoes;


import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String args[]){
        
        metodo1();
        
        
        
        
    }
    public static void metodo2(){
        System.out.println("COMEÇANDO !! ");
        
        Scanner leitor = new Scanner(System.in);
        try{
            String[] vetor = leitor.nextLine().split(" ");
            int posicao = leitor.nextInt();
            System.out.print("Nome de acordo com a posiçãoo: "+vetor[posicao]);
        }
        catch(NullPointerException e){
            System.out.println("Elemento nullo");
            
        }
        catch(ArithmeticException e){
            System.out.println("Elemento Invalido");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição£o invalida");
            
        }
        catch(InputMismatchException e){
            System.out.println("Obrigatário ser somento numeros");
        }
        System.out.println("Fim do Programa");

            
        
        
        leitor.close();;
        System.out.println("FIM ! ");
    }
    public static void metodo1(){
        System.out.println("COMEçando MéTODO 1");
        metodo2();
        System.out.println("FIM MéTODO 1");
    }
    
}
