
package testaestudante;

public class TestaEstudante {

    public static void main(String[] args) {
        EstudanteEm em = new EstudanteEm(17, "Eduardo", 123456);
        EstudanteEs es = new EstudanteEs("Antonio", 5, 654321);
        
        es.mostraAluno();
        es.setNota(6);
        es.setMateria("Cálculo");
        es.mostraData();
        es.verificaMedia();
        
        
        em.mostraAluno();
        em.setNota(4);
        em.setMateria("Física");
        em.mostraData();
        em.verificaMedia();
    }
}
