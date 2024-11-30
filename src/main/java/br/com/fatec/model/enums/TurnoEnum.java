/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model.enums;

/**
 *
 * @author lucas
 */
public enum TurnoEnum {
    MATUTINO("Matutino"),
    VESPERTINO("Vespertino"),
    NOTURNO("Noturno");
    
    String desc;
    
    private TurnoEnum(String desc){
        this.desc = desc;
    }
}
