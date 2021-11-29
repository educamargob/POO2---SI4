/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09on;

/**
 *
 * @author ecama
 */
public class VidroEletrico {
    private int posicao;
    private boolean aberto;
    
    public VidroEletrico(int posicao){
        this.setPosicao(posicao);
    }
    
    public int getPosicao(){
        return this.posicao;
    }
    public void setPosicao(int posicao){
        if (posicao >= 0 && posicao <= 10){
            this.posicao = posicao;
            
            if(this.posicao == 10){
                this.aberto = false;
            }else{
                this.aberto = true;
            }
        }else{
            System.out.println("Posição deve ser entre 0 e 10.");
        }
    }
    
    public void subirVidro(){
        if(this.posicao >= 10){
            System.out.println("Vidro Já esta completamente fechado!");
        }else{
            this.posicao += 2;
            
        }
        if(this.posicao == 10){
            this.aberto = false;
        }
        
    }
    
    public void baixarVidro(){
        if(this.posicao <= 0){
            System.out.println("Vidro ja esta completamente aberto");
        }else{
            this.posicao -= 2;
            this.aberto = true;
        }
        
    }
    
    public void status(){
        System.out.println("Aberto? "+this.aberto);
        System.out.println("Posicao: "+this.posicao);
    }
    
    
    
}



