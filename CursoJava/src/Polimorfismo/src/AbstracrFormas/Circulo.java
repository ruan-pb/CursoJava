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
public class Circulo extends Forma {
    public double raio;

    public Circulo(double raio, Cor cor) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
    

    public Circulo(Cor cor) {
        super(cor);
    }

    @Override
    public double area() {
        return Math.PI * this.raio * this.raio;
    }
    
}
