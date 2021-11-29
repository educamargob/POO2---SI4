
package testabiblioteca;

public class Biblioteca {
     private String nome;
     private Livro livros[];
     private int qtdeLivros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.qtdeLivros = 0;
        this.livros = new Livro[100];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
    public void adicionarLivro(Livro l){
        this.livros[qtdeLivros] = l;
        this.qtdeLivros++;
    }
     
    public void mostraLivros(){
        System.out.println("----LIVROS----");
        
        for(int i = 0; i < qtdeLivros; i++){
            System.out.println("Livro " + i + ": " + this.livros[i].getTitulo());
            System.out.println("Autor do livro " + i + ": " + this.livros[i].getAutor().getNome());
        }
        System.out.println("-------------");
    }
}
