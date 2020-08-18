/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generis.ProdutoMaisCaro;

import Generis.ProdutoMaisCaro.Product;
import Generis.ProdutoMaisCaro.CalculationService;
import Set.DiferencaDoSet.HashSet.Produto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String[] args) {



		Locale.setDefault(Locale.US);

		

		List<Product> list = new ArrayList<>();



		String path = "C:\\Users\\Ruanc\\Documents\\in.txt";



		try (BufferedReader br = new BufferedReader(new FileReader(path))) {



			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
                                
                               
                                // Não entendi por que não aceita a instanciação normal do produto
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));

				line = br.readLine();

			}

			
                        // CalculationService.max é um metodo statico
                        // é do tipo produto, porque o formato dele, a saida dele é do tipo produto, com nome e valor
			Product x = CalculationService.max(list);

			System.out.println("valor Expressivo:");

			System.out.println(x);



		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		} 

	}

}
