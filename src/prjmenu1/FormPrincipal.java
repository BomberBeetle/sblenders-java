/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjmenu1;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
    }
int AuxEdit = 1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnSair = new javax.swing.JButton();
        caixaUm = new javax.swing.JComboBox<>();
        caixaUm1 = new javax.swing.JComboBox<>();
        caixaUm2 = new javax.swing.JComboBox<>();
        caixaUm3 = new javax.swing.JComboBox<>();
        painelBotoes = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(700, 700));

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setActionCommand("btnsair");
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        caixaUm.setBackground(new java.awt.Color(255, 102, 51));
        caixaUm.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        caixaUm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGENTE", "FUNCIONARIO", "TOTEM", "CLIENTE ONLINE" }));
        caixaUm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caixaUm.setKeySelectionManager(null);
        caixaUm.setLightWeightPopupEnabled(false);
        caixaUm.setOpaque(false);
        caixaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaUmActionPerformed(evt);
            }
        });

        caixaUm1.setBackground(new java.awt.Color(255, 102, 51));
        caixaUm1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        caixaUm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEDIDO", "FILTRAR PEDIDOS", "ESTATÍSTICAS", " " }));
        caixaUm1.setBorder(null);
        caixaUm1.setOpaque(false);
        caixaUm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaUm1ActionPerformed(evt);
            }
        });

        caixaUm2.setBackground(new java.awt.Color(255, 102, 51));
        caixaUm2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        caixaUm2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODUTO", "INGREDIENTES", " ", " " }));
        caixaUm2.setBorder(null);
        caixaUm2.setOpaque(false);
        caixaUm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaUm2ActionPerformed(evt);
            }
        });

        caixaUm3.setBackground(new java.awt.Color(255, 102, 51));
        caixaUm3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        caixaUm3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESTAURANTE", "ESTATÍSTICAS", " ", " " }));
        caixaUm3.setBorder(null);
        caixaUm3.setOpaque(false);
        caixaUm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaUm3ActionPerformed(evt);
            }
        });

        painelBotoes.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caixaUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(caixaUm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(caixaUm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(caixaUm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaUm1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaUm2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaUm3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
     System.exit(0);       
    }//GEN-LAST:event_btnSairActionPerformed

    private void caixaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaUmActionPerformed
       if(caixaUm.getSelectedItem().equals("AGENTE")){
           pnMenuPrinAgente painelA = new pnMenuPrinAgente();
         painelBotoes.removeAll();
                painelBotoes.add(painelA);
                painelBotoes.revalidate();
                painelBotoes.setVisible(true);
                
       }
       
       
       if(caixaUm.getSelectedItem().equals("FUNCIONARIO")){
           pnMenufunc painel = new pnMenufunc();
         painelBotoes.removeAll();
                painelBotoes.add(painel);
                painelBotoes.revalidate();
                painelBotoes.setVisible(true);
       }
       
       
       if(caixaUm.getSelectedItem().equals("TOTEM")){
           pnMenuTotem painel = new pnMenuTotem();
         painelBotoes.removeAll();
                painelBotoes.add(painel);
                painelBotoes.revalidate();
                painelBotoes.setVisible(true);
       }
      
       
       if(caixaUm.getSelectedItem().equals("CLIENTE ONLINE")){
           pnMenuClienteOnline painel = new pnMenuClienteOnline();
         painelBotoes.removeAll();
                painelBotoes.add(painel);
                painelBotoes.revalidate();
                painelBotoes.setVisible(true);
       }
       
       
    }//GEN-LAST:event_caixaUmActionPerformed

    private void caixaUm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaUm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaUm1ActionPerformed

    private void caixaUm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaUm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaUm2ActionPerformed

    private void caixaUm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaUm3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaUm3ActionPerformed
  
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> caixaUm;
    private javax.swing.JComboBox<String> caixaUm1;
    private javax.swing.JComboBox<String> caixaUm2;
    private javax.swing.JComboBox<String> caixaUm3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel painelBotoes;
    // End of variables declaration//GEN-END:variables
}
