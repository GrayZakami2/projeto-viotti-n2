/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.dao;

import br.com.fatec.model.Gerente;
import br.com.fatec.persistencia.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author lucas
 */
public class GerenteDAO implements DAO<Gerente>{
    
    private Gerente gerente;
    private PreparedStatement pst;
    private ResultSet rs;
    

    @Override
    public boolean insere(Gerente model) throws SQLException {
        String sql = "INSERT INTO gerentes (cpf, email, senha, telefone, cnpj) VALUES(?, ?, ?, ?, ?)";
        
        Banco.conectar();
        
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setString(1, model.getCpf());
        pst.setString(2, model.getEmail());
        pst.setString(3, model.getSenha());
        pst.setString(4, model.getTelefone());
        pst.setString(5, model.getCnpj());
        
        if(pst.executeUpdate() >= 1) { //tudo certo
            Banco.desconectar();
            return true;
        }
        else {
            Banco.desconectar();
            return false;
        }
    }

    @Override
    public boolean remove(Gerente model) throws SQLException {
        String sql = "DELETE FROM gerentes WHERE cpf = ?";
        
        Banco.conectar();
        
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setString(1, model.getCpf());
        
        if(pst.executeUpdate() >= 1) { //tudo certo
            Banco.desconectar();
            return true;
        }
        else {
            Banco.desconectar();
            return false;
        }
    }

    @Override
    public boolean altera(Gerente model) throws SQLException {
        String sql = "UPDATE proprietario SET email = ? "
        + "WHERE cpf = ?;";
        
        Banco.conectar();
        
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setString(1, model.getEmail());
        pst.setString(2, model.getCpf());
        
        if(pst.executeUpdate() >= 1) { //tudo certo
            Banco.desconectar();
            return true;
        }
        else {
            Banco.desconectar();
            return false;
        }
    }

    @Override
    public Gerente buscaID(Gerente model) throws SQLException {
        String sql = "SELECT * FROM gerentes WHERE cpf = ?";
        gerente = null;
        
        Banco.conectar();
        
        pst = Banco.obterConexao().prepareStatement(sql);
        pst.setString(1, model.getCpf());
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            gerente = new Gerente();
            gerente.setCpf(rs.getString("cpf"));
            gerente.setEmail(rs.getString("email"));
            gerente.setSenha(rs.getString("senha"));
            gerente.setTelefone(rs.getString("telefone"));
            gerente.setCnpj(rs.getString("cnpj"));
        }
        
        Banco.desconectar();
        
        return gerente;
    }    
}
