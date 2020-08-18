/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompareTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ruanc
 */
public class LendoNomesNoArquivo {

    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>();
        
        String path = "c:\\Users\\Ruanc\\Documents\\in.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String dadosFuncionarios = br.readLine();
            
            while (dadosFuncionarios != null) {
                String [] vetor = dadosFuncionarios.split(",");
                Funcionario f = new Funcionario(vetor[0], Double.parseDouble(vetor[1]));
                list.add(f);
                dadosFuncionarios = br.readLine();
            }
            Collections.sort(list);
            for (Funcionario f : list) {
                System.out.println(f.getNome()+" - "+f.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


