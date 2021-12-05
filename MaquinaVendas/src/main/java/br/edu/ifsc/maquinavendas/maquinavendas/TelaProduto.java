/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.maquinavendas.maquinavendas;

import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TelaProduto extends javax.swing.JFrame {
    List<Produto> prods;
    int prodAtual = 0;
    boolean atualizando = true;
    
    public TelaProduto() {
        initComponents();
        carregaProdutos();
    }

    public void carregaProdutos(){
        try{
            prods = Produto.buscaProdutos();
            preencheCampos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao carregar produtos!");
            this.dispose();
        }
    }
    
    public void preencheCampos(){
        edtCodigo.setEnabled(false);
        
        if (prods.size() > 0) {
            edtCodigo.setText(String.valueOf(prods.get(prodAtual).getId()));
            edtDescr.setText(prods.get(prodAtual).getDescr());
            edtPreco.setText(String.valueOf(prods.get(prodAtual).getPreco()));
            edtImagem.setText(prods.get(prodAtual).getImagem());
            
            if (prodAtual == 0) {
                btnAnterior.setEnabled(false);
            }
            else {
                btnAnterior.setEnabled(true);
            }

            if (prodAtual == prods.size() - 1) {
                btnProximo.setEnabled(false);
            }
            else {
                btnProximo.setEnabled(true);
            }
        }
        else {
            edtCodigo.setText("Automático...");
            btnAnterior.setEnabled(false);
            btnProximo.setEnabled(false);
            btnAdicionar.setEnabled(false);
            atualizando = false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcImagem = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        edtDescr = new javax.swing.JTextField();
        edtPreco = new javax.swing.JTextField();
        edtImagem = new javax.swing.JTextField();
        btnSel = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        fcImagem.setCurrentDirectory(new java.io.File("C:\\"));

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setResizable(false);

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
            jLabel1.setText("Código");

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
            jLabel2.setText("Descrição");

            jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
            jLabel3.setText("Preço");

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
            jLabel4.setText("Imagem");

            edtCodigo.setEditable(false);
            edtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            edtCodigo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    edtCodigoActionPerformed(evt);
                }
            });

            edtDescr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

            edtPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

            edtImagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            edtImagem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    edtImagemActionPerformed(evt);
                }
            });

            btnSel.setText("SELECIONAR");
            btnSel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSelActionPerformed(evt);
                }
            });

            btnAnterior.setText("<<Anterior");
            btnAnterior.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAnteriorActionPerformed(evt);
                }
            });

            btnProximo.setText("Próximo>>");
            btnProximo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnProximoActionPerformed(evt);
                }
            });

            btnAdicionar.setText("+ADD");
            btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAdicionarActionPerformed(evt);
                }
            });

            btnSalvar.setText("Salvar");
            btnSalvar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSalvarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(edtImagem)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(58, 58, 58)
                                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edtDescr)
                                        .addComponent(edtPreco)
                                        .addComponent(btnSel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAnterior)
                            .addGap(31, 31, 31)
                            .addComponent(btnProximo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(btnAdicionar)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvar)))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(btnSel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(edtImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnterior)
                        .addComponent(btnProximo)
                        .addComponent(btnAdicionar)
                        .addComponent(btnSalvar))
                    .addContainerGap(26, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void edtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodigoActionPerformed
        
    }//GEN-LAST:event_edtCodigoActionPerformed

    private void edtImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtImagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtImagemActionPerformed

    private void btnSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelActionPerformed
        int ret = fcImagem.showOpenDialog(this);
        if(ret == JFileChooser.APPROVE_OPTION){
            File img = fcImagem.getSelectedFile();
            edtImagem.setText(img.getAbsolutePath());
        }
    }//GEN-LAST:event_btnSelActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        prodAtual--;
        preencheCampos();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        prodAtual++;
        preencheCampos();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        edtCodigo.setText("Automático...");
        edtDescr.setText("");
        edtPreco.setText("");
        edtImagem.setText("Selecione...");
        atualizando = false;
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String descr = edtDescr.getText();
        String preco = edtPreco.getText();
        String img = edtImagem.getText();
        
        if(descr.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar a Descrição");
            return;
        }
        if(preco.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar o Preço");
            return;
        }
        if(img.equals("Selecione...")){
            JOptionPane.showMessageDialog(this,"Você deve selecionar uma Imagem");
            return;
        }
        
        Produto p = new Produto();
        p.setDescr(descr);
        p.setPreco(Double.parseDouble(preco));
        p.setImagem(img.replace("\\", "\\\\"));
        
        try{
            if(atualizando){
                p.atualizar();
            }else{
                p.adicionar();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
            atualizando = true;
            carregaProdutos();
            JOptionPane.showMessageDialog(this, "Produto salvo com Sucesso");
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSel;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtDescr;
    private javax.swing.JTextField edtImagem;
    private javax.swing.JTextField edtPreco;
    private javax.swing.JFileChooser fcImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
