/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.tipoNutricao;
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
public class DAOTipoNutri {
    
    ClasseConexaoJava con;
    public DAOTipoNutri()  {
         con = new ClasseConexaoJava();
        con.conectar();
   
}

    public List<tipoNutricao> ListarNutricao() throws SQLException  {
        try{
            List<tipoNutricao> lista = new ArrayList<>();
            
            String sql = "select * from tbInformacaoNutricionalTipo order by informacaoNutriTipoId";
            
            PreparedStatement patmt  = con.getConn().prepareStatement(sql);
            
            ResultSet rs = patmt.executeQuery();
            
            while(rs.next()){
                tipoNutricao j = new tipoNutricao();
                j.setIdNutri(Integer.parseInt(rs.getString(1)));
                j.setNomeNutri(rs.getString(2));
                lista.add(j);
            }
            
            return lista;
        }
        catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    
    }
}
