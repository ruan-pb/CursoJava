
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class SomandoUmaUnidadeDeTempo {

    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        
        // essas 3 primeiras linhas serve apenas como exemplo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:45:07Z"));
        System.out.println(sdf.format(d));
        
        // a letra 'd' q esta dentro do parentede significa aonde voce vai altera a hora ou data ou minuto...
        // e quantas horas voce vai alterar
        // d = cal.getTime(); serva para atualizar e mostrar o 
        Calendar cal = Calendar.getInstance();// para instanciar a classe calendar
        cal.setTime(d);// vai pegar a variavel do calendar 'cal'e vai pedir para altera a date com o setTime();
        cal.add(Calendar.HOUR_OF_DAY, 6);//cal.add(Calendar.HOUR_OF_DAY, 4); o que esta dentro do parentese vai dizer o que voce quer alterar.
        d = cal.getTime();
        System.out.println(sdf.format(d));
        
        
        
        // para pegar a data ou a hora
        Calendar x = Calendar.getInstance();
        cal.setTime(d);
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1+ cal.get(Calendar.MONTH);
        System.out.println("MINUTOS: "+minutos);
        System.out.println("Mes: "+mes);

    }
}
