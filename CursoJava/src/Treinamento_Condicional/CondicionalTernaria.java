
package Treinamento_Condicional;

public class CondicionalTernaria {
    
    public static void main(String args[]){
        
   
    double preco = 34.5;
    double desconto;
    
    if(preco < 20.0){
    
        desconto = preco *0.1;
    
    }
    else{
        desconto = preco * 0.05;
    }
    
        System.out.println(desconto);
        
     
    //Ou se pode fazer essa mesma condição utilizando a condição ternaria
    
    double preco = 34.5;
    double desconto = (preco < 20 )? preco*0.1 : preco * 0.5;
    
    
        System.out.println(desconto);
    
    }
}
