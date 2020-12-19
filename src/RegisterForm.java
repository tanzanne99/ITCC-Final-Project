
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        panel_border = new javax.swing.JPanel();
        label_registerheader = new javax.swing.JLabel();
        panel_bg = new javax.swing.JPanel();
        passfield_pass = new javax.swing.JPasswordField();
        button_cancel = new javax.swing.JButton();
        label_pass = new javax.swing.JLabel();
        label_acc = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        button_register = new javax.swing.JButton();
        textfield_uname = new javax.swing.JTextField();
        label_uname = new javax.swing.JLabel();
        label_repass = new javax.swing.JLabel();
        passfield_repass = new javax.swing.JPasswordField();
        label_close = new javax.swing.JLabel();
        label_minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_border.setBackground(new java.awt.Color(161, 145, 88));

        label_registerheader.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        label_registerheader.setForeground(new java.awt.Color(240, 240, 240));
        label_registerheader.setText("REGISTER");

        panel_bg.setBackground(new java.awt.Color(40, 57, 113));

        passfield_pass.setBackground(new java.awt.Color(108, 121, 142));
        passfield_pass.setForeground(new java.awt.Color(250, 250, 250));

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

        label_pass.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_pass.setForeground(new java.awt.Color(250, 250, 250));
        label_pass.setText("Password");

        label_acc.setForeground(new java.awt.Color(250, 250, 250));
        label_acc.setText("Already have an account?");

        label_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_login.setForeground(new java.awt.Color(250, 250, 250));
        label_login.setText("Click here to login.");
        label_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_loginMouseClicked(evt);
            }
        });

        button_register.setBackground(new java.awt.Color(161, 145, 88));
        button_register.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_register.setForeground(new java.awt.Color(250, 250, 250));
        button_register.setText("Register");
        button_register.setToolTipText("");
        button_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_registerMouseClicked(evt);
            }
        });
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });

        textfield_uname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_uname.setForeground(new java.awt.Color(250, 250, 250));
        textfield_uname.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_unameActionPerformed(evt);
            }
        });

        label_uname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_uname.setForeground(new java.awt.Color(250, 250, 250));
        label_uname.setText("Username");

        label_repass.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_repass.setForeground(new java.awt.Color(250, 250, 250));
        label_repass.setText("Retype Password");

        passfield_repass.setBackground(new java.awt.Color(108, 121, 142));
        passfield_repass.setForeground(new java.awt.Color(250, 250, 250));
        passfield_repass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfield_repassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addComponent(button_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_register))
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_repass))
                                .addGap(10, 10, 10)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passfield_repass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passfield_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(label_acc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_login)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfield_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_repass, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfield_repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancel)
                    .addComponent(button_register))
                .addGap(29, 29, 29)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_acc)
                    .addComponent(label_login))
                .addContainerGap(44, Short.MAX_VALUE))
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
                .addComponent(label_registerheader)
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
                    .addComponent(label_registerheader)
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

    private void label_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_closeMouseClicked

        this.dispose();
        
    }//GEN-LAST:event_label_closeMouseClicked

    private void label_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimizeMouseClicked

        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_label_minimizeMouseClicked

    private void textfield_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_unameActionPerformed

    }//GEN-LAST:event_textfield_unameActionPerformed

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed

        String uname = textfield_uname.getText();
        String pass = String.valueOf(passfield_pass.getPassword());
        
        if(verifyFields()) {
            if(!verifyUsername()){
                Connection con = MyConnection.getConnection();
                PreparedStatement ps;
            
                try {
                    ps = con.prepareStatement("INSERT INTO application(username,  password) VALUES(?,?)");
                    ps.setString(1, uname);
                    ps.setString(2, pass);
                    if(ps.executeUpdate() !=0){
                        JOptionPane.showMessageDialog(null, "Account registered");
                        LoginForm lf = new LoginForm();
                        lf.setVisible(true);
                        lf.pack();
                        lf.setLocationRelativeTo(null);
                        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Oops. Fill out empty fields or change your username.");
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_button_registerActionPerformed

    private void button_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_registerMouseClicked

    }//GEN-LAST:event_button_registerMouseClicked

    private void label_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_loginMouseClicked

        LoginForm logf = new LoginForm();
        logf.setVisible(true);
        logf.pack();
        logf.setLocationRelativeTo(null);
        logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_label_loginMouseClicked

    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed

        LoginForm logf = new LoginForm();
        logf.setVisible(true);
        logf.pack();
        logf.setLocationRelativeTo(null);
        logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_cancelMouseClicked

        System.exit(0);
    }//GEN-LAST:event_button_cancelMouseClicked

    private void passfield_repassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfield_repassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfield_repassActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_register;
    private javax.swing.JLabel label_acc;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_minimize;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_registerheader;
    private javax.swing.JLabel label_repass;
    private javax.swing.JLabel label_uname;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPanel panel_border;
    private javax.swing.JPasswordField passfield_pass;
    private javax.swing.JPasswordField passfield_repass;
    private javax.swing.JTextField textfield_uname;
    // End of variables declaration//GEN-END:variables

    public boolean verifyFields(){
        textfield_uname.setBackground(new java.awt.Color(108,121,142));
        passfield_pass.setBackground(new java.awt.Color(108,121,142));
        passfield_repass.setBackground(new java.awt.Color(108,121,142));
    
        String pass1 = String.valueOf(passfield_pass.getPassword());
        String pass2 = String.valueOf(passfield_repass.getPassword());
    
        if(textfield_uname.getText().equals("")){
            textfield_uname.setBackground(new java.awt.Color(255,204,204));
            textfield_uname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(String.valueOf(passfield_pass.getPassword()).equals("")){
            passfield_pass.setBackground(new java.awt.Color(255,204,204));
            passfield_pass.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(String.valueOf(passfield_repass.getPassword()).equals("")){
            passfield_repass.setBackground(new java.awt.Color(255,204,204));
            passfield_repass.setForeground(new java.awt.Color(0, 0, 0));
        }
        else if(!pass1.equals(pass2)){
            passfield_pass.setBackground(new java.awt.Color(255,204,204));
            passfield_pass.setForeground(new java.awt.Color(0, 0, 0));
            passfield_repass.setBackground(new java.awt.Color(255,204,204));
            passfield_repass.setForeground(new java.awt.Color(0, 0, 0));
            return false;
        }
        
        else{
            return true;
        }
        return false;
    }
    
    public boolean verifyUsername(){
        boolean username_exist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
            
        try {
            ps = con.prepareStatement("SELECT * FROM application WHERE username = ?");
            ps.setString(1, textfield_uname.getText());
          
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Oops. This username is already taken.");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return username_exist;
    }
    
}
