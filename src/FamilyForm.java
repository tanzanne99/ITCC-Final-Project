
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FamilyForm extends javax.swing.JFrame {
   
    public FamilyForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_fcnum1 = new javax.swing.JLabel();
        label_ffname2 = new javax.swing.JLabel();
        label_fage1 = new javax.swing.JLabel();
        textfield_mnum1 = new javax.swing.JTextField();
        textfield_fcnum1 = new javax.swing.JTextField();
        label_ffname3 = new javax.swing.JLabel();
        textfield_ffname1 = new javax.swing.JTextField();
        label_mcnum1 = new javax.swing.JLabel();
        label_minfo1 = new javax.swing.JLabel();
        label_mage1 = new javax.swing.JLabel();
        textfield_mage1 = new javax.swing.JTextField();
        textfield_mcnum1 = new javax.swing.JTextField();
        label_mfname1 = new javax.swing.JLabel();
        textfield_mfname1 = new javax.swing.JTextField();
        panel_border = new javax.swing.JPanel();
        label_fbgheader = new javax.swing.JLabel();
        panel_bg = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        textfield_fcnum = new javax.swing.JTextField();
        label_ffname = new javax.swing.JLabel();
        textfield_ffname = new javax.swing.JTextField();
        label_fcnum = new javax.swing.JLabel();
        label_fage = new javax.swing.JLabel();
        textfield_fage = new javax.swing.JTextField();
        label_uname = new javax.swing.JLabel();
        label_finfo = new javax.swing.JLabel();
        label_mcnum = new javax.swing.JLabel();
        label_minfo = new javax.swing.JLabel();
        label_mage = new javax.swing.JLabel();
        textfield_mage = new javax.swing.JTextField();
        textfield_mcnum = new javax.swing.JTextField();
        label_mfname = new javax.swing.JLabel();
        textfield_mfname = new javax.swing.JTextField();
        label_gcnum = new javax.swing.JLabel();
        label_ginfo2 = new javax.swing.JLabel();
        label_gage = new javax.swing.JLabel();
        textfield_gage = new javax.swing.JTextField();
        textfield_gcnum = new javax.swing.JTextField();
        label_gfname = new javax.swing.JLabel();
        textfield_gfname = new javax.swing.JTextField();
        label_grel = new javax.swing.JLabel();
        textfield_grel = new javax.swing.JTextField();
        label_close = new javax.swing.JLabel();
        label_minimize = new javax.swing.JLabel();

        label_fcnum1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_fcnum1.setForeground(new java.awt.Color(250, 250, 250));
        label_fcnum1.setText("Contact No.");

        label_ffname2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_ffname2.setForeground(new java.awt.Color(250, 250, 250));
        label_ffname2.setText("FATHER'S INFO");

        label_fage1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_fage1.setForeground(new java.awt.Color(250, 250, 250));
        label_fage1.setText("Age");

        textfield_mnum1.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mnum1.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mnum1.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mnum1.setName(""); // NOI18N
        textfield_mnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mnum1ActionPerformed(evt);
            }
        });
        textfield_mnum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mnum1KeyTyped(evt);
            }
        });

        textfield_fcnum1.setBackground(new java.awt.Color(108, 121, 142));
        textfield_fcnum1.setForeground(new java.awt.Color(250, 250, 250));
        textfield_fcnum1.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_fcnum1.setName(""); // NOI18N
        textfield_fcnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_fcnum1ActionPerformed(evt);
            }
        });
        textfield_fcnum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_fcnum1KeyTyped(evt);
            }
        });

        label_ffname3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_ffname3.setForeground(new java.awt.Color(250, 250, 250));
        label_ffname3.setText("Full Name");

        textfield_ffname1.setBackground(new java.awt.Color(108, 121, 142));
        textfield_ffname1.setForeground(new java.awt.Color(250, 250, 250));
        textfield_ffname1.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_ffname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_ffname1ActionPerformed(evt);
            }
        });
        textfield_ffname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_ffname1KeyTyped(evt);
            }
        });

        label_mcnum1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_mcnum1.setForeground(new java.awt.Color(250, 250, 250));
        label_mcnum1.setText("Contact No.");

        label_minfo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_minfo1.setForeground(new java.awt.Color(250, 250, 250));
        label_minfo1.setText("MOTHER'S INFO");

        label_mage1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_mage1.setForeground(new java.awt.Color(250, 250, 250));
        label_mage1.setText("Age");

        textfield_mage1.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mage1.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mage1.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mage1.setName(""); // NOI18N
        textfield_mage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mage1ActionPerformed(evt);
            }
        });
        textfield_mage1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mage1KeyTyped(evt);
            }
        });

        textfield_mcnum1.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mcnum1.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mcnum1.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mcnum1.setName(""); // NOI18N
        textfield_mcnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mcnum1ActionPerformed(evt);
            }
        });
        textfield_mcnum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mcnum1KeyTyped(evt);
            }
        });

        label_mfname1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_mfname1.setForeground(new java.awt.Color(250, 250, 250));
        label_mfname1.setText("Full Name");

        textfield_mfname1.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mfname1.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mfname1.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mfname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mfname1ActionPerformed(evt);
            }
        });
        textfield_mfname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mfname1KeyTyped(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_border.setBackground(new java.awt.Color(161, 145, 88));

        label_fbgheader.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        label_fbgheader.setForeground(new java.awt.Color(240, 240, 240));
        label_fbgheader.setText("FAMILY BACKGROUND");

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

        textfield_fcnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_fcnum.setForeground(new java.awt.Color(250, 250, 250));
        textfield_fcnum.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_fcnum.setName(""); // NOI18N
        textfield_fcnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_fcnumActionPerformed(evt);
            }
        });
        textfield_fcnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_fcnumKeyTyped(evt);
            }
        });

        label_ffname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_ffname.setForeground(new java.awt.Color(250, 250, 250));
        label_ffname.setText("Full Name");

        textfield_ffname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_ffname.setForeground(new java.awt.Color(250, 250, 250));
        textfield_ffname.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_ffname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_ffnameActionPerformed(evt);
            }
        });
        textfield_ffname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_ffnameKeyTyped(evt);
            }
        });

        label_fcnum.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_fcnum.setForeground(new java.awt.Color(250, 250, 250));
        label_fcnum.setText("Contact No.");

        label_fage.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_fage.setForeground(new java.awt.Color(250, 250, 250));
        label_fage.setText("Age");

        textfield_fage.setBackground(new java.awt.Color(108, 121, 142));
        textfield_fage.setForeground(new java.awt.Color(250, 250, 250));
        textfield_fage.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_fage.setName(""); // NOI18N
        textfield_fage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_fageActionPerformed(evt);
            }
        });
        textfield_fage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_fageKeyTyped(evt);
            }
        });

        label_uname.setBackground(new java.awt.Color(40, 57, 113));
        label_uname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        label_uname.setForeground(new java.awt.Color(40, 57, 113));
        label_uname.setText("<username>");

        label_finfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_finfo.setForeground(new java.awt.Color(250, 250, 250));
        label_finfo.setText("FATHER'S INFO");

        label_mcnum.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_mcnum.setForeground(new java.awt.Color(250, 250, 250));
        label_mcnum.setText("Contact No.");

        label_minfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_minfo.setForeground(new java.awt.Color(250, 250, 250));
        label_minfo.setText("MOTHER'S INFO");

        label_mage.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_mage.setForeground(new java.awt.Color(250, 250, 250));
        label_mage.setText("Age");

        textfield_mage.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mage.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mage.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mage.setName(""); // NOI18N
        textfield_mage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mageActionPerformed(evt);
            }
        });
        textfield_mage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mageKeyTyped(evt);
            }
        });

        textfield_mcnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mcnum.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mcnum.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mcnum.setName(""); // NOI18N
        textfield_mcnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mcnumActionPerformed(evt);
            }
        });
        textfield_mcnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mcnumKeyTyped(evt);
            }
        });

        label_mfname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_mfname.setForeground(new java.awt.Color(250, 250, 250));
        label_mfname.setText("Full Name");

        textfield_mfname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mfname.setForeground(new java.awt.Color(250, 250, 250));
        textfield_mfname.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_mfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_mfnameActionPerformed(evt);
            }
        });
        textfield_mfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_mfnameKeyTyped(evt);
            }
        });

        label_gcnum.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_gcnum.setForeground(new java.awt.Color(250, 250, 250));
        label_gcnum.setText("Contact No.");

        label_ginfo2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_ginfo2.setForeground(new java.awt.Color(250, 250, 250));
        label_ginfo2.setText("GUARDIAN'S INFO");

        label_gage.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_gage.setForeground(new java.awt.Color(250, 250, 250));
        label_gage.setText("Age");

        textfield_gage.setBackground(new java.awt.Color(108, 121, 142));
        textfield_gage.setForeground(new java.awt.Color(250, 250, 250));
        textfield_gage.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_gage.setName(""); // NOI18N
        textfield_gage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_gageActionPerformed(evt);
            }
        });
        textfield_gage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_gageKeyTyped(evt);
            }
        });

        textfield_gcnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_gcnum.setForeground(new java.awt.Color(250, 250, 250));
        textfield_gcnum.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_gcnum.setName(""); // NOI18N
        textfield_gcnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_gcnumActionPerformed(evt);
            }
        });
        textfield_gcnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_gcnumKeyTyped(evt);
            }
        });

        label_gfname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_gfname.setForeground(new java.awt.Color(250, 250, 250));
        label_gfname.setText("Full Name");

        textfield_gfname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_gfname.setForeground(new java.awt.Color(250, 250, 250));
        textfield_gfname.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_gfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_gfnameActionPerformed(evt);
            }
        });
        textfield_gfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_gfnameKeyTyped(evt);
            }
        });

        label_grel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label_grel.setForeground(new java.awt.Color(250, 250, 250));
        label_grel.setText("Relation");

        textfield_grel.setBackground(new java.awt.Color(108, 121, 142));
        textfield_grel.setForeground(new java.awt.Color(250, 250, 250));
        textfield_grel.setCaretColor(new java.awt.Color(40, 57, 113));
        textfield_grel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_grelActionPerformed(evt);
            }
        });
        textfield_grel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield_grelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_uname)
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_ginfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_ffname, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_finfo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_ffname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfield_fcnum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_bgLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(label_fcnum)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textfield_fage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_fage)))
                            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_bgLayout.createSequentialGroup()
                                    .addComponent(button_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_bgLayout.createSequentialGroup()
                                    .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_gfname, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textfield_gfname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_grel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textfield_grel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_gage)
                                        .addComponent(textfield_gage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(label_gcnum))
                            .addGroup(panel_bgLayout.createSequentialGroup()
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_mfname, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_minfo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_mfname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_bgLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textfield_mcnum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_bgLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(label_mcnum)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textfield_mage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_mage)))
                            .addComponent(textfield_gcnum, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addComponent(label_finfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_ffname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_fcnum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_fage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_ffname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_fcnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_fage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(label_minfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_mfname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_mcnum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_mage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_mfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_mcnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_mage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(label_ginfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_gfname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_gfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addComponent(label_grel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_grel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_gcnum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_gage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_gcnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_gage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancel)
                    .addComponent(button_save))
                .addGap(7, 7, 7)
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
                .addComponent(label_fbgheader)
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
                    .addComponent(label_fbgheader)
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
        textfield_ffname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_fcnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_fage.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mfname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mcnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_mage.setBackground(new java.awt.Color(108, 121, 142));
        textfield_gfname.setBackground(new java.awt.Color(108, 121, 142));
        textfield_grel.setBackground(new java.awt.Color(108, 121, 142));
        textfield_gcnum.setBackground(new java.awt.Color(108, 121, 142));
        textfield_gage.setBackground(new java.awt.Color(108, 121, 142));

        if (textfield_ffname.getText().equals("")) {
            textfield_ffname.setBackground(new java.awt.Color(255, 204, 204));
            textfield_ffname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_fcnum.getText().equals("")) {
            textfield_fcnum.setBackground(new java.awt.Color(255, 204, 204));
            textfield_fcnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_fage.getText().equals("")) {
            textfield_fage.setBackground(new java.awt.Color(255, 204, 204));
            textfield_fage.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_mfname.getText().equals("")) {
            textfield_mfname.setBackground(new java.awt.Color(255, 204, 204));
            textfield_mfname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_mcnum.getText().equals("")) {
            textfield_mcnum.setBackground(new java.awt.Color(255, 204, 204));
            textfield_mcnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_mage.getText().equals("")) {
            textfield_mage.setBackground(new java.awt.Color(255, 204, 204));
            textfield_mage.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_gfname.getText().equals("")) {
            textfield_gfname.setBackground(new java.awt.Color(255, 204, 204));
            textfield_gfname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_grel.getText().equals("")) {
            textfield_grel.setBackground(new java.awt.Color(255, 204, 204));
            textfield_grel.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_gcnum.getText().equals("")) {
            textfield_gcnum.setBackground(new java.awt.Color(255, 204, 204));
            textfield_gcnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (textfield_gage.getText().equals("")) {
            textfield_gage.setBackground(new java.awt.Color(255, 204, 204));
            textfield_gage.setForeground(new java.awt.Color(0, 0, 0));
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

    private void textfield_fageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_fageKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_fageKeyTyped

    private void textfield_fageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_fageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_fageActionPerformed

    private void textfield_ffnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_ffnameKeyTyped

        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_ffnameKeyTyped

    private void textfield_ffnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_ffnameActionPerformed

    }//GEN-LAST:event_textfield_ffnameActionPerformed

    private void textfield_fcnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_fcnumKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textfield_fcnumKeyTyped

    private void textfield_fcnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_fcnumActionPerformed

    }//GEN-LAST:event_textfield_fcnumActionPerformed

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed

        String ffname = textfield_ffname.getText();
        String fcnum = textfield_fcnum.getText();
        String fage = textfield_fage.getText();
        String mfname = textfield_ffname.getText();
        String mcnum = textfield_fcnum.getText();
        String mage = textfield_fage.getText();
        String gfname = textfield_gfname.getText();
        String grel = textfield_grel.getText();
        String gcnum = textfield_gcnum.getText();
        String gage = textfield_gage.getText();
        String uname = label_uname.getText();
            
        if(verifField()){
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
            try {
                ps = con.prepareStatement("UPDATE `application` SET `father_fname`= ?,`father_cnum`= ?, `father_age`= ?, `mother_fname`= ?, `mother_cnum`= ?, `mother_age`= ?, `guardian_fname`= ?, `guardian_rel`= ?, `guardian_cnum`= ?, `guardian_age`= ? WHERE `username`= ?");
                ps.setString(1, ffname);
                ps.setString(2, fcnum);
                ps.setString(3, fage);
                ps.setString(4, mfname);
                ps.setString(5, mcnum);
                ps.setString(6, mage);
                ps.setString(7, gfname);
                ps.setString(8, grel);
                ps.setString(9, gcnum);
                ps.setString(10, gage);
                ps.setString(11, uname);

                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Family Background saved");
                }

            }
            catch (SQLException ex) {
                Logger.getLogger(FamilyForm.class.getName()).log(Level.SEVERE, null, ex);
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

    private void textfield_mnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mnum1ActionPerformed

    private void textfield_mnum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mnum1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mnum1KeyTyped

    private void textfield_fcnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_fcnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_fcnum1ActionPerformed

    private void textfield_fcnum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_fcnum1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_fcnum1KeyTyped

    private void textfield_ffname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_ffname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_ffname1ActionPerformed

    private void textfield_ffname1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_ffname1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_ffname1KeyTyped

    private void textfield_mageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mageActionPerformed

    private void textfield_mageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mageKeyTyped

    private void textfield_mcnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mcnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mcnumActionPerformed

    private void textfield_mcnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mcnumKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mcnumKeyTyped

    private void textfield_mfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mfnameActionPerformed

    private void textfield_mfnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mfnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mfnameKeyTyped

    private void textfield_mage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mage1ActionPerformed

    private void textfield_mage1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mage1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mage1KeyTyped

    private void textfield_mcnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mcnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mcnum1ActionPerformed

    private void textfield_mcnum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mcnum1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mcnum1KeyTyped

    private void textfield_mfname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_mfname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mfname1ActionPerformed

    private void textfield_mfname1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_mfname1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_mfname1KeyTyped

    private void textfield_gageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_gageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_gageActionPerformed

    private void textfield_gageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_gageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_gageKeyTyped

    private void textfield_gcnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_gcnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_gcnumActionPerformed

    private void textfield_gcnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_gcnumKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_gcnumKeyTyped

    private void textfield_gfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_gfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_gfnameActionPerformed

    private void textfield_gfnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_gfnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_gfnameKeyTyped

    private void textfield_grelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_grelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_grelActionPerformed

    private void textfield_grelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_grelKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_grelKeyTyped

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
            java.util.logging.Logger.getLogger(FamilyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FamilyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FamilyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FamilyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FamilyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_save;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_fage;
    private javax.swing.JLabel label_fage1;
    private javax.swing.JLabel label_fbgheader;
    private javax.swing.JLabel label_fcnum;
    private javax.swing.JLabel label_fcnum1;
    private javax.swing.JLabel label_ffname;
    private javax.swing.JLabel label_ffname2;
    private javax.swing.JLabel label_ffname3;
    private javax.swing.JLabel label_finfo;
    private javax.swing.JLabel label_gage;
    private javax.swing.JLabel label_gcnum;
    private javax.swing.JLabel label_gfname;
    private javax.swing.JLabel label_ginfo2;
    private javax.swing.JLabel label_grel;
    private javax.swing.JLabel label_mage;
    private javax.swing.JLabel label_mage1;
    private javax.swing.JLabel label_mcnum;
    private javax.swing.JLabel label_mcnum1;
    private javax.swing.JLabel label_mfname;
    private javax.swing.JLabel label_mfname1;
    private javax.swing.JLabel label_minfo;
    private javax.swing.JLabel label_minfo1;
    private javax.swing.JLabel label_minimize;
    public static javax.swing.JLabel label_uname;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPanel panel_border;
    private javax.swing.JTextField textfield_fage;
    private javax.swing.JTextField textfield_fcnum;
    private javax.swing.JTextField textfield_fcnum1;
    private javax.swing.JTextField textfield_ffname;
    private javax.swing.JTextField textfield_ffname1;
    private javax.swing.JTextField textfield_gage;
    private javax.swing.JTextField textfield_gcnum;
    private javax.swing.JTextField textfield_gfname;
    private javax.swing.JTextField textfield_grel;
    private javax.swing.JTextField textfield_mage;
    private javax.swing.JTextField textfield_mage1;
    private javax.swing.JTextField textfield_mcnum;
    private javax.swing.JTextField textfield_mcnum1;
    private javax.swing.JTextField textfield_mfname;
    private javax.swing.JTextField textfield_mfname1;
    private javax.swing.JTextField textfield_mnum1;
    // End of variables declaration//GEN-END:variables
    
    public boolean verifField(){
        textfield_ffname.setBackground(new java.awt.Color(108,121,142));
        textfield_fcnum.setBackground(new java.awt.Color(108,121,142));
        textfield_fage.setBackground(new java.awt.Color(108,121,142));
        textfield_mfname.setBackground(new java.awt.Color(108,121,142));
        textfield_mcnum.setBackground(new java.awt.Color(108,121,142));
        textfield_mage.setBackground(new java.awt.Color(108,121,142));
        textfield_gfname.setBackground(new java.awt.Color(108,121,142));
        textfield_grel.setBackground(new java.awt.Color(108,121,142));
        textfield_gcnum.setBackground(new java.awt.Color(108,121,142));
        textfield_gage.setBackground(new java.awt.Color(108,121,142));
        
        if(textfield_ffname.getText().equals("")){
            textfield_ffname.setBackground(new java.awt.Color(255,204,204));
            textfield_ffname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_fcnum.getText().equals("")){
            textfield_fcnum.setBackground(new java.awt.Color(255,204,204));
            textfield_fcnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_fage.getText().equals("")){
            textfield_fage.setBackground(new java.awt.Color(255,204,204));
            textfield_fage.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_mfname.getText().equals("")){
            textfield_mfname.setBackground(new java.awt.Color(255,204,204));
            textfield_mfname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_mcnum.getText().equals("")){
            textfield_mcnum.setBackground(new java.awt.Color(255,204,204));
            textfield_mcnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_mage.getText().equals("")){
            textfield_mage.setBackground(new java.awt.Color(255,204,204));
            textfield_mage.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_gfname.getText().equals("")){
            textfield_gfname.setBackground(new java.awt.Color(255,204,204));
            textfield_gfname.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_grel.getText().equals("")){
            textfield_grel.setBackground(new java.awt.Color(255,204,204));
            textfield_grel.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_gcnum.getText().equals("")){
            textfield_gcnum.setBackground(new java.awt.Color(255,204,204));
            textfield_gcnum.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(textfield_gage.getText().equals("")){
            textfield_gage.setBackground(new java.awt.Color(255,204,204));
            textfield_gage.setForeground(new java.awt.Color(0, 0, 0));
        }
        else{
            return true;
        }
        return false;
    }   
}
