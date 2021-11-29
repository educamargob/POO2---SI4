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
public class Aula09on {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VidroEletrico m1 = new VidroEletrico(10);
            m1.subirVidro();
            m1.subirVidro();
            m1.subirVidro();
            m1.subirVidro();
            m1.subirVidro();
            m1.subirVidro();
            m1.status();
            //System.out.println("Posião: "+ m1.getPosicao());
            m1.setPosicao(2);
            m1.status();
    }
    
}
