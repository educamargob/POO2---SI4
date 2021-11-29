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
public class Livro {
    private String ISBN;
    private String titulo;
    private int nrCapitulos;
    private Autor Autor;
    private Capitulo caps[];
    private int contCaps;

    
    public Livro(String ISBN, String titulo, int nrCapitulos) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.nrCapitulos = nrCapitulos;
        this.contCaps = 0;
        caps = new Capitulo[nrCapitulos];
    }
    public void adicionarCapitulo(int num, String titulo){
        this.caps[contCaps] = new Capitulo(this, num, titulo);
        this.contCaps++;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNrCapitulos() {
        return nrCapitulos;
    }

    public void setNrCapitulos(int nrCapitulos) {
        this.nrCapitulos = nrCapitulos;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }
    public void mostraLivro(){
        System.out.println("Informações do livro:");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.Autor.getNome());
        System.out.println("Capitulos deste livro: ");
        for (int i = 0; i < contCaps; i++){
            System.out.println(this.caps[i].getNum() + " - " + this.caps[i].getTitulo());
        }
    }
    
}
