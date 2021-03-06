
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zoop
 */
public class EssayForm extends javax.swing.JFrame {

    /**
     * Creates new form Essay
     */
    
    String doc_path = null;
    
    public EssayForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_uname = new javax.swing.JLabel();
        panel_border = new javax.swing.JPanel();
        label_essayheader = new javax.swing.JLabel();
        panel_bg = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        label_inst1 = new javax.swing.JLabel();
        label_uname1 = new javax.swing.JLabel();
        label_msg3 = new javax.swing.JLabel();
        button_attfile = new javax.swing.JButton();
        label_fpath = new javax.swing.JLabel();
        label_inst2 = new javax.swing.JLabel();
        label_inst3 = new javax.swing.JLabel();
        label_close = new javax.swing.JLabel();
        label_minimize = new javax.swing.JLabel();

        label_uname.setBackground(new java.awt.Color(40, 57, 113));
        label_uname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        label_uname.setForeground(new java.awt.Color(40, 57, 113));
        label_uname.setText("<username>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_border.setBackground(new java.awt.Color(161, 145, 88));

        label_essayheader.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        label_essayheader.setForeground(new java.awt.Color(240, 240, 240));
        label_essayheader.setText("ESSAY");

        panel_bg.setBackground(new java.awt.Color(40, 57, 113));

        button_cancel.setBackground(new java.awt.Color(175, 175, 175));
        button_cancel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        button_cancel.setText("Cancel");
        button_cancel.setToolTipText("");
        button_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_cancelMouseClicked(evt);
            }
        });
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        button_save.setBackground(new java.awt.Color(161, 145, 88));
        button_save.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_save.setForeground(new java.awt.Color(250, 250, 250));
        button_save.setText("Save");
        button_save.setToolTipText("");
        button_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_saveMouseClicked(evt);
            }
        });
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });

        label_inst1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_inst1.setForeground(new java.awt.Color(250, 250, 250));
        label_inst1.setText("Describe yourself briefly. What are your goals and dreams in");

        label_uname1.setBackground(new java.awt.Color(40, 57, 113));
        label_uname1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        label_uname1.setForeground(new java.awt.Color(40, 57, 113));
        label_uname1.setText("<username>");

        label_msg3.setBackground(new java.awt.Color(250, 250, 250));
        label_msg3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_msg3.setForeground(new java.awt.Color(200, 200, 200));
        label_msg3.setText("Note: Submit your essay in a document file.");

        button_attfile.setText("Attach File");
        button_attfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_attfileActionPerformed(evt);
            }
        });

        label_fpath.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        label_fpath.setForeground(new java.awt.Color(250, 250, 250));
        label_fpath.setText("file path");

        label_inst2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_inst2.setForeground(new java.awt.Color(250, 250, 250));
        label_inst2.setText("life? Why do you want to study in this particular University and");

        label_inst3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_inst3.setForeground(new java.awt.Color(250, 250, 250));
        label_inst3.setText("how can this scholarship (if awarded) shape your future?");

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_inst1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_msg3)
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addComponent(button_attfile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_fpath, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_inst2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_inst3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_uname1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(label_inst1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_inst2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_inst3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_msg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_attfile)
                    .addComponent(label_fpath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancel)
                    .addComponent(button_save))
                .addGap(30, 30, 30)
                .addComponent(label_uname1)
                .addContainerGap())
        );

        label_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_close.setForeground(new java.awt.Color(250, 250, 250));
        label_close.setText("x");
        label_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_closeMouseClicked(evt);
            }
        });

        label_minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_minimize.setForeground(new java.awt.Color(250, 250, 250));
        label_minimize.setText("-");
        label_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_borderLayout = new javax.swing.GroupLayout(panel_border);
        panel_border.setLayout(panel_borderLayout);
        panel_borderLayout.setHorizontalGroup(
            panel_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_borderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_essayheader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_close)
                .addContainerGap())
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_borderLayout.setVerticalGroup(
            panel_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_borderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_essayheader)
                    .addComponent(label_close)
                    .addComponent(label_minimize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_cancelMouseClicked

    }//GEN-LAST:event_button_cancelMouseClicked

    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_saveMouseClicked

    }//GEN-LAST:event_button_saveMouseClicked

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
    
        String uname = label_uname1.getText();
        
        PreparedStatement ps;
        ResultSet rs;
        String registerUserQuery = "UPDATE `application` SET `essay`= ? WHERE `username`= ?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(registerUserQuery);
            ps.setString(2, uname);
            
            try{
                if(doc_path != null){
                    InputStream doc = new FileInputStream(new File(doc_path));
                    ps.setBlob(1, doc);
                }
                
                ps.setNull(1, java.sql.Types.NULL);

                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Essay saved");
                }
            } catch (FileNotFoundException ex){
                Logger.getLogger(EssayForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch (SQLException ex){
            Logger.getLogger(EssayForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
        
    }//GEN-LAST:event_button_saveActionPerformed

    private void label_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_closeMouseClicked

        this.dispose();
        
    }//GEN-LAST:event_label_closeMouseClicked

    private void label_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimizeMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_label_minimizeMouseClicked

    private void button_attfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_attfileActionPerformed

        String path = null;
        
        JFileChooser chooser = new JFileChooser();
        
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter extension = new FileNameExtensionFilter(".docx", ".doc", ".pdf");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
        
        if(filestate == JFileChooser.APPROVE_OPTION){
            
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            label_fpath.setText(path);
            
        }
        
    }//GEN-LAST:event_button_attfileActionPerformed

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
            java.util.logging.Logger.getLogger(EssayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EssayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EssayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EssayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EssayForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_attfile;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_save;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_essayheader;
    private javax.swing.JLabel label_fpath;
    private javax.swing.JLabel label_inst1;
    private javax.swing.JLabel label_inst2;
    private javax.swing.JLabel label_inst3;
    private javax.swing.JLabel label_minimize;
    public static javax.swing.JLabel label_msg3;
    public static javax.swing.JLabel label_uname;
    public static javax.swing.JLabel label_uname1;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPanel panel_border;
    // End of variables declaration//GEN-END:variables

}