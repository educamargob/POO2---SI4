/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TelaCadFunc extends javax.swing.JFrame {
    List<Funcionario> funcs;
    int funcAtual = 0;
    boolean atualizando = true;
    
    public TelaCadFunc() {
        initComponents();
        carregaFuncionarios();
    }

    public void carregaFuncionarios(){
        try{
            funcs = Funcionario.buscaFuncionarios();
            preencheCampos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao carregar Funcionarios!");
            this.dispose();
        }
    }
    
    public void preencheCampos(){
        edtCodigo.setEnabled(false);
        
        if (funcs.size() > 0) {
            edtCodigo.setText(String.valueOf(funcs.get(funcAtual).getId()));
            edtNome.setText(funcs.get(funcAtual).getNome());
            edtCpf.setText(funcs.get(funcAtual).getCpf());
            edtNasc.setText(funcs.get(funcAtual).getDatanasc());
            edtLogin.setText(funcs.get(funcAtual).getLogin());
            edtSenha.setText(funcs.get(funcAtual).getSenha());
            edtSetor.setText(funcs.get(funcAtual).getSetor().toString());
            if(funcs.get(funcAtual).getSetor().toString().equals("1")){
                lblSetor.setText("Recursos Humanos");
            }else if(funcs.get(funcAtual).getSetor().toString().equals("2")){
                lblSetor.setText("Compras");
            }else if(funcs.get(funcAtual).getSetor().toString().equals("3")){
                lblSetor.setText("Almoxarifado");
            }else if(funcs.get(funcAtual).getSetor().toString().equals("4")){
                lblSetor.setText("Diretoria");
            }else{
                lblSetor.setText(funcs.get(funcAtual).getSetor().toString());
            }
            edtFuncao.setText(funcs.get(funcAtual).getFuncao().toString());
            if(funcs.get(funcAtual).getFuncao().toString().equals("1")){
                lblFuncao.setText("Recrutador");
            }else if(funcs.get(funcAtual).getFuncao().toString().equals("2")){
                lblFuncao.setText("Gerente de RH");
            }else if(funcs.get(funcAtual).getFuncao().toString().equals("3")){
                lblFuncao.setText("Comprador");
            }else if(funcs.get(funcAtual).getFuncao().toString().equals("4")){
                lblFuncao.setText("Gerente de compras");
            }else if(funcs.get(funcAtual).getFuncao().toString().equals("5")){
                lblFuncao.setText("Almoxarife");
            }else if(funcs.get(funcAtual).getFuncao().toString().equals("6")){
                lblFuncao.setText("Gerente do almoxarifado");
            }else if(funcs.get(funcAtual).getFuncao().toString().equals("7")){
                lblFuncao.setText("Diretor");
            }else{
                lblFuncao.setText(funcs.get(funcAtual).getFuncao().toString());
            }
            
            
            
            if (funcAtual == 0) {
                btnAnterior.setEnabled(false);
            }
            else {
                btnAnterior.setEnabled(true);
            }

            if (funcAtual == funcs.size() - 1) {
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

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        edtLogin = new javax.swing.JTextField();
        edtSenha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edtNasc = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edtSetor = new javax.swing.JTextField();
        edtFuncao = new javax.swing.JTextField();
        edtCpf = new javax.swing.JFormattedTextField();
        lblSetor = new javax.swing.JLabel();
        lblFuncao = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionarios");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Nascimento");

        edtCodigo.setEditable(false);
        edtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodigoActionPerformed(evt);
            }
        });

        edtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        edtLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Login");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Senha");

        try {
            edtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNascActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("SetorID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("FunçãoID");

        edtSetor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edtFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            edtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCpfActionPerformed(evt);
            }
        });

        lblSetor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSetor.setText("jLabel9");

        lblFuncao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFuncao.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addGap(31, 31, 31)
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtCodigo)
                                    .addComponent(edtNome)
                                    .addComponent(edtNasc)
                                    .addComponent(edtSenha)
                                    .addComponent(edtCpf)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(edtFuncao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                            .addComponent(edtSetor, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSetor)
                                            .addComponent(lblFuncao)))
                                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSetor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(edtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncao))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnAdicionar)
                    .addComponent(btnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        funcAtual--;
        preencheCampos();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        funcAtual++;
        preencheCampos();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        edtCodigo.setText("Automático...");
        edtNome.setText("");
        edtCpf.setText("");
        edtNasc.setText("");
        edtLogin.setText("");
        edtSenha.setText("");
        edtSetor.setText("");
        edtFuncao.setText("");
        atualizando = false;
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String id = edtCodigo.getText();
        System.out.println(id);
        String nome = edtNome.getText();
        String cpf = edtCpf.getText();
        String nasc = edtNasc.getText();
        String login = edtLogin.getText();
        String senha = edtSenha.getText();
        String setor = edtSetor.getText();
        String funcao = edtFuncao.getText();


        if(nome.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar o nome");
            return;
        }
        if(cpf.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar o CPF");
            return;
        }
        if(nasc.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar a data de nascimento");
            return;
        }
        if(login.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar o login do usuario");
            return;
        }
        if(senha.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar a senhga do usuario");
            return;
        }
        if(setor.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar o setor");
            return;
        }
        if(funcao.length() == 0){
            JOptionPane.showMessageDialog(this,"Você deve informar a função");
            return;
        }

        Funcionario f = new Funcionario();
        if(id.equals("Automático...")){
            f.setNome(nome);
            f.setCpf(cpf);
            f.setDatanasc(nasc);
            f.setLogin(login);
            f.setSenha(senha);
            f.setSetor(Integer.parseInt(setor));
            f.setFuncao(Integer.parseInt(funcao));
        }else{
            f.setId(Integer.parseInt(id));
            f.setNome(nome);
            f.setCpf(cpf);
            f.setDatanasc(nasc);
            f.setLogin(login);
            f.setSenha(senha);
            f.setSetor(Integer.parseInt(setor));
            f.setFuncao(Integer.parseInt(funcao)); 
        }
            try{
                if(atualizando){
                    f.atualizar();
                }else{
                    f.adicionar();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                return;
            }
            atualizando = true;
            carregaFuncionarios();
            JOptionPane.showMessageDialog(this, "Funcionario salvo com Sucesso");

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void edtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCpfActionPerformed

    private void edtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNascActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JFormattedTextField edtCpf;
    private javax.swing.JTextField edtFuncao;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JFormattedTextField edtNasc;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JTextField edtSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblSetor;
    // End of variables declaration//GEN-END:variables
}
