/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaTrabalhador;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

/**
 *
 * @author Ruanc
 */
public class Trabalhador {
    
    private String nome;
    private Nivel nivel;
    private double baseSalarial;
    
    private Departamento dp;
    
    private  ArrayList<Contrato> contrato = new ArrayList<>();
    
    

    public Trabalhador(String nome, Nivel nivel, double baseSalarial, Departamento dp) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.dp = dp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDp() {
        return dp;
    }

    public void setDp(Departamento dp) {
        this.dp = dp;
    }
    public List<Contrato> getContratos(){
        return this.contrato;
    }
    
    
    public void  adicionarContrato(Contrato contrato){
        this.contrato.add(contrato);
    }
    public void removerContrato(Contrato contrato){
        this.contrato.remove(contrato);
    }
    
    public double salario(int mes, int ano){
        double soma = this.baseSalarial;
        Calendar cal = Calendar.getInstance();
        
        for(Contrato c :this.contrato){
            cal.setTime(c.getData());
            int mess = 1 + cal.get(Calendar.MONTH);
            int anoo = cal.get(Calendar.YEAR);
            if(mes == mess && ano == anoo){
                soma += c.totalValor();
            }
        }
        return soma;
       
    }
    
    
        
    }