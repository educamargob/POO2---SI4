/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ecama
 */
public class TestaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela de Exemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
       
       createGridLayoutWindow(frame);
        
     
        frame.setVisible(true);
    }
   
    private static void criaJanela(JFrame f){
         JButton btn1 = new JButton("Botão 1");
        btn1.addActionListener(evt -> JOptionPane.showMessageDialog(f,"Deu merda", "Mensagem", JOptionPane.ERROR_MESSAGE));
        
        f.getContentPane(). add(btn1);
    }
    private static void criaJanela2(JFrame f){
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        btn1.addActionListener(evt -> JOptionPane.showMessageDialog(f,"Clicou no botão"));
        
        f.getContentPane(). add(btn1);
        f.getContentPane(). add(btn2);
    }
    
    private static void createBorderLayoutWindow(JFrame f){
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        f.getContentPane(). add(btn1, BorderLayout.PAGE_START);
        f.getContentPane(). add(btn2, BorderLayout.PAGE_END);
    }
    
    private static void createFlowLayoutWindow(JFrame f){
        FlowLayout layout = new FlowLayout();
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão 3");
        JButton btn4 = new JButton("Botão 4");
        
        btn1.addActionListener(evt -> onBtn1Click(evt));
        
        f.getContentPane().setLayout(layout);
        f.getContentPane().add(btn1);
        f.getContentPane().add(btn2);
        f.getContentPane().add(btn3);
        f.getContentPane().add(btn4);
    }
    
    private static void createGridLayoutWindow(JFrame f){
        GridLayout layout = new GridLayout(0, 2);
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão 3");
        JButton btn4 = new JButton("Botão 4");
        
        f.getContentPane().setLayout(layout);
        
        btn1.addActionListener(evt -> onBtn1Click(evt));
        btn2.addActionListener(evt -> onBtn2Click());
        
        f.getContentPane().add(btn1);
        f.getContentPane().add(btn2);
    }
    
    //Ao clicar no botão iniciará essa função
    private static void onBtn1Click(ActionEvent e){
        String nome = JOptionPane.showInputDialog(null,"Digite o nome: ");
        
        if(nome != null && nome.length() > 0){
            JOptionPane.showMessageDialog(null, "Nome informado: " + nome);
        }else{
            JOptionPane.showMessageDialog(null, "Nome não Informado");
        }
    }
    private static void onBtn2Click(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "O que fazer?", JOptionPane.YES_NO_OPTION);
        
        if(resp == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Usuario escolheu SIM");
        }else{
            JOptionPane.showMessageDialog(null, "Usuario escolheu NÃO");
        }
    }
}
