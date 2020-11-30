/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Principal.Contato;
import Principal.frmCadFuncionario;
import beans.Ingredientes;
import classeConexao.ClasseConexaoJava;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DAOIngrediente {
    
ClasseConexaoJava con;
    public DAOIngrediente()  {
    

         con = new ClasseConexaoJava();
        con.conectar();
       
       
         
}

    public List<Ingredientes> ListarIngredientes() throws SQLException  {
        try{
            List<Ingredientes> lista = new ArrayList<>();
            
            String sql = "select * from tbCategoriaIngrediente order by categoriaIngredienteId";
            
            PreparedStatement patmt  = con.getConn().prepareStatement(sql);
            
            ResultSet rs = patmt.executeQuery();
            
            while(rs.next()){
                Ingredientes j = new Ingredientes();
                j.setIdIngrediente(Integer.parseInt(rs.getString(1)));
                j.setTipoIngrediente(rs.getString(2));
                lista.add(j);
            }
            
            return lista;
        }
        catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    
     
    }
    

}