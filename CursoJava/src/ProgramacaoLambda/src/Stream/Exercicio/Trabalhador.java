/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream.Exercicio;

/**
 *
 * @author Ruanc
 */
public class Trabalhador {
    
    protected String nome;
    protected String email;
    protected double salario;

    public Trabalhador(String nome, String email, double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String toString(){
        return this.nome+" - "+this.getEmail()+" - "+this.salario;
    }
}
