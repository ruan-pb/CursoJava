
package POO.ProjetoEstoque;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;
    
    
    
    
    public double valorTotal(){
        return preco*quantidade;
    }
    
    public void adcionarProduto(int quant){
        this.quantidade += quant;
        
    }
    public void removerProduto(int quant){
        this.quantidade -=quant;
    }
    public String toString(){
        return nome+", $ "+String.format("%.2f",preco)+", "+quantidade+"unidades, no total de: $ "+String.format("%.2f",valorTotal());
    }
    
}
