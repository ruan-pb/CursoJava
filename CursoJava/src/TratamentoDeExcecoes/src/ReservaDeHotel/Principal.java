
package ReservaDeHotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    
    public static void main(String args[]) {
        
        Scanner leitor = new Scanner(System.in);
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            System.out.print("Numero Do Quarto: ");
            int numero = leitor.nextInt();


            System.out.print("Data de entrada: ");
            Date dataEntrada = format.parse(leitor.next());

            System.out.print("Data de Saida: ");
            Date dataSaida = format.parse(leitor.next());

            Reserva reserva = new Reserva(numero, dataEntrada, dataSaida);
            System.out.println("Reserva - "+reserva);


            System.out.println(" ");
            System.out.print("Entre com as datas de atualização da reserva");

            System.out.print("Data de Entrada");
            Date dataEntradaAtualizada = format.parse(leitor.next());

            System.out.print("Data da Saida");
            Date dataSaidaAtualizada = format.parse(leitor.next());

            reserva.atualização(dataEntradaAtualizada, dataSaidaAtualizada);

            System.out.println("Atualização: "+reserva);

            
        }
        catch(ParseException e){
            System.out.println("Data Inválida");
        }
        catch(ExcecaoDeTempo e){
            System.out.println("Inválido"+e.getMessage());
        }
        catch(InputMismatchException e ){
            System.out.println("Erro, Entrada Inválida");
        }
        catch(RuntimeException e){
            System.out.println("Algum Problema Não Esperado  :(");
        }
            
        
        
    }
    
}
