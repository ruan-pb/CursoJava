/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String aegs[]){
        
        // como na classe String ja tem o equals e o HashCode não precisa implementar o Comparable e compareTo
        // por causa do TreeMap. 
        //mas lento mais compara pelo compareTo em Ordem alfabetica
        Map<String,String> cookies = new TreeMap<>();
        
        
        //primeiro se coloca a chava, ou seja o nome do conteudo
        // depois o conteudo que deseja. e para acessar o elemento depois, se usa a chave que vc colocou
        
        cookies.put("Nome", "Ruan Cruz Soares da Silva");
        cookies.put("Email", "Ruancruzsoares@hotmail.com");
        cookies.put("Telefone", "987442112");
        
        //para remover precisa apenas indicar a chave, ou seja o que voce colocou no indice primeiro
        cookies.remove("Email");
        
        System.out.println("Cookies ");
        
        //o cookies.keySet serve para voce informa a lista de chaves que voce adicionou.
        for(String key:cookies.keySet()){
            System.out.println(key+" "+cookies.get(key));
        }
        
        System.out.println(cookies.containsKey("Email"));
    }
    
}
