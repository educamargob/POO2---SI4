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
public class Capitulo {
    private Livro livro;
    private int num;
    private String titulo;

    public Capitulo(Livro livro, int num, String titulo) {
        this.livro = livro;
        this.num = num;
        this.titulo = titulo;
    }

    public int getNum() {
        return num;
    }

    public String getTitulo() {
        return titulo;
    }
    

    

    
    
    
    
}
