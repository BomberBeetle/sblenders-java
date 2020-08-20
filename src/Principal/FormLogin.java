package Principal;

import javax.swing.JOptionPane;
import classeConexao.ClasseConexaoJava;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 30));

        btnEntrar.setBackground(new java.awt.Color(247, 176, 54));
        btnEntrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 20));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 140, -1));

        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sblendersOrangeBlack.jpeg"))); // NOI18N
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 60));
        getContentPane().add(txtSenhaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));

        setBounds(0, 0, 280, 191);
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
