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
public class Dobro {
    public int ultimoValor;
    public static int instancias = 0;
    
    public Dobro(){
        instancias++;
    }
    public static int getInstancias(){
        return instancias;
    }
    
    public int dobro(int valor){
        ultimoValor = valor;
        
        return 2 * valor;
    }
}
