/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaEvento;

import java.util.Collection;

/**
 *
 * @author leo
 */
public class Evento {
    
    private String nome, atracao;
    
 
    public Evento(String nome, String atracao){
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", atracao=" + atracao + '}';
    }
    
    
    
}
