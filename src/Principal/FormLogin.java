package Principal;

import javax.swing.JOptionPane;
import classeConexao.ClasseConexaoJava;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
public class FormLogin extends javax.swing.JDialog 
{
    
 classeGetSet abc = new classeGetSet();
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

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 100, 30));

        btnEntrar.setBackground(new java.awt.Color(247, 176, 54));
        btnEntrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 60, 20));

        txtUsuario.setEditable(true);
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
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 330, -1));

        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sblendersOrangeBlack.jpeg"))); // NOI18N
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 80, 120));
        getContentPane().add(txtSenhaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 330, -1));

        setBounds(0, 0, 431, 410);
    }// </editor-fold>//GEN-END:initComponents
        ClasseConexaoJava con;
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
           con = new ClasseConexaoJava();
           boolean resultado = con.conectar();
        if (resultado == true){
            try{
                    PreparedStatement patmt = con.getConn().prepareStatement("select * from tbFuncionario where tipoFuncionarioID = 1 and agenteID = (select agenteID  from tbAgente where agenteLogin = ? and agenteSenha= ?) ");
                patmt.setString(1,txtUsuario.getText().trim());
                patmt.setString(2,txtSenhaPass.getText().trim());
                ResultSet rs = patmt.executeQuery();
                int contar = 0;
                while (rs.next()){
                    contar++;
                }
                if(contar > 0){
                    abc.setNome(txtUsuario.getText());
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
      txtUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        
        
    }//GEN-LAST:event_formWindowOpened

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
         txtUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.orange));
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        txtUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_txtUsuarioFocusLost

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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JPasswordField txtSenhaPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
