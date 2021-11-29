/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaservico;

/**
 *
 * @author ecama
 */
public class Servico {
    private int id;
    private Cliente contratante;
    private Funcionario atendente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getContratante() {
        return contratante;
    }

    public void setContratante(Cliente contratante) {
        this.contratante = contratante;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }
    
    
}
