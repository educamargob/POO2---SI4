/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06b;

/**
 *
 * @author ecama
 */
public class Retangulo {
    private int largura, altura;
    
    public Retangulo(int largura, int altura) throws Exception{
        
        setTamanho(largura, altura);
    }
    
    public void setTamanho(int largura, int altura) throws Exception{
        if(largura >= 0 && altura >= 0){
            this.largura = largura;
            this.altura = altura;
        }
        else{
            throw new RuntimeException("Dimensões borsa");
        }
    }
}
