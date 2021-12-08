/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import Conexao.DBController;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ecama
 */
public class TelaPrincipal extends javax.swing.JFrame {
    List<Funcionario> funcs;
    Funcionario f = new Funcionario();
    int funcSet;
    
    public TelaPrincipal(int funcSet) {
        this.funcSet = funcSet;
        initComponents();
        verificaSetor();
    }
    public void verificaSetor(){
        if(funcSet == 1){
            btnSolCompra.setEnabled(false);
            btnRelCompras.setEnabled(false);
            btnComprasAprovadas.setEnabled(false);
        }
        if(funcSet == 2){
            btnCadPessoa.setEnabled(false);
            btnCadSetor.setEnabled(false);
            btnPessoaSetor.setEnabled(false);
            btnComprasAprovadas.setEnabled(false);
        }
        if(funcSet == 3){
            btnSolCompra.setEnabled(false);
            btnRelCompras.setEnabled(false);
            btnCadPessoa.setEnabled(false);
            btnCadSetor.setEnabled(false);
            btnPessoaSetor.setEnabled(false);
        }if(funcSet == 4){
            
        }
    }
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadPessoa = new javax.swing.JButton();
        btnCadSetor = new javax.swing.JButton();
        btnPessoaSetor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSolicitarCompra = new javax.swing.JButton();
        btnSolCompra = new javax.swing.JButton();
        btnRelCompras = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnComprasAprovadas = new javax.swing.JButton();
        btnVerificaEntrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recursos Humanos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnCadPessoa.setText("Cadastro de Pessoas");
        btnCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPessoaActionPerformed(evt);
            }
        });

        btnCadSetor.setText("Cadastro de Setores");
        btnCadSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadSetorActionPerformed(evt);
            }
        });

        btnPessoaSetor.setText("Pessoas por setor");
        btnPessoaSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaSetorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPessoaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnCadPessoa)
                .addGap(44, 44, 44)
                .addComponent(btnCadSetor)
                .addGap(42, 42, 42)
                .addComponent(btnPessoaSetor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 58, 53));
        jLabel1.setText("Gestor Empresarial Guararapes");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ecama\\Pictures\\guaralogo.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnSolicitarCompra.setText("Realizar solicitação de Compra");
        btnSolicitarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarCompraActionPerformed(evt);
            }
        });

        btnSolCompra.setText("Solicitações de compra");
        btnSolCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolCompraActionPerformed(evt);
            }
        });

        btnRelCompras.setText("Relatório de compras");
        btnRelCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSolicitarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnSolicitarCompra)
                .addGap(44, 44, 44)
                .addComponent(btnSolCompra)
                .addGap(42, 42, 42)
                .addComponent(btnRelCompras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materiais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(310, 0));

        btnComprasAprovadas.setText("Compras aprovadas");
        btnComprasAprovadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasAprovadasActionPerformed(evt);
            }
        });

        btnVerificaEntrega.setText("Verifica entrega");
        btnVerificaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificaEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprasAprovadas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnComprasAprovadas)
                .addGap(41, 41, 41)
                .addComponent(btnVerificaEntrega)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPessoaActionPerformed
        TelaCadFunc telacad = new TelaCadFunc();
        telacad.setVisible(true);
    }//GEN-LAST:event_btnCadPessoaActionPerformed

    private void btnSolicitarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarCompraActionPerformed
        TelaSolicitaCompra telaCompra = new TelaSolicitaCompra();
        telaCompra.setVisible(true);
    }//GEN-LAST:event_btnSolicitarCompraActionPerformed

    private void btnComprasAprovadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasAprovadasActionPerformed
        TelaEntregaCompra telaEntrega = new TelaEntregaCompra();
        telaEntrega.setVisible(true);
    }//GEN-LAST:event_btnComprasAprovadasActionPerformed

    private void btnCadSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadSetorActionPerformed
        TelaCadSetor telaSetor = new TelaCadSetor();
        telaSetor.setVisible(true);
    }//GEN-LAST:event_btnCadSetorActionPerformed

    private void btnPessoaSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaSetorActionPerformed
        String arqRel = "E:\\Relatorios/";
        arqRel += "pessoas_setor.jasper";
        try {
            DBController db = new DBController();
            JasperReport rel = (JasperReport) 
                    JRLoader.loadObjectFromFile(arqRel);
            
            db.conectar();
            JasperPrint imp = JasperFillManager.fillReport(rel, 
                                                        null, db.getConexao());
            db.desconectar();
            
            JasperViewer v = new JasperViewer(imp, false);
            v.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            v.setTitle("Relatorio de Pessoas por Setor");
            
            v.setVisible(true);        
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnPessoaSetorActionPerformed

    private void btnSolCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolCompraActionPerformed
        TelaAprovaCompra telaAprCompra = new TelaAprovaCompra();
        telaAprCompra.setVisible(true);
    }//GEN-LAST:event_btnSolCompraActionPerformed

    private void btnRelComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelComprasActionPerformed
        String arqRel = "E:\\Relatorios/";
        arqRel += "RelatorioCompras.jasper";
        try {
            DBController db = new DBController();
            JasperReport rel = (JasperReport) 
                    JRLoader.loadObjectFromFile(arqRel);
            
            db.conectar();
            JasperPrint imp = JasperFillManager.fillReport(rel, 
                                                        null, db.getConexao());
            db.desconectar();
            
            JasperViewer v = new JasperViewer(imp, false);
            v.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            v.setTitle("Relatorio de Pessoas por Setor");
            
            v.setVisible(true);        
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnRelComprasActionPerformed

    private void btnVerificaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificaEntregaActionPerformed
        TelaVerificaEntrega telaVerEntrega = new TelaVerificaEntrega();
        telaVerEntrega.setVisible(true);
    }//GEN-LAST:event_btnVerificaEntregaActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadPessoa;
    private javax.swing.JButton btnCadSetor;
    private javax.swing.JButton btnComprasAprovadas;
    private javax.swing.JButton btnPessoaSetor;
    private javax.swing.JButton btnRelCompras;
    private javax.swing.JButton btnSolCompra;
    private javax.swing.JButton btnSolicitarCompra;
    private javax.swing.JButton btnVerificaEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
