/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracrFormas;

/**
 *
 * @author Ruanc
 */
public class Retangulo extends Forma {
    protected double altura;
    protected double largura;

    public Retangulo(Cor cor) {
        super(cor);
    }

    public Retangulo(double altura, double largura, Cor cor) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }
    

    @Override
    public double area() {
        return this.altura*this.largura;
        
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    
}
