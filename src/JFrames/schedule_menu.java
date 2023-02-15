/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import classes.Data;
import classes.extract_xml;
import classes.generate_html;
import classes.generate_pdf;
import classes.xlsx_to_xml;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.apache.commons.io.FileUtils;
import org.xml.sax.SAXException;

/**
 *
 * @author lenovo
 */
public class schedule_menu extends javax.swing.JFrame {

    public static String xml_emplois_path="./res/xml/emplois.xml";
    public static String xsd_emplois_path="./res/xml/emplois.xsd";
    public static String xml_emploi_path="./res/xml/emploi.xml";
    public static String xsl_emploi_path="./res/xsl/xsl-fo/emploi.xsl";
    public static String pdf_emploi_path="./res/pdf/emploi.pdf";
    public static String xslt_emploi_path="./res/xsl/xslt/emploi.xslt";
    public static String html_emploi_path="./res/html/emploi.html";
    
    
    
    private final JFileChooser filechooser=new JFileChooser();
    
    public schedule_menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            load(Data.getallweeks());
        }catch(Exception e){
            System.out.println("erreur de chargement de donnees");
        }
        
        
        
        
        
    }
    
    public void load(List<List> L) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        while(model.getRowCount()!=0){
            model.removeRow(0);
        }
        
        for(int i=0 ; i < L.size() ;i++){
            Object[] o = new Object[]{L.get(i).get(0),L.get(i).get(1)};
            model.insertRow(model.getRowCount(), o);  
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        charge = new javax.swing.JButton();
        pdf = new javax.swing.JButton();
        html = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        emplois_xml = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/Image1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>  <center> <div>XML PROJECT</div> <div>SCHEDULE MENU</div> </center> </html>");

        home.setBackground(new java.awt.Color(105, 63, 1));
        home.setForeground(new java.awt.Color(248, 148, 6));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/Image2.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        charge.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        charge.setText("Charge Data(xml)");
        charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeActionPerformed(evt);
            }
        });

        pdf.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        pdf.setText("PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        html.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        html.setText("HTML");
        html.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("1- Charger le fichier de données xml en premier  (si non fichier par defaut).\n2- sélectionner la semaine dans la liste à gauche.\n2- Choisir le type de fichier résultat voulu.\n-A droite vous pouvez télécharger le fichier de données xml courants utilisé.\n! attention d'ecraser vos fichier.\n-Pour le fichier de données chargé vous devez en premier le télécharger puis le\nmodifier et en fin le charger (pour avoir la meme structure).\n");
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        emplois_xml.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        emplois_xml.setText("emplois.xml");
        emplois_xml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplois_xmlActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WEEK", "YEAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(html, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(charge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(emplois_xml, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(charge, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(html, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emplois_xml)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeActionPerformed
        filechooser.setApproveButtonText("choose");
        filechooser.removeChoosableFileFilter(filechooser.getFileFilter());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setFileFilter(new FileNameExtensionFilter("xml file", "xml"));
        int returnval =filechooser.showOpenDialog(this);
        if(returnval==JFileChooser.APPROVE_OPTION){
            try {
                if(xlsx_to_xml.validateXMLSchema(xsd_emplois_path, filechooser.getSelectedFile().getPath())){
                    FileUtils.copyFile(filechooser.getSelectedFile(), new File(xml_emplois_path));
                    JOptionPane.showMessageDialog(this, "xml bien validé et chargé");
                    try{
                        load(Data.getallweeks());
                    }catch(Exception e){
                        System.out.println("erreur de chargement de donnees");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "xml non valide");
                }
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "input error");
            }
        }
    }//GEN-LAST:event_chargeActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "no row selected");
        }else{
            String num=jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString();
            String annee=jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString();
            extract_xml.extract_week(xml_emplois_path, xml_emploi_path, annee, num);
            generate_pdf.transform(xml_emploi_path, xsl_emploi_path, pdf_emploi_path);
            
            try {
                Desktop.getDesktop().open(new File(pdf_emploi_path));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "input error");
            }
        }
    }//GEN-LAST:event_pdfActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        principale_menu pm = new principale_menu();
        pm.setVisible(true);
        pm.setLocationRelativeTo(null);
        pm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void emplois_xmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplois_xmlActionPerformed
        filechooser.setApproveButtonText("save");
        filechooser.removeChoosableFileFilter(filechooser.getFileFilter());
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        int returnval =filechooser.showOpenDialog(this);
        if(returnval==JFileChooser.APPROVE_OPTION){
            try {
                FileUtils.copyFile(new File(xml_emplois_path), new File(filechooser.getSelectedFile() + "\\emplois.xml"));
                FileUtils.copyFile(new File(xsd_emplois_path), new File(filechooser.getSelectedFile()+ "\\emplois.xsd"));
                JOptionPane.showMessageDialog(this, "Done");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "input error");
            }
        }
    }//GEN-LAST:event_emplois_xmlActionPerformed

    private void htmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlActionPerformed
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "no row selected");
        }else{
            String num=jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString();
            String annee=jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString();
            extract_xml.extract_week(xml_emplois_path, xml_emploi_path, annee, num);
            generate_html.transform(xml_emploi_path, xslt_emploi_path, html_emploi_path);
            
            try {
                Desktop.getDesktop().open(new File(html_emploi_path));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "input error");
            }
        }
    }//GEN-LAST:event_htmlActionPerformed

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
            java.util.logging.Logger.getLogger(schedule_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(schedule_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(schedule_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(schedule_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new schedule_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton charge;
    private javax.swing.JButton emplois_xml;
    private javax.swing.JButton home;
    private javax.swing.JButton html;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton pdf;
    // End of variables declaration//GEN-END:variables
}