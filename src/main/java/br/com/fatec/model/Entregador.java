/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

import br.com.fatec.model.enums.TurnoEnum;

/**
 *
 * @author lucas
 */
public class Entregador extends Funcionario {
    private String cnh;

    public Entregador(String cpf, String nome, String email, String telefone, TurnoEnum turno, String cnh) {
        super(cpf, nome, email, telefone, turno);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    
}
