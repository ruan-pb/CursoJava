
package POO.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MetodosSobreLista {
   
    
    
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner leitor =  new Scanner(System.in);
        
        
        List<String> listas = new ArrayList<>();
        
        
        // .add serva para adicionar na lista.
        listas.add("ruan");
        listas.add("victor");
        listas.add("valdir");
        listas.add("neuza");
        listas.add("Carol");
        
        // para adicionar um novo membro na lista em uma posição desejada.
        listas.add(2, "luzia");
        System.out.println("---------------------------------------------------------");
        
        //para saber o tamanho da lista.
        System.out.println(listas.size());
        System.out.println("---------------------------------------------------------");
        // para remover alguma coisa da lista. como por exemplo o nome de uma pessoa.
       listas.remove("ruan");
       System.out.println("---------------------------------------------------------");
       // para remover de acordo com o indice. 
       listas.remove(5);
       System.out.println("---------------------------------------------------------");
       
       // para remover pessos que estão na lista em que o seu nome começa com ' M 'por exemplo.
       
       listas.removeIf(x -> x.charAt(0) == 'M');
       
       for(String x:listas){
           System.out.println(x);
       }
       System.out.println("---------------------------------------------------------");
       
       // para encontra um elemento na lista
       // informa um indice ou nome e o computador retorna o que estava na String
       
       listas.indexOf("ruan");
       System.out.println("---------------------------------------------------------");
       
       // para filtrar apenas pessoas que começem com uma determinada letra.
       // precisa fazer uma nova lista
       
       List<String> resultado  = listas.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
       
       for(String x:resultado){
           System.out.println(x);
       }
       
       System.out.println("---------------------------------------------------------");
        for(String i:listas){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------");
        
        // encontra o primeiro indice que atenda a necessidade do problema
        // como por exemplo achar a primeira ocorrencia da letra ' A ' na lista
        
        String nome = listas.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
        System.out.println("---------------------------------------------------------");
        
       
       
       
       
       
       
        
        
        
        
        
        
        
        
    }
    
}
