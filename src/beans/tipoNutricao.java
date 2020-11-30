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
public class tipoNutricao {
     private int IdNutri;
    private String nomeNutri;

    public int getIdNutri() {
        return IdNutri;
    }

    public void setIdNutri(int IdNutri) {
        this.IdNutri = IdNutri;
    }

    public String getNomeNutri() {
        return nomeNutri;
    }

    public void setNomeNutri(String nomeNutri) {
        this.nomeNutri = nomeNutri;
    }
    
     @Override
    public String toString() {
        return this.getNomeNutri();
    }
    
}
