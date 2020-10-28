package Principal;

import javax.swing.JOptionPane;
import classeConexao.ClasseConexaoJava;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
public class FormLogin extends javax.swing.JFrame
{
    
 
    public FormLogin() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtSenhaPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(247, 176, 54));
        btnEntrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Senha");

        txtUsuario.setEditable(true);
        txtUsuario.setBackground(new java.awt.Color(240, 240, 240));
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtUsuario.setSelectionColor(new java.awt.Color(255, 102, 51));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogin.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtSenhaPass.setBackground(new java.awt.Color(240, 240, 240));
        txtSenhaPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSenhaPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaPassFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenhaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtSenhaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(806, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    classeGetSet abc = new classeGetSet();
    ClasseConexaoJava con;    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
      txtUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        txtSenhaPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        
            ImageIcon imagem = new ImageIcon(getClass().getResource("sblenderGrande.jpeg"));
       lblLogin.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(lblLogin.getWidth(), lblLogin.getHeight(), Image.SCALE_DEFAULT)));
       
    }//GEN-LAST:event_formWindowOpened

    private void txtSenhaPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaPassFocusLost
        txtSenhaPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_txtSenhaPassFocusLost

    private void txtSenhaPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaPassFocusGained
        txtSenhaPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.orange));
    }//GEN-LAST:event_txtSenhaPassFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        txtUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.orange));
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        con = new ClasseConexaoJava();
        boolean resultado = con.conectar();
        if (resultado == true){
            try{
                PreparedStatement patmt = con.getConn().prepareStatement("select * from tbFuncionario where tipoFuncionarioID = 1 and agenteID = (select agenteID  from tbAgente where agenteLogin = ? and agenteSenha= ?) ");
                patmt.setString(1,txtUsuario.getText().trim());
                patmt.setString(2,txtSenhaPass.getText().trim());
                ResultSet rs = patmt.executeQuery();
                 classeGetSet.setNome(txtUsuario.getText());
                int contar = 0;
                while (rs.next()){
                    contar++;
                }
                if(contar > 0){
                    classeGetSet.setNome(txtUsuario.getText());
                    frmPrincipal f1 = new frmPrincipal();

                    // f1.setExtendedState(f1.MAXIMIZED_BOTH); //maximiza o form Principal
                    f1.setVisible(true); //antigamente era show();
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválido");
                }
                /*if(txtUsuario.getText().equals("1") && txtSenhaPass.getText().equals("1"))
                {
                    abc.setNome("jjjjj");
                    FormPrincipal f1 = new FormPrincipal();

                    // f1.setExtendedState(f1.MAXIMIZED_BOTH); //maximiza o form Principal
                    f1.setVisible(true); //antigamente era show();
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválido");
                }*/
            }
            catch (Exception erro){
                JOptionPane.showMessageDialog(null, "Conexão falhou");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Consulta a tablea falhou");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                //FormLogin f1 = new FormLogin();
                //f1.setModal(true);
                //f1.setLocationRelativeTo(null); //Centraliza o frmLogin
                //f1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JPasswordField txtSenhaPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
