/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaolambda.ExemploLambda;

import java.util.Comparator;

/**
 *
 * @author Ruanc
 */
public class MyComparator implements Comparator<Produto > {



	@Override

	public int compare(Produto p1, Produto p2) {

		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

	}

}
