/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaestudante;


/**
 *
 * @author ecama
 */
public class EstudanteEm extends NotasProva {
    private int idade; // Idade do aluno
    private String nome; // Nome do aluno
    private int numMatricula; // numero da matricula
    private Datas data = new Datas(05, 03, 2020);

    public EstudanteEm(int idade, String nome, int numMatricula) {
        this.idade = idade;
        this.nome = nome;
        this.numMatricula = numMatricula;
    }

    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    public void mostraAluno(){
        System.out.println("\nAluno: " + this.nome + "\nIdade: " + this.idade + "\nMatricula: " + this.numMatricula);
    }
    public void mostraData(){
        System.out.println("Matriculado no dia: " + this.data.getDia() + " / " + this.data.getMes() + " / " + this.data.getAno());
    }
}
