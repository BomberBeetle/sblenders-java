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
public class pnPedidoEstatistica extends javax.swing.JPanel {

    /**
     * Creates new form pnPedidoEstatistica
     */
    public pnPedidoEstatistica() {
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

        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jButton8.setBackground(new java.awt.Color(247, 176, 54));
        jButton8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton8.setText("procurar");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(247, 176, 54));
        jButton7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton7.setText("Ingrediente mais usado por produto");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(247, 176, 54));
        jButton9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton9.setText("Produtos mais pedidos");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       try {
            ClasseConexaoJava con = new  ClasseConexaoJava();
            boolean resultado = con.conectar();
            if (resultado == true){
                JasperDesign jdesign = JRXmlLoader.load(getClass().getResource("ingredientesProdutos.jrxml").getPath());
                String query = "SELECT\n" +
"	DISTINCT(tbProd.produtoID),\n" +
"	produtoNome,\n" +
"	COUNT(tbPedProd.produtoID) AS \"Número de pedidos em que aparece\",\n" +
"	ingredienteNome,\n" +
"	COUNt(tbProdIng.ingredienteID) AS \"Número de pedidos em que aparece\"\n" +
"FROM tbProduto AS tbProd\n" +
"JOIN tbProdutoIngrediente AS tbProdIng\n" +
"ON tbProd.produtoID = tbProdIng.produtoID\n" +
"JOIN tbPedidoProduto AS tbPedProd\n" +
"ON tbProd.produtoID = tbPedProd.produtoID\n" +
"JOIN tbIngrediente AS tbIng\n" +
"ON tbProdIng.ingredienteID = tbIng.ingredienteID\n" +
"JOIN tbPedidoProdutoIngrediente AS tbPedProdIng\n" +
"ON tbProdIng.produtoIngredienteID = tbPedProdIng.produtoIngredienteID\n" +
"GROUP BY\n" +
"	tbProd.produtoID,\n" +
"	produtoNome,\n" +
"	ingredienteNome ";
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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            ClasseConexaoJava con = new  ClasseConexaoJava();
            boolean resultado = con.conectar();
            if (resultado == true){
                JasperDesign jdesign = JRXmlLoader.load(getClass().getResource("MaisProdutos.jrxml").getPath());
                String query = "SELECT\n" +
                "	restauranteNome,\n" +
                "	produtoNome,\n" +
                "	tbProd.produtoID,\n" +
                "	COUNT(tbPedProd.produtoID) AS \"Número de pedidos em que aparece\"\n" +
                "FROM tbProduto AS tbProd\n" +
                "JOIN tbPedidoProduto AS tbPedProd\n" +
                "ON tbProd.produtoID = tbPedProd.produtoID\n" +
                "JOIN tbPedido AS tbPed\n" +
                "ON tbPedProd.pedidoID = tbPed.pedidoID\n" +
                "JOIN tbRestaurante AS tbRest\n" +
                "ON tbPed.restauranteID = tbRest.restauranteID\n" +
                "WHERE tbProd.produtoID IN (SELECT produtoID FROM tbPedidoProduto)\n" +
                "GROUP BY\n" +
                "	restauranteNome,\n" +
                "	produtoNome,\n" +
                "	tbProd.produtoID\n" +
                "ORDER BY produtoID ASC ";
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
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
