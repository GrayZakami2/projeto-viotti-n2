/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class Pizza {
    Long id;
    String nome;
    String ingredientes;
    boolean contemGluten;
    Double valor;

    public Pizza(Long id, String nome, String ingredientes, boolean contemGluten, Double valor) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.contemGluten = contemGluten;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isContemGluten() {
        return contemGluten;
    }

    public void setContemGluten(boolean contemGluten) {
        this.contemGluten = contemGluten;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        
        return "Nome: " + this.nome +
               "\nIngredientes: " + this.ingredientes +
                "\nContém glutén? " + this.contemGluten +
                "\nValor: " + this.valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pizza other = (Pizza) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
   
}
