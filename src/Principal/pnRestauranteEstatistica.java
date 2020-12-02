/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

import classeConexao.ClasseConexaoJava;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lucas
 */
public class pnRestauranteEstatistica extends javax.swing.JPanel {

    /** Creates new form pnRestauranteEstatistica */
    public pnRestauranteEstatistica() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(247, 176, 54));
        jButton6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton6.setText("Pedidos Por Restaurante");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(247, 176, 54));
        jButton7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton7.setText("Funcionarios Por Restaurante");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 try {
            ClasseConexaoJava con = new  ClasseConexaoJava();
            boolean resultado = con.conectar();
        if (resultado == true){
            JasperDesign jdesign = JRXmlLoader.load(getClass().getResource("testeDeGrafico.jrxml").getPath());
            String query = "SELECT\n" +
"	tbRest.restauranteID as \"ID do Restaurante\",\n" +
"        tbRest.restauranteNome as \"Nome do Restaurante\",\n" +
"	COUNT(pedidoID) as \"Número de Pedidos\"\n" +
"FROM tbPedido AS tbPed JOIN tbRestaurante AS tbRest\n" +
"	ON tbPed.restauranteID = tbRest.restauranteID\n" +
"GROUP BY tbRest.restauranteID, tbRest.restauranteNome\n" +
"ORDER BY tbRest.restauranteID ASC";
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);
            jdesign.setQuery(updateQuery);
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, con.getConn());
            JasperViewer.viewReport(jprint, false);
            /*
            JasperReport jasperReport = JasperCompileManager.compileReport(jdesign);
            JRSaver.saveObject(jasperReport, "MyCompiledReport.jasper");
            */
        }
        } catch (JRException ex) {
            Logger.getLogger(pnMenufunc.class.getName()).log(Level.SEVERE, null, ex);
        } 
  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      try {
            ClasseConexaoJava con = new  ClasseConexaoJava();
            boolean resultado = con.conectar();
        if (resultado == true){
            JasperDesign jdesign = JRXmlLoader.load(getClass().getResource("funcPRes.jrxml").getPath());
            String query = "SELECT\n" +
"	tbRest.restauranteID as \"ID do Restaurante\",\n" +
"        tbRest.restauranteNome as \"Nome do Restaurante\",\n" +
"	COUNT(funcionarioId) as \"Número de Funcionarios\"\n" +
"FROM tbFuncionario AS tbFunc JOIN tbRestaurante AS tbRest\n" +
"	ON tbFunc.restauranteID = tbRest.restauranteID\n" +
"GROUP BY tbRest.restauranteID, tbRest.restauranteNome\n" +
"ORDER BY tbRest.restauranteID ASC";
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);
            jdesign.setQuery(updateQuery);
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, con.getConn());
            JasperViewer.viewReport(jprint, false);
            /*
            JasperReport jasperReport = JasperCompileManager.compileReport(jdesign);
            JRSaver.saveObject(jasperReport, "MyCompiledReport.jasper");
            */
        }
        } catch (JRException ex) {
            Logger.getLogger(pnMenufunc.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables

}
