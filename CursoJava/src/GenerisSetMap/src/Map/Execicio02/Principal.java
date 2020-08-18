/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map.Execicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String args[]) throws FileNotFoundException {

        Scanner leitor = new Scanner(System.in);
        
        Map<String,Integer> votos = new LinkedHashMap<>();

        System.out.print("Informe o caminho do arquivo ");
        String caminho = leitor.nextLine();
        
        double somatorio = 0;

        try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {
            
            String linha = bf.readLine();
            while(linha != null){
                String[] vetor = bf.readLine().split(",");
                
                String nome = vetor[0];
                int quantidadeDeVotos = Integer.parseInt(vetor[1]);
                
                
                //passa como parametro o nome da pessoa para pegar a quantidade de votos
                if(votos.containsKey(nome)){
                    
                    int votosAteAgora = votos.get(nome);
                    votos.put(nome, quantidadeDeVotos+votosAteAgora);
                }
                else{
                    votos.put(nome, quantidadeDeVotos);
                }
                linha = bf.readLine();
                
            }
            for(String key:votos.keySet()){
                System.out.println(key+"votos: "+votos.get(key));
            }

        }
        catch(IOException e){
            System.out.println("Erro "+e.getMessage());
            e.printStackTrace();
        }
        leitor.close();

    }
}
