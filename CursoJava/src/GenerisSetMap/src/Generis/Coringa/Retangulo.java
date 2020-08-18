/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generis.Coringa;

import Generis.Coringa.Cor;

/**
 *
 * @author Ruanc
 */
public class Retangulo extends Forma {
    protected double altura;
    protected double largura;

    public Retangulo(double altura, double largura) {

        this.altura = altura;
        this.largura = largura;
    }
    

    @Override
    public double area() {
        return this.altura*this.largura;
        
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
