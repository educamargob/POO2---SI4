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
public class EstudanteEs extends NotasProva{
    private String nome; // Nome do aluno
    private int materiasCad; //numero de matérias cadastradas
    private int numMatricula; // numero da matricula
    private Datas data = new Datas(10, 02, 2021);
    
    public EstudanteEs(String nome, int materiasCad, int numMatricula) {
        this.nome = nome;
        this.materiasCad = materiasCad;
        this.numMatricula = numMatricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMateriasCad() {
        return materiasCad;
    }
    public void setMateriasCad(int materiasCad) {
        this.materiasCad = materiasCad;
    }
    public int getNumMatricula() {
        return numMatricula;
    }
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    public void aumentaMateria(){ // Aumenta o numero de materias matriculadas
        this.numMatricula += 1;
    }
    public void diminuiMateria(){ // Diminui o numero de materias matriculadas
        this.numMatricula -= 1;
    }
      public void mostraAluno(){
        System.out.println("\nAluno: " + this.nome + "\nMaterias Cadastradas: " + this.materiasCad + "\nMatricula: " + this.numMatricula);
    }
    public void mostraData(){
        System.out.println("Matriculado no dia: " + this.data.getDia() + " / " + this.data.getMes() + " / " + this.data.getAno());
    }
}
