/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testabiblioteca;

/**
 *
 * @author ecama
 */
public class Autor {
    private String nome;
    private String formacao;
    
    public Autor(String nome, String formacao){
        this.nome = nome;
        this.formacao = formacao;
    }     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
    
}
