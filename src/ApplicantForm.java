
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ApplicantForm extends javax.swing.JFrame {
   
    public ApplicantForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_border = new javax.swing.JPanel();
        label_applicantheader = new javax.swing.JLabel();
        panel_bg = new javax.swing.JPanel();
        label_idnum = new javax.swing.JLabel();
        button_cancel = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        textfield_tnum = new javax.swing.JTextField();
        label_dbirth = new javax.swing.JLabel();
        textfield_lname = new javax.swing.JTextField();
        label_lname = new javax.swing.JLabel();
        label_fname = new javax.swing.JLabel();
        textfield_fname = new javax.swing.JTextField();
        label_gender = new javax.swing.JLabel();
        radiobutton_m = new javax.swing.JRadioButton();
        radiobutton_f = new javax.swing.JRadioButton();
        label_tnum = new javax.swing.JLabel();
        dbirth = new com.toedter.calendar.JDateChooser();
        label_citizenship = new javax.swing.JLabel();
        textfield_cship = new javax.swing.JTextField();
        label_mnum = new javax.swing.JLabel();
        textfield_mnum = new javax.swing.JTextField();
        label_citizenship1 = new javax.swing.JLabel();
        textfield_rel = new javax.swing.JTextField();
        label_addco = new javax.swing.JLabel();
        textfield_addco = new javax.swing.JTextField();
        label_addpro = new javax.swing.JLabel();
        textfield_addpro = new javax.swing.JTextField();
        label_addcit = new javax.swing.JLabel();
        textfield_addcit = new javax.swing.JTextField();
        label_addspec = new javax.swing.JLabel();
        textfield_addspec = new javax.swing.JTextField();
        label_emailadd = new javax.swing.JLabel();
        textfield_emailaddap = new javax.swing.JTextField();
        textfield_idnum = new javax.swing.JTextField();
        label_uname = new javax.swing.JLabel();
        label_close = new javax.swing.JLabel();
        label_minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_border.setBackground(new java.awt.Color(161, 145, 88));

        label_applicantheader.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        label_applicantheader.setForeground(new java.awt.Color(240, 240, 240));
        label_applicantheader.setText("APPLICANT PROFILE");

        panel_bg.setBackground(new java.awt.Color(40, 57, 113));

        label_idnum.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_idnum.setForeground(new java.awt.Color(250, 250, 250));
        label_idnum.setText("ID No.");

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

        textfield_tnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_tnum.setForeground(new java.awt.Color(250, 250, 250));
        textfield_tnum.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_tnum.setName(""); // NOI18N
        textfield_tnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_tnumActionPerformed(evt);
            }
        });
        textfield_tnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_tnumKeyTyped(evt);
            }
        });

        label_dbirth.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_dbirth.setForeground(new java.awt.Color(250, 250, 250));
        label_dbirth.setText("Date of Birth");

        textfield_lname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_lname.setForeground(new java.awt.Color(250, 250, 250));
        textfield_lname.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_lnameActionPerformed(evt);
            }
        });
        textfield_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_lnameKeyTyped(evt);
            }
        });

        label_lname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_lname.setForeground(new java.awt.Color(250, 250, 250));
        label_lname.setText("Last Name");

        label_fname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_fname.setForeground(new java.awt.Color(250, 250, 250));
        label_fname.setText("First Name");

        textfield_fname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_fname.setForeground(new java.awt.Color(250, 250, 250));
        textfield_fname.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_fnameActionPerformed(evt);
            }
        });
        textfield_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_fnameKeyTyped(evt);
            }
        });

        label_gender.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_gender.setForeground(new java.awt.Color(250, 250, 250));
        label_gender.setText("Gender");

        radiobutton_m.setBackground(new java.awt.Color(40, 57, 113));
        radiobutton_m.setForeground(new java.awt.Color(250, 250, 250));
        radiobutton_m.setText("Male");

        radiobutton_f.setBackground(new java.awt.Color(40, 57, 113));
        radiobutton_f.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radiobutton_f.setForeground(new java.awt.Color(250, 250, 250));
        radiobutton_f.setText("Female");

        label_tnum.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_tnum.setForeground(new java.awt.Color(250, 250, 250));
        label_tnum.setText("Telephone No.");

        dbirth.setBackground(new java.awt.Color(108, 121, 142));

        label_citizenship.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_citizenship.setForeground(new java.awt.Color(250, 250, 250));
        label_citizenship.setText("Citizenship");

        textfield_cship.setBackground(new java.awt.Color(108, 121, 142));
        textfield_cship.setForeground(new java.awt.Color(250, 250, 250));
        textfield_cship.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_cship.setName(""); // NOI18N
        textfield_cship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_cshipActionPerformed(evt);
            }
        });
        textfield_cship.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_cshipKeyTyped(evt);
            }
        });

        label_mnum.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_mnum.setForeground(new java.awt.Color(250, 250, 250));
        label_mnum.setText("Mobile No.");

        textfield_mnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mnum.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mnum.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mnum.setName(""); // NOI18N
        textfield_mnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mnumActionPerformed(evt);
            }
        });
        textfield_mnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mnumKeyTyped(evt);
            }
        });

        label_citizenship1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_citizenship1.setForeground(new java.awt.Color(250, 250, 250));
        label_citizenship1.setText("Religion");

        textfield_rel.setBackground(new java.awt.Color(108, 121, 142));
        textfield_rel.setForeground(new java.awt.Color(250, 250, 250));
        textfield_rel.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_rel.setName(""); // NOI18N
        textfield_rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_relActionPerformed(evt);
            }
        });
        textfield_rel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_relKeyTyped(evt);
            }
        });

        label_addco.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_addco.setForeground(new java.awt.Color(250, 250, 250));
        label_addco.setText("Country");

        textfield_addco.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addco.setForeground(new java.awt.Color(250, 250, 250));
        textfield_addco.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_addco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_addcoActionPerformed(evt);
            }
        });
        textfield_addco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_addcoKeyTyped(evt);
            }
        });

        label_addpro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_addpro.setForeground(new java.awt.Color(250, 250, 250));
        label_addpro.setText("Province");

        textfield_addpro.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addpro.setForeground(new java.awt.Color(250, 250, 250));
        textfield_addpro.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_addpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_addproActionPerformed(evt);
            }
        });
        textfield_addpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_addproKeyTyped(evt);
            }
        });

        label_addcit.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_addcit.setForeground(new java.awt.Color(250, 250, 250));
        label_addcit.setText("City");

        textfield_addcit.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addcit.setForeground(new java.awt.Color(250, 250, 250));
        textfield_addcit.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_addcit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_addcitActionPerformed(evt);
            }
        });
        textfield_addcit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_addcitKeyTyped(evt);
            }
        });

        label_addspec.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_addspec.setForeground(new java.awt.Color(250, 250, 250));
        label_addspec.setText("Lot number / Block number / Street name / Village");

        textfield_addspec.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addspec.setForeground(new java.awt.Color(250, 250, 250));
        textfield_addspec.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_addspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_addspecActionPerformed(evt);
            }
        });

        label_emailadd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_emailadd.setForeground(new java.awt.Color(250, 250, 250));
        label_emailadd.setText("Email Address");

        textfield_emailaddap.setBackground(new java.awt.Color(108, 121, 142));
        textfield_emailaddap.setForeground(new java.awt.Color(250, 250, 250));
        textfield_emailaddap.setText(null);
        textfield_emailaddap.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_emailaddap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_emailaddapActionPerformed(evt);
            }
        });

        textfield_idnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_idnum.setForeground(new java.awt.Color(250, 250, 250));
        textfield_idnum.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_idnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_idnumActionPerformed(evt);
            }
        });
        textfield_idnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_idnumKeyTyped(evt);
            }
        });

        label_uname.setBackground(new java.awt.Color(40, 57, 113));
        label_uname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        label_uname.setForeground(new java.awt.Color(40, 57, 113));
        label_uname.setText("<username>");

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(button_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addComponent(textfield_idnum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textfield_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textfield_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_dbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textfield_cship, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_citizenship, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_citizenship1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_rel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_bgLayout.createSequentialGroup()
                                        .addComponent(radiobutton_m)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radiobutton_f))
                                    .addComponent(label_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_tnum)
                                    .addComponent(textfield_tnum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_mnum)
                                    .addComponent(textfield_mnum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_emailadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_emailaddap, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textfield_addspec)
                                .addGroup(panel_bgLayout.createSequentialGroup()
                                    .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(label_addspec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_bgLayout.createSequentialGroup()
                                                .addComponent(textfield_addco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(textfield_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel_bgLayout.createSequentialGroup()
                                            .addComponent(label_addco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80)
                                            .addComponent(label_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_addcit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textfield_addcit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addComponent(label_idnum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(label_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(label_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_uname)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_idnum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_idnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_tnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_mnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_emailadd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_mnum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_tnum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(textfield_emailaddap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addComponent(label_dbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(dbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_citizenship1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_cship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_rel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addComponent(label_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobutton_m, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiobutton_f))))
                .addGap(18, 18, 18)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_addco, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_addcit, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_addco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_addcit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_addspec)
                .addGap(4, 4, 4)
                .addComponent(textfield_addspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancel)
                    .addComponent(button_save))
                .addGap(14, 14, 14)
                .addComponent(label_uname)
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
                .addComponent(label_applicantheader)
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
                    .addComponent(label_applicantheader)
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

    public boolean verifText(){
        textfield_idnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_fname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_lname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_tnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_emailaddap.setBackground(new java.awt.Color(108, 121, 142));
        dbirth.setBackground(new java.awt.Color(108, 121, 142));
        textfield_cship.setBackground(new java.awt.Color(108, 121, 142));
        textfield_rel.setBackground(new java.awt.Color(108, 121, 142));
        radiobutton_m.setBackground(new java.awt.Color(108, 121, 142));
        radiobutton_f.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addco.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addpro.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addcit.setBackground(new java.awt.Color(108, 121, 142));
        textfield_addspec.setBackground(new java.awt.Color(108, 121, 142));

        if (textfield_idnum.getText().equals("")) {
            textfield_idnum.setBackground(new java.awt.Color(255, 204, 204));
            textfield_idnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_fname.getText().equals("")) {
            textfield_fname.setBackground(new java.awt.Color(255, 204, 204));
            textfield_fname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_lname.getText().equals("")) {
            textfield_lname.setBackground(new java.awt.Color(255, 204, 204));
            textfield_lname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_tnum.getText().equals("")) {
            textfield_tnum.setBackground(new java.awt.Color(255, 204, 204));
            textfield_tnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_mnum.getText().equals("")) {
            textfield_mnum.setBackground(new java.awt.Color(255, 204, 204));
            textfield_mnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_emailaddap.getText().equals("")) {
            textfield_emailaddap.setBackground(new java.awt.Color(255, 204, 204));
            textfield_emailaddap.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_cship.getText().equals("")) {
            textfield_cship.setBackground(new java.awt.Color(255, 204, 204));
            textfield_cship.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_rel.getText().equals("")) {
            textfield_rel.setBackground(new java.awt.Color(255, 204, 204));
            textfield_rel.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_addco.getText().equals("")) {
            textfield_addco.setBackground(new java.awt.Color(255, 204, 204));
            textfield_addco.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_addco.getText().equals("")) {
            textfield_addpro.setBackground(new java.awt.Color(255, 204, 204));
            textfield_addpro.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_addpro.getText().equals("")) {
            textfield_addcit.setBackground(new java.awt.Color(255, 204, 204));
            textfield_addcit.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_addspec.getText().equals("")) {
            textfield_addspec.setBackground(new java.awt.Color(255, 204, 204));
            textfield_addspec.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (dbirth.getDate().compareTo(new Date()) > 0){
            JOptionPane.showMessageDialog(null, "Date of Birth is invalid");
        }
        else{
            return true;
        }
        return false;
    }
    private void label_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_closeMouseClicked

        this.dispose();

    }//GEN-LAST:event_label_closeMouseClicked

    private void label_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimizeMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_label_minimizeMouseClicked

    private void textfield_idnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_idnumKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_idnumKeyTyped

    private void textfield_idnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_idnumActionPerformed

    }//GEN-LAST:event_textfield_idnumActionPerformed

    private void textfield_emailaddapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_emailaddapActionPerformed

    }//GEN-LAST:event_textfield_emailaddapActionPerformed

    private void textfield_addspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_addspecActionPerformed

    }//GEN-LAST:event_textfield_addspecActionPerformed

    private void textfield_addcitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_addcitKeyTyped

        if(Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }

    }//GEN-LAST:event_textfield_addcitKeyTyped

    private void textfield_addcitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_addcitActionPerformed

    }//GEN-LAST:event_textfield_addcitActionPerformed

    private void textfield_addproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_addproKeyTyped

        if(Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }

    }//GEN-LAST:event_textfield_addproKeyTyped

    private void textfield_addproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_addproActionPerformed

    }//GEN-LAST:event_textfield_addproActionPerformed

    private void textfield_addcoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_addcoKeyTyped

        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_addcoKeyTyped

    private void textfield_addcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_addcoActionPerformed

    }//GEN-LAST:event_textfield_addcoActionPerformed

    private void textfield_relKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_relKeyTyped

        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_relKeyTyped

    private void textfield_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_relActionPerformed

    }//GEN-LAST:event_textfield_relActionPerformed

    private void textfield_mnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mnumKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_mnumKeyTyped

    private void textfield_mnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mnumActionPerformed

    private void textfield_cshipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_cshipKeyTyped

        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_cshipKeyTyped

    private void textfield_cshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_cshipActionPerformed

    }//GEN-LAST:event_textfield_cshipActionPerformed

    private void textfield_fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_fnameKeyTyped

        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_fnameKeyTyped

    private void textfield_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_fnameActionPerformed

    }//GEN-LAST:event_textfield_fnameActionPerformed

    private void textfield_lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_lnameKeyTyped

        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_lnameKeyTyped

    private void textfield_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_lnameActionPerformed

    }//GEN-LAST:event_textfield_lnameActionPerformed

    private void textfield_tnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_tnumKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_tnumKeyTyped

    private void textfield_tnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_tnumActionPerformed

    }//GEN-LAST:event_textfield_tnumActionPerformed

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed

        String idnum = textfield_idnum.getText();
        String fname = textfield_fname.getText();
        String lname = textfield_lname.getText();
        String tnum = textfield_tnum.getText();
        String mnum = textfield_mnum.getText();
        String emailadd = textfield_emailaddap.getText();
        String addco = textfield_addco.getText();
        String addpro = textfield_addpro.getText();
        String addcit = textfield_addcit.getText();
        String addspec = textfield_addspec.getText();
        String cship = textfield_cship.getText();
        String rel = textfield_rel.getText();
        String uname = label_uname.getText();

        String gen = "Male";
        if(radiobutton_f.isSelected()){
            gen = "Female";
        }

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
            if(verifText()){
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String bdate = dateFormat.format(dbirth.getDate());              
                
                try {
                    ps = con.prepareStatement("UPDATE `application` SET `id`= ?,`name_first`= ?, `name_last`= ?, `num_tel`= ?, `num_mob`= ?, `emailadd`= ?, `birthdate`= ?, `citizenship`= ?, `religion`= ?, `gender`= ?, `address_country`= ?, `address_province`= ?, `address_city`= ?, `address_spec`= ? WHERE `username`= ?");
                    ps.setString(1, idnum);
                    ps.setString(2, fname);
                    ps.setString(3, lname);
                    ps.setString(4, tnum);
                    ps.setString(5, mnum);
                    ps.setString(6, emailadd);
                    ps.setString(7, bdate);
                    ps.setString(8, cship);
                    ps.setString(9, rel);
                    ps.setString(10, gen);
                    ps.setString(11, addco);
                    ps.setString(12, addpro);
                    ps.setString(13, addcit);
                    ps.setString(14, addspec);
                    ps.setString(15, uname);
                    
                    if(ps.executeUpdate() > 0){
                        JOptionPane.showMessageDialog(null, "Applicant Profile saved");
                    }

                }
                catch (SQLException ex) {
                    Logger.getLogger(ApplicantForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                this.dispose();
            }

    }//GEN-LAST:event_button_saveActionPerformed

    private void button_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_saveMouseClicked

    }//GEN-LAST:event_button_saveMouseClicked

    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed

        this.dispose();

    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_cancelMouseClicked

    }//GEN-LAST:event_button_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(ApplicantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicantForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_save;
    private com.toedter.calendar.JDateChooser dbirth;
    private javax.swing.JLabel label_addcit;
    private javax.swing.JLabel label_addco;
    private javax.swing.JLabel label_addpro;
    private javax.swing.JLabel label_addspec;
    private javax.swing.JLabel label_applicantheader;
    private javax.swing.JLabel label_citizenship;
    private javax.swing.JLabel label_citizenship1;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_dbirth;
    private javax.swing.JLabel label_emailadd;
    private javax.swing.JLabel label_fname;
    private javax.swing.JLabel label_gender;
    private javax.swing.JLabel label_idnum;
    private javax.swing.JLabel label_lname;
    private javax.swing.JLabel label_minimize;
    private javax.swing.JLabel label_mnum;
    private javax.swing.JLabel label_tnum;
    public static javax.swing.JLabel label_uname;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPanel panel_border;
    private javax.swing.JRadioButton radiobutton_f;
    private javax.swing.JRadioButton radiobutton_m;
    private javax.swing.JTextField textfield_addcit;
    private javax.swing.JTextField textfield_addco;
    private javax.swing.JTextField textfield_addpro;
    private javax.swing.JTextField textfield_addspec;
    private javax.swing.JTextField textfield_cship;
    private javax.swing.JTextField textfield_emailaddap;
    private javax.swing.JTextField textfield_fname;
    private javax.swing.JTextField textfield_idnum;
    private javax.swing.JTextField textfield_lname;
    private javax.swing.JTextField textfield_mnum;
    private javax.swing.JTextField textfield_rel;
    private javax.swing.JTextField textfield_tnum;
    // End of variables declaration//GEN-END:variables
    
}
