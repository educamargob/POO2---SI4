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
public class SeguroVeiculo extends Servico {
    private String veiculo;
    private double valorSeguro;
    private double franquia;
    
    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }
    
    
}
