/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaolambda.ExemploLambda02funcoes;

import programacaolambda.ExemploLambda.*;

/**
 *
 * @author Ruanc
 */
public class Produto {



	private String nome;

	private Double preco;

	

	public Produto() {

	}



	public Produto(String name, Double price) {

		this.nome = name;

		this.preco = price;

	}



	public String getName() {

		return nome;

	}



	public void setName(String name) {

		this.nome = name;

	}



	public Double getPrice() {

		return preco;

	}



	public void setPrice(Double price) {

		this.preco = price;

	}



	@Override

	public String toString() {

		return "Product [nome=" + nome + ", preco=" + preco + "]";

	}
}