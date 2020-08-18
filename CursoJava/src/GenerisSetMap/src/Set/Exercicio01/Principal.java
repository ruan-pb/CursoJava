/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set.Exercicio01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o caminho: ");

        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            // Instaciei a lista do tipo set, e atribuir para ser do tipo HashSet
            // escolhi o hashSet pq ele é o mais rapido, e a ordem não importa
            Set<Log> set = new HashSet<>();

            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(" ");

                String username = fields[0];

                Date moment = Date.from(Instant.parse(fields[1]));
                
                
                // se por acaso vinher algum nome repetido, vai ser barrado pela estrutura do set
                Log l = new Log(username, moment);
                set.add(l);
                
               

                line = br.readLine();

            }
            
            // size tamanho dos conjuntos
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }

        sc.close();

    }

}
