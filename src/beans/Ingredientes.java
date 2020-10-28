/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author lucas
 */
public class Ingredientes {
    private int IdIngrediente;
    private String TipoIngrediente;

    public int getIdIngrediente() {
        return IdIngrediente;
    }

    public void setIdIngrediente(int IdIngrediente) {
        this.IdIngrediente = IdIngrediente;
    }

    public String getTipoIngrediente() {
        return TipoIngrediente;
    }

    public void setTipoIngrediente(String TipoIngrediente) {
        this.TipoIngrediente = TipoIngrediente;
    }

    @Override
    public String toString() {
        return this.getTipoIngrediente();
    }
    
    
   
}
