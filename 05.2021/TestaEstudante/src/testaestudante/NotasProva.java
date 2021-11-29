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
public class NotasProva{
    private String materia;
    private double nota;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void verificaMedia(){
        if(this.nota >= 6.0){
            System.out.println("O aluno está acima da média na matéria de " + this.materia);
        }else{
            System.out.println("O aluno está abaixo da média na matéria de " + this.materia);
        }
    }

}
