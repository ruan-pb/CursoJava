/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.function.Function;

/**
 *
 * @author Ruanc
 */
public class UpperCaseName implements Function<Produto,String>{

    @Override
    public String apply(Produto t) {
        return t.getName().toUpperCase();
    }

   
   
    
}
