/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula02;

/**
 *
 * @author eduardo.borges
 */
public class CursoAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();  
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Biczada";
        c2.cor = "Vermelho";
        c2.ponta = 0.7f;
        c2.destampar();
        c2.rabiscar();
    }
    
}
