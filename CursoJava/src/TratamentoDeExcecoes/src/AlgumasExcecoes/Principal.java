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
        System.out.println("COME�ANDO !! ");
        
        Scanner leitor = new Scanner(System.in);
        try{
            String[] vetor = leitor.nextLine().split(" ");
            int posicao = leitor.nextInt();
            System.out.print("Nome de acordo com a posi��oo: "+vetor[posicao]);
        }
        catch(NullPointerException e){
            System.out.println("Elemento nullo");
            
        }
        catch(ArithmeticException e){
            System.out.println("Elemento Invalido");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posi��o�o invalida");
            
        }
        catch(InputMismatchException e){
            System.out.println("Obrigat�rio ser somento numeros");
        }
        System.out.println("Fim do Programa");

            
        
        
        leitor.close();;
        System.out.println("FIM ! ");
    }
    public static void metodo1(){
        System.out.println("COME�ando M�TODO 1");
        metodo2();
        System.out.println("FIM M�TODO 1");
    }
    
}
