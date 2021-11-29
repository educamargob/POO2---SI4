/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula03;

/**
 *
 * @author eduardo.borges
 */
public class CursoAula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.tampar();
        c1.status();
    }
    
}
