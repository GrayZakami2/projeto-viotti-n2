/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

import java.time.LocalDateTime;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class Promocoes {
    Long id;
    String nome;
    HashSet<Pizza> pizzas;
    Double valor;
    LocalDateTime dataLimite;

    public Promocoes(Long id, String nome, HashSet<Pizza> pizzas, Double valor, LocalDateTime dataLimite) {
        this.id = id;
        this.nome = nome;
        this.pizzas = pizzas;
        this.valor = valor;
        this.dataLimite = dataLimite;
    }
    
    public void adicionarPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }
    
    public void removerPizza(Pizza pizza) {
        this.pizzas.remove(pizza);
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

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDateTime dataLimite) {
        this.dataLimite = dataLimite;
    }
}