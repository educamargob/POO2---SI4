package cursoaula04;

/**
 *
 * @author eduardo.borges
 */
public class CursoAula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarelo");
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
    
}
