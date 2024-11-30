/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model.enums;

/**
 *
 * @author Aluno
 */
public enum TamanhoEnum {
    BROTINHO("brotinho"),
    MÉDIA("média"),
    GRANDE("grande");
    
    String valor;

    private TamanhoEnum(String valor) {
        this.valor = valor;
    }
}
