
import java.util.Scanner;


public class FuncoesParaString {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        
        
        String original = "-"+"abcde FGHIJ ABC abc DEFG   "+"-";
        
        // para deixa toda a String em caixa Baixa.
        String toLower = original.toLowerCase();
        System.out.println(toLower);
        
        // para deixa toda a String em caixa Alta.
        String toUpper = original.toUpperCase();
        System.out.println(toUpper);
        
        // para retirar todo o espaço desnecessario de cada String.
        String semEspaco = original.trim();
        System.out.println(semEspaco);
        
        // SubString recorta String e fazer novas palavras.
        // O numero dentro do parentese, significa até aonde você vai recorta,do numero em diante é a nova frase.
        String suString = original.substring(3);
        System.out.println(suString);
        
        
        // O Subtring pode tanto fazer como o exemplo anterior como pode também delimitar o fim.
        // se usa colocando dentro da subtring dois paramentro, o inicio e o fim que voce quer na frase.
        String suuString = original.substring(2, 9);
        System.out.println(suuString);
        
        // para trocar uma letra por outra em toda a frase se usa o replace
        // isso se usa também para subStrings.
        // quando é subString é aspas duplas ( " ), quando é só uma letra é aspas simples ( ' ).
        
        String replace = original.replace('a', 'x');
        String subReplace = original.replace("abc","zfg");
        System.out.println(replace);
        System.out.println(subReplace);
        
        // sabe aonde está o indice de uma determinado subString
        
        int indexString = original.indexOf("bc");
        
        // e para saber a ultima ocorrencia desse subString 
        
        int lastIndex = original.lastIndexOf("bc");
        
        System.out.println(indexString);
        System.out.println(lastIndex);
        
        // para pegar uma frase em um texto se usa o split( " ")
        // se pode colocar o que voce quer q possa separa de uma frase para outra, geralmente se usa os espaços.
        
        String nome =  "ruan cruz soares da silva";
        
       // criar um vetor/lista para armazena cada subString retirado do texto/nome/frase.
       
       String [] lista = nome.split(" ");
       
        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
       
    }
}
        
       
        
        
        
        
        
        
        
    
