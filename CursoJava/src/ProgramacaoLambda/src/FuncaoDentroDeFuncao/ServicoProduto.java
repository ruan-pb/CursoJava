/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncaoDentroDeFuncao;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Ruanc
 */
public class ServicoProduto {
    
    public double filtro(List<Produto> lista,Predicate<Produto>criterio){
        double soma =0;
        for(Produto p:lista){
            if(criterio.test(p)){
                soma += p.getPrice();
            }
            
        }
        return soma;
    
    }   
}
