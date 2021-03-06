/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ecama
 */
public class TelaAprovaCompra extends javax.swing.JFrame {
    List<ComprasSolicitadas> compras;
    List<Produto> produtos;
    List<Funcionario> funcionarios;
    int compraAtual = 0;
    boolean atualizando = true;

    public TelaAprovaCompra() {
        initComponents();
        carregaCompras();
    }
    public void carregaCompras(){
        try{
            produtos = Produto.buscaProdutos();
            compras = ComprasSolicitadas.buscaCompras();
            funcionarios = Funcionario.buscaFuncionarios();
            preencheCampos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao carregar Compras!");
            this.dispose();
        }
    }
    
    
    public void preencheCampos(){
        edtCodigo.setEnabled(false);
        edtSolicitante.setEnabled(false);
        edtProduto.setEnabled(false);
        edtValor.setEnabled(false);
        edtDataHora.setEnabled(false);
        edtAprovada.setEnabled(false);
        
        if (compras.size() > 0) {
            edtCodigo.setText(String.valueOf(compras.get(compraAtual).getId()));
            int nFunc = compras.get(compraAtual).getSolicitante();
            edtSolicitante.setText(funcionarios.get(nFunc).getNome());
            int nProd = compras.get(compraAtual).getProduto();
            edtProduto.setText(produtos.get(nProd).getNome());
            Double valor = compras.get(compraAtual).getValor_total();
            edtValor.setText(String.valueOf(valor));
            edtDataHora.setText(compras.get(compraAtual).getDatahora());
            edtAprovada.setText(compras.get(compraAtual).getAprovada());
            
            if (compraAtual == 0) {
                btnAnterior.setEnabled(false);
            }
            else {
                btnAnterior.setEnabled(true);
            }

            if (compraAtual == compras.size() - 1) {
                btnProximo.setEnabled(false);
            }
            else {
                btnProximo.setEnabled(true);
            }
        }
        else {
            edtCodigo.setText("Autom??tico...");
            btnAnterior.setEnabled(false);
            btnProximo.setEnabled(false);
            btnAprovar.setEnabled(false);
            atualizando = false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        edtSolicitante = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAprovar = new javax.swing.JButton();
        edtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtDataHora = new javax.swing.JTextField();
        btnRecusar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edtAprovada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aprovar Solicita????es");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informa????es", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("C??digo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Solicitante");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Valor Total");

        edtCodigo.setEditable(false);
        edtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodigoActionPerformed(evt);
            }
        });

        edtSolicitante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSolicitanteActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Pr??ximo>>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnAprovar.setText("Aprovar");
        btnAprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovarActionPerformed(evt);
            }
        });

        edtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Data/hora");

        edtDataHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnRecusar.setText("Recusar");
        btnRecusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecusarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Aprovada?");

        edtAprovada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Produto");

        edtProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(edtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtCodigo)
                                .addComponent(edtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(btnProximo)))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 60, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtProduto)
                                .addGap(60, 60, 60))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39)
                        .addComponent(edtAprovada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(btnAprovar)
                .addGap(18, 18, 18)
                .addComponent(btnRecusar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(edtAprovada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnAprovar)
                    .addComponent(btnRecusar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodigoActionPerformed

    }//GEN-LAST:event_edtCodigoActionPerformed

    private void edtSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSolicitanteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        compraAtual--;
        preencheCampos();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        compraAtual++;
        preencheCampos();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovarActionPerformed
        String id = edtCodigo.getText();
        int solicitante = compras.get(compraAtual).getSolicitante();
        String valor_total = edtValor.getText();
        String datahora = edtDataHora.getText();
        
        ComprasSolicitadas c = new ComprasSolicitadas();
        c.setId(Integer.parseInt(id));
        c.setSolicitante(solicitante);
        c.setValor_total(Double.parseDouble(valor_total));
        c.setDatahora(datahora);
        c.setAprovada("Sim");
        try{
            c.atualizar();

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        atualizando = true;
        carregaCompras();
        JOptionPane.showMessageDialog(this, "Compra foi aprovada");
                                             
    }//GEN-LAST:event_btnAprovarActionPerformed

    private void edtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtProdutoActionPerformed

    private void btnRecusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecusarActionPerformed
        String id = edtCodigo.getText();
        int solicitante = compras.get(compraAtual).getSolicitante();
        String valor_total = edtValor.getText();
        String datahora = edtDataHora.getText();

        ComprasSolicitadas c = new ComprasSolicitadas();
        c.setId(Integer.parseInt(id));
        c.setSolicitante(solicitante);
        c.setValor_total(Double.parseDouble(valor_total));
        c.setDatahora(datahora);
        c.setAprovada("N??o");
        try{
            c.atualizar();

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        atualizando = true;
        carregaCompras();
        JOptionPane.showMessageDialog(this, "Compra recusada");
    }//GEN-LAST:event_btnRecusarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAprovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAprovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAprovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAprovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAprovaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAprovar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnRecusar;
    private javax.swing.JTextField edtAprovada;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtDataHora;
    private javax.swing.JTextField edtProduto;
    private javax.swing.JTextField edtSolicitante;
    private javax.swing.JTextField edtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
