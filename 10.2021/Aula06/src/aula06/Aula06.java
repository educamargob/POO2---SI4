/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author ecama
 */
public class Aula06 {

    private final static int MAX = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < MAX; i++){
            System.out.println(i);
        }
        Dobro d1 = new Dobro();
        
        System.out.println("Nr de instâncias: " + d1.instancias);
        
        Dobro d2 = new Dobro();
        
        System.out.println("Nr de instâncias: " + d1.instancias);
        
        Dobro d3 = new Dobro();
        Dobro d4 = new Dobro();
        Dobro d5 = new Dobro();
        
        System.out.println("Numero de instancias agora: " + Dobro.getInstancias());
    }
    
}
