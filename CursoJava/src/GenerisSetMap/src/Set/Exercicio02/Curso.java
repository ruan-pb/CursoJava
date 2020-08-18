/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set.Exercicio02;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ruanc
 */
public abstract class Curso implements ContratoCurso {
    
    protected Integer codigo;
    
    
    
    

    public Curso(Integer codigo) {
        this.codigo = codigo;
    }

    public Curso() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
    
    
 
    }
    