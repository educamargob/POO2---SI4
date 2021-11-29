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
public class TestaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor a1 = new Autor("José da Sliva","Segundo Grau completo");
        Autor a2 = new Autor("Pedro da Sliva","EM Completo");
        Livro l1 = new Livro("1234", "POOI",3);
        
        l1.setAutor(a1);
        
        Livro l2 = new Livro("4321", "POOII",10);
        
        l1.adicionarCapitulo(1, "Introduçao");
        l1.adicionarCapitulo(2, "Borsa");
        l1.mostraLivro();
        


    }
    
}
