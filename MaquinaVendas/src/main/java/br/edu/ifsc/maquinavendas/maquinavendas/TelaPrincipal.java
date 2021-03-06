/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.maquinavendas.maquinavendas;

import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ecama
 */
public class TelaPrincipal extends javax.swing.JFrame {
        List<Produto> prods;
        List<FormaPgto> formas;
        
        

    public TelaPrincipal() {
        initComponents();
        carregaProdutos();
    }
    
    public void carregaProdutos(){
        try{
            prods = Produto.buscaProdutos();
            if (prods.size() > 0){
                ImageIcon img1 = new ImageIcon(prods.get(0).getImagem());
                lblImg1.setIcon(img1);
                lblCod1.setText(String.valueOf(prods.get(0).getId()));
                lblDescr1.setText(prods.get(0).getDescr());
                lblPreco1.setText("R$ " + prods.get(0).getPreco());
            }
            if (prods.size() > 1){
                ImageIcon img2 = new ImageIcon(prods.get(1).getImagem());
                lblImg2.setIcon(img2);
                lblCod2.setText(String.valueOf(prods.get(1).getId()));
                lblDescr2.setText(prods.get(1).getDescr());
                lblPreco2.setText("R$ " + prods.get(1).getPreco());
            }
            if (prods.size() > 2){
                ImageIcon img3 = new ImageIcon(prods.get(2).getImagem());
                lblImg3.setIcon(img3);
                lblCod3.setText(String.valueOf(prods.get(2).getId()));
                lblDescr3.setText(prods.get(2).getDescr());
                lblPreco3.setText("R$ " + prods.get(2).getPreco());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.exit(-1);
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblCod1 = new javax.swing.JLabel();
        lblCod2 = new javax.swing.JLabel();
        lblCod3 = new javax.swing.JLabel();
        lblDescr1 = new javax.swing.JLabel();
        lblDescr2 = new javax.swing.JLabel();
        lblDescr3 = new javax.swing.JLabel();
        lblPreco1 = new javax.swing.JLabel();
        lblPreco2 = new javax.swing.JLabel();
        lblPreco3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        lblProdSel = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnGerenciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DRINK MACHINE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Tai Le", 1, 14))); // NOI18N

        lblCod1.setText("lblCod1");

        lblCod2.setText("lblCod2");

        lblCod3.setText("lblCod3");

        lblDescr1.setText("lblDescr1");

        lblDescr2.setText("lblDescr2");

        lblDescr3.setText("lblDescr3");

        lblPreco1.setText("lblPreco1");

        lblPreco2.setText("lblPreco2");

        lblPreco3.setText("lblPreco3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescr1)
                            .addComponent(lblCod1)
                            .addComponent(lblPreco1))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescr2)
                            .addComponent(lblCod2)
                            .addComponent(lblPreco2))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreco3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCod3)
                            .addComponent(lblDescr3))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblImg1)
                        .addGap(103, 103, 103)
                        .addComponent(lblImg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImg3)
                        .addGap(67, 67, 67))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImg1)
                    .addComponent(lblImg2)
                    .addComponent(lblImg3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod1)
                    .addComponent(lblCod2)
                    .addComponent(lblCod3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescr1)
                    .addComponent(lblDescr2)
                    .addComponent(lblDescr3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco1)
                    .addComponent(lblPreco2)
                    .addComponent(lblPreco3))
                .addGap(25, 25, 25))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de Op????es", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Tai Le", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Digite o C??digo");

        edtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodigoActionPerformed(evt);
            }
        });
        edtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCodigoKeyTyped(evt);
            }
        });

        lblProdSel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProdSel.setText("lblProdSel");

        btnComprar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnGerenciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGerenciar.setText("Gerenciar");
        btnGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCodigo)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(btnComprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 121, Short.MAX_VALUE)
                        .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProdSel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblProdSel)
                .addGap(31, 31, 31)
                .addComponent(btnComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCodigoActionPerformed

    private void edtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCodigoKeyReleased
        String cod = edtCodigo.getText();
        String descr = "";
        if(cod.length() > 0){
            Integer codProd = Integer.parseInt(cod);
            
            for(Produto p : prods){
                if(p.getId() == codProd){
                    descr = p.getDescr();
                }
            }
            lblProdSel.setText(descr);
        }
    }//GEN-LAST:event_edtCodigoKeyReleased

    private void edtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCodigoKeyTyped
        char key = evt.getKeyChar();
        if(key < 48 || key > 57){
            evt.consume();
        }
    }//GEN-LAST:event_edtCodigoKeyTyped

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        String codProd = edtCodigo.getText();
        Integer cod = -1;
        Object sel;
        Produto prod = null;
        FormaPgto forma = null;
                
        if (codProd.length() > 0) {
            cod = Integer.parseInt(codProd);
        } else {
            JOptionPane.showMessageDialog(this, "Voc?? deve informar um Produto");
            return;
        }
        
        for (Produto p : prods) {
            if (p.getId() == cod) {
                prod = p;
            }
        }
        
        if (prod == null) {
            JOptionPane.showMessageDialog(this, "Produto inv??lido!");
            return;
        }
        
        try {
            formas = FormaPgto.buscaFormasPgto();
            Object[] opcoes = formas.stream().map(f -> f.getDescr())
                    .collect(Collectors.toList()).toArray();
            sel = JOptionPane.showInputDialog(this,
                    "Selecione a Forma de Pagamento...", "Formas de Pagamento",
                    JOptionPane.QUESTION_MESSAGE, null, 
                    opcoes, opcoes[0]);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }
        
        for (FormaPgto f : formas) {
            if (f.getDescr().equals(sel)) {
                forma = f;
            }
        }
        
        if (forma != null) {
            Venda reg = new Venda(prod, forma);
            try {
                reg.salvar();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, 
                    ex.getMessage());
                return;
            }
            
            JOptionPane.showMessageDialog(this, 
                    "Venda confirmada! Retire seu produto.");
        }
        else {
            JOptionPane.showMessageDialog(this, 
                    "Voc?? deve informar uma Forma de Pagamento!");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarActionPerformed
        TelaAdmin adm = new TelaAdmin();
        
        adm.setVisible(true);
    }//GEN-LAST:event_btnGerenciarActionPerformed

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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnGerenciar;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCod1;
    private javax.swing.JLabel lblCod2;
    private javax.swing.JLabel lblCod3;
    private javax.swing.JLabel lblDescr1;
    private javax.swing.JLabel lblDescr2;
    private javax.swing.JLabel lblDescr3;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblPreco2;
    private javax.swing.JLabel lblPreco3;
    private javax.swing.JLabel lblProdSel;
    // End of variables declaration//GEN-END:variables
}
