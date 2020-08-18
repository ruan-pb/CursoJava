/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayPal;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ruanc
 */
public class Contrato {
    protected Integer numero;
    protected Date data;
    protected Double valorTotal;
    
    ArrayList<Parcelas> parcelas = new ArrayList<>();

    public Contrato(Integer numero, Date data, Double valor) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valorTotal;
    }

    public void setValor(Double valor) {
        this.valorTotal = valor;
    }
    
    public void adicionarParcela(Parcelas p){
        parcelas.add(p);
    }
    public void removerParcela(Parcelas p){
        parcelas.remove(p);
    }

    public ArrayList<Parcelas> getParcelas() {
        return parcelas;
    }
    
    
    
}
