/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import DAO.DAOTipoNutri;
import beans.tipoNutricao;
import beans.tipoProd;
import classeConexao.ClasseConexaoJava;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class FrmInfoNutri extends javax.swing.JFrame {

    /**
     * Creates new form FrmInfoNutri
     */
    public FrmInfoNutri() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        txtValor = new javax.swing.JTextField();
        cbbTipoNutri = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        cbbTipoNutri.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbbTipoNutriAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tipo de nutrição*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Valor nutrição*");

        Add.setText("adicionar");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Digite o id do produto");

        txtIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("O nome do produto é:");

        btnBuscar.setText("buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtValor)
                                    .addComponent(cbbTipoNutri, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbbTipoNutri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(5, 5, 5)))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void cbbTipoNutriAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbbTipoNutriAncestorAdded

        DAOTipoNutri dao = new DAOTipoNutri();
        try {
            List<tipoNutricao> lista = dao.ListarNutricao();
            cbbTipoNutri.removeAll();
            lista.forEach(f -> {
                cbbTipoNutri.addItem(f);
            });
        } catch (SQLException ex) {
            Logger.getLogger(frmCadIngrediente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cbbTipoNutriAncestorAdded
ClasseConexaoJava con;
   classeGetSet classe;
   int produtoId;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        
        
    }//GEN-LAST:event_formWindowOpened

    private void txtIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        con = new ClasseConexaoJava();
        boolean resultado = con.conectar();
        if (resultado == true){
            try{
  
                        PreparedStatement patmt = con.getConn().prepareStatement("select produtoId, produtoNome from tbProduto where produtoId =?") ;
                    patmt.setString(1,txtIdProd.getText().trim());
                    ResultSet r = patmt.executeQuery();
                
         
                  while(r.next()) {  //aqui ele pega o seu textfield e altera com o valor do banco
                      
                        produtoId = r.getInt(1);
                  //      txtTipoFunc.setText(r.getString(2));
                  
                        lblNome.setText(r.getString(2));
                        
                        
                        
                  }
                
              
               JOptionPane.showMessageDialog(null,"funcionário buscado");
               patmt.close();
               con.desconectar();
              
               
            }
               
        
            
            catch (HeadlessException | SQLException erro){
                JOptionPane.showMessageDialog(null, "Conexão ao banco falhou");
                 }
        
            }
        
        else{
            JOptionPane.showMessageDialog(null, "Conexão falhou");
        }
            
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       
         tipoNutricao tipo = (tipoNutricao) cbbTipoNutri.getSelectedItem();
        con = new ClasseConexaoJava();
        boolean resultado = con.conectar();
        if (resultado == true){
            try{
                PreparedStatement patmt = con.getConn().prepareStatement("INSERT INTO tbInformacaoNutricional (produtoID, informacaoNutriTipoID, informacaoNutricionalValor) values(?,?,?)");
          
                     patmt.setInt(1,produtoId);                  
                patmt.setInt(2,tipo.getIdNutri());
              patmt.setInt(3,Integer.parseInt(txtValor.getText()));

                patmt.execute();
               patmt.close();
               
               
               
              
               
                // con.desconectar();
                JOptionPane.showMessageDialog(null, "informação nutricional cadastrada");
            }
            catch (Exception erro){
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar informação nutricional, confira os dados");
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
            JOptionPane.showMessageDialog(null, "Consulta ao banco falhou");
        }
        
        
        
    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInfoNutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInfoNutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInfoNutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInfoNutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInfoNutri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Object> cbbTipoNutri;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
