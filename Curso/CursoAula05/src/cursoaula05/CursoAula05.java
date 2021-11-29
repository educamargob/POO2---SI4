/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula05;

/**
 *
 * @author eduardo.borges
 */
public class CursoAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta cont1 = new Conta(123456, "Ântonio");
        System.out.println(cont1.getSaldo());
        cont1.abrirConta();
        cont1.fecharConta();
        cont1.depositar();
        cont1.sacar();
        cont1.pagarMensal();
    }
    
}
