/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjmenu1;

import javax.swing.JOptionPane;
import classeConexao.ClasseConexaoJava;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author lucas
 */
public class frmCadFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form frmCadFuncionario
     */
    public frmCadFuncionario() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtIdFunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeFunc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRgFunc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodRes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenhaFunc = new javax.swing.JTextField();
        txtTipoFunc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 141, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("ID do funcionário");

        txtIdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFuncActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de funcionário");

        jLabel4.setText("Nome");

        txtNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncActionPerformed(evt);
            }
        });

        jLabel5.setText("Rg");

        txtRgFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgFuncActionPerformed(evt);
            }
        });

        jLabel6.setText("Código restaurante");

        txtCodRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodResActionPerformed(evt);
            }
        });

        jLabel7.setText("Senha do funcionário");

        txtSenhaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaFuncActionPerformed(evt);
            }
        });

        txtTipoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSenhaFunc)
                        .addComponent(txtIdFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(txtNomeFunc)
                        .addComponent(txtRgFunc)
                        .addComponent(txtCodRes))
                    .addComponent(txtTipoFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTipoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodRes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(240, 141, 60));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR ");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSair.setText("FECHAR");
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar um novo funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFuncActionPerformed

    private void txtNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncActionPerformed

    private void txtRgFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgFuncActionPerformed

    
    ClasseConexaoJava con;
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

       con = new ClasseConexaoJava();
           boolean resultado = con.conectar();
        if (resultado == true){
            try{
                    PreparedStatement patmt = con.getConn().prepareStatement("INSERT INTO tbAgente(tipoAgenteID, agenteLogin, agenteSenha, agenteSalt) VALUES(2,? , ?, '0000000000000000000000000000000000000000000000000000000000000000')  INSERT INTO tbFuncionario(tipoFuncionarioID, agenteID, funcionarioNome, funcionarioRG, restauranteID, funcionarioSituacao) VALUES (?, (select agenteId from tbAgente where agenteLogin =? and agentesenha = ?), ?,? , ?, 1)");
                patmt.setString(1,txtIdFunc.getText().trim());
                patmt.setString(2,txtSenhaFunc.getText().trim());
                patmt.setInt(3,Integer.parseInt(txtTipoFunc.getText()));
                patmt.setString(4,txtIdFunc.getText().trim());
                patmt.setString(5,txtSenhaFunc.getText().trim());
                
                patmt.setString(6,txtNomeFunc.getText().trim());
                
                patmt.setString(7,(txtRgFunc.getText().trim()));
                patmt.setInt(8,Integer.parseInt(txtCodRes.getText()));
                 patmt.execute();
               patmt.close();
                JOptionPane.showMessageDialog(null, "Foi");
            }
            catch (Exception erro){
                JOptionPane.showMessageDialog(null, "Conexão falhou");
                 }
            
          /*  try{
               PreparedStatement pstmt = con.getConn().prepareStatement("INSERT INTO tbFuncionario(tipoFuncionarioID, agenteID, funcionarioNome, funcionarioRG, restauranteID, funcionarioSituacao) VALUES (2, (select agenteId from tbAgente where agenteLogin ='LoginTeste897' and agentesenha = '123'), 'lucas', '12346577', 1, 1");
                pstmt.setInt(1,Integer.parseInt(txtTipoFunc.getText()));
                pstmt.setString(2,txtIdFunc.getText().trim());
                pstmt.setString(3,txtSenhaFunc.getText().trim());
                
                pstmt.setString(2,txtNomeFunc.getText().trim());
                
                pstmt.setString(3,(txtRgFunc.getText().trim()));
                pstmt.setInt(4,Integer.parseInt(txtCodRes.getText()));
               pstmt.execute();
               pstmt.close();
               
                JOptionPane.showMessageDialog(null, "Foi");
               
                patmt.setInt(3,Integer.parseInt(txtTipoFunc.getText()));
                patmt.setString(4,txtIdFunc.getText().trim());
                patmt.setString(5,txtSenhaFunc.getText().trim());
                patmt.setString(6,txtNomeFunc.getText().trim());
                patmt.setInt(7,Integer.parseInt(txtRgFunc.getText()));
                patmt.setInt(8,Integer.parseInt(txtCodRes.getText()));
              
                JOptionPane.showMessageDialog(null, "Foi");
               PreparedStatement insert2 = con.getConn().prepareStatement("INSERT INTO tbFuncionario(tipoFuncionarioID, agenteID, funcionarioNome, funcionarioRG, restauranteID, funcionarioSituacao) VALUES (?, (select agenteId from tbAgente where agenteLogin ='"+txtIdFunc.getText()+ "'and agentesenha = '"+txtSenhaFunc.getText() +"'), ?, ?, ?, 1");
                insert2.setString(1,txtTipoFunc.getText().trim());
                insert2.setString(2,txtNomeFunc.getText().trim());
                insert2.setString(3,txtRgFunc.getText().trim());
                insert2.setString(4,txtTipoFunc.getText());
              ResultSet rs2 = insert2.executeQuery();
              
               
                int contar = 0;
                while (rs.next() ){
                    contar++;
                }
                if(contar > 0){
                        
                        JOptionPane.showMessageDialog(null, "Foi");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Não foi");
                }
                   
                 }
               
            
            catch (Exception erro){
                JOptionPane.showMessageDialog(null, "Conexão 2 falhou");
                 }
           */
        }
        else{
            JOptionPane.showMessageDialog(null, "Consulta a tablea falhou");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodResActionPerformed

    private void txtSenhaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFuncActionPerformed

    private void txtTipoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoFuncActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCodRes;
    private javax.swing.JTextField txtIdFunc;
    private javax.swing.JTextField txtNomeFunc;
    private javax.swing.JTextField txtRgFunc;
    private javax.swing.JTextField txtSenhaFunc;
    private javax.swing.JTextField txtTipoFunc;
    // End of variables declaration//GEN-END:variables
}
