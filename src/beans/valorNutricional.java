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
public class valorNutricional {
    int produtoId;
    int TipoNutri;
    int valor;

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getTipoNutri() {
        return TipoNutri;
    }

    public void setTipoNutri(int TipoNutri) {
        this.TipoNutri = TipoNutri;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
