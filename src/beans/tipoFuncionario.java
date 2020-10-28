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
public class tipoFuncionario {
    private int IdFunc;
    private String nome;

    public int getIdFunc() {
        return IdFunc;
    }

    public void setIdFunc(int IdFunc) {
        this.IdFunc = IdFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
    
    
}
