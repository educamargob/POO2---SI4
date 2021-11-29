/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaservico;

/**
 *
 * @author ecama
 */
public class TestaServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emprestimo s = new Emprestimo();
        Cliente c = new Cliente(1, "Samuel");
        Funcionario f = new Funcionario(100, "Joao", "Gerente");
        Emprestimo emp = new Emprestimo();
        
        emp.setId(1);
        emp.setContratante(c);
        emp.setAtendente(f);
        
        emp.setTaxa(2);
        emp.setValor(10000);
        
        SeguroVeiculo seg = new SeguroVeiculo();
        
        seg.setId(2);
        seg.setContratante(c);
        seg.setAtendente(f);
        
        seg.setFranquia(2000);
        seg.setValorSeguro(1500);
        seg.setVeiculo("Gol");
    }
    
}
