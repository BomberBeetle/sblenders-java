/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Ingredientes;
import beans.tipoFuncionario;
import classeConexao.ClasseConexaoJava;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class DAOTipoFunc {
    
    ClasseConexaoJava con;
    public DAOTipoFunc()  {

         con = new ClasseConexaoJava();
        con.conectar();              
}

    public List<tipoFuncionario> ListarTipoFunc() throws SQLException  {
        try{
            List<tipoFuncionario> lista = new ArrayList<>();
            
            String sql = "select * from tbTipoFuncionario";
            
            PreparedStatement patmt  = con.getConn().prepareStatement(sql);
            
            ResultSet rs = patmt.executeQuery();
            
            while(rs.next()){
                tipoFuncionario j = new tipoFuncionario();
                j.setIdFunc(Integer.parseInt(rs.getString(1)));
                j.setNome(rs.getString(2));
                lista.add(j);
            }
            
            return lista;
        }
        catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    
     
    }
    
    
}
