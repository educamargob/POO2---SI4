/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula05;

import java.util.Scanner;

/**
 *
 * @author eduardo.borges
 */
public class Conta {
    Scanner sc = new Scanner(System.in);
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(int numConta, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = true;
    }
   
    public void abrirConta(){
        this.status = true;
        System.out.println("Que tipo de conta deseja? \n CC para conta corrente \n CP para conta poupança");  
        String t = sc.nextLine();
        this.setTipo(t);
        if(this.tipo.equals("CC")){
            System.out.println("Conta Corrente criada com sucesso");
            this.saldo = 50;
        }else if(this.tipo.equals("CP")){
            System.out.println("Conta poupança criada com sucesso");
           this.saldo = 150;
        }else{
            System.out.println("Não existe esse tipo de conta");
        }
    }   

    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.status = false;
        }else{
            System.out.println("Ainda há pendencias em sua conta");
        }
    }
    public void depositar(){
        if(this.isStatus() == true){
            System.out.println("Quanto deseja depositar?");
            float dep = sc.nextFloat();
            this.setSaldo(this.getSaldo() + dep);
            System.out.println("Foi depositado R$ " + dep + " Saldo final de: R$ " + this.getSaldo());
        }else{
            System.out.println("Sua conta esta fechada");
        }
    }
    
    public void sacar(){
        if(this.isStatus() == true){
            System.out.println("Quanto desjea sacar?");
            float sac = sc.nextFloat();
            if(sac <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - sac);
                System.out.println("Foi sacado R$ " + sac + " Saldo final de: R$ " + this.getSaldo());
            }else{
                System.out.println("Quantia maior que existente em conta!");
            }
        }else{
            System.out.println("Sua conta esta fechada");
        }
    }
    
    public void pagarMensal(){
        if(this.getTipo().equals("CC")){
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("Foi pago R$ 12,00 de mensalidade, saldo final de: R$ " + this.getSaldo());
        }else{
            this.setSaldo(this.getSaldo() - 20);
            System.out.println("Foi pago R$ 20,00 de mensalidade, saldo final de: R$ " + this.getSaldo());
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }
}
