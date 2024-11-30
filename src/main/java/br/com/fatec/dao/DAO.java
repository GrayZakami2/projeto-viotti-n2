/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.dao;

import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author lucas
 */
public interface DAO<T> {
    public boolean insere(T model) throws SQLException;
    public boolean remove(T model) throws SQLException;
    public boolean altera(T model) throws SQLException;
    public T buscaID(T model) throws SQLException;
}
