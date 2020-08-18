
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Data1 {
    public static void main(String args[]) throws ParseException{
        
        Date x = new Date();
        
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat c = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
        
        Date a = d.parse("25/08/2010");
        Date b = c.parse("10/10/2010 15:42:07");
        
        System.out.println(d.format(a));
        System.out.println(c.format(b));
        System.out.println(c.format(x));
    }
    
}
