/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class Promocoes {
    Long id;
    HashSet<Pizza> pizzas;
    Double valor;

    public Promocoes(Long id, HashSet<Pizza> pizzas, Double valor) {
        this.id = id;
        this.pizzas = pizzas;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashSet<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(HashSet<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
