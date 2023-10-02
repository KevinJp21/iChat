package main;

import function.Method;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;

public class Login extends javax.swing.JFrame {
    int LayoutX;
    int LayoutY;
    public Login() {
        initComponents();
        open();
    }

    private void open() {
        Method.setTextFieldSyle(txtUser, "Nombre de usuario");
        Method.setTextFieldSyle(txtIP, "Dirección IP");
        showStatus(ms);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIP = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        BTNLogin = new Designs.Button();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbStatus = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JPEnc = new javax.swing.JPanel();
        BTNMinizise = new javax.swing.JButton();
        BTNClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LBIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(2, 0, 8));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtIP.setBackground(new java.awt.Color(2, 0, 8));
        txtIP.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 18)); // NOI18N
        txtIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        txtIP.setSelectionColor(new java.awt.Color(131, 188, 227));
        txtIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIPKeyTyped(evt);
            }
        });

        txtUser.setBackground(new java.awt.Color(2, 0, 8));
        txtUser.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        txtUser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUser.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtUser.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtUser.setSelectionColor(new java.awt.Color(131, 188, 227));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        BTNLogin.setBackground(new java.awt.Color(0, 102, 255));
        BTNLogin.setForeground(new java.awt.Color(255, 255, 255));
        BTNLogin.setText("Iniciar sesión");
        BTNLogin.setColorClick(new java.awt.Color(0, 153, 204));
        BTNLogin.setColorOver(new java.awt.Color(0, 204, 255));
        BTNLogin.setFillBorder(20);
        BTNLogin.setFocusable(false);
        BTNLogin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BTNLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLoginActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        lbStatus.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(204, 0, 0));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user1.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(BTNLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(profile)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIP)
                                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jSeparator2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 36, 440, 410);

        JPEnc.setBackground(new java.awt.Color(2, 0, 8));
        JPEnc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPEncMouseDragged(evt);
            }
        });
        JPEnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPEncMousePressed(evt);
            }
        });

        BTNMinizise.setBackground(new java.awt.Color(2, 0, 8));
        BTNMinizise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minimize_1.png"))); // NOI18N
        BTNMinizise.setBorder(null);
        BTNMinizise.setBorderPainted(false);
        BTNMinizise.setContentAreaFilled(false);
        BTNMinizise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNMinizise.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BTNMinizise.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BTNMinizise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNMiniziseMouseClicked(evt);
            }
        });
        BTNMinizise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMiniziseActionPerformed(evt);
            }
        });

        BTNClose.setBackground(new java.awt.Color(2, 0, 8));
        BTNClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        BTNClose.setBorder(null);
        BTNClose.setBorderPainted(false);
        BTNClose.setContentAreaFilled(false);
        BTNClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNCloseMouseClicked(evt);
            }
        });
        BTNClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-short.png"))); // NOI18N
        jLabel1.setText("iChat");

        javax.swing.GroupLayout JPEncLayout = new javax.swing.GroupLayout(JPEnc);
        JPEnc.setLayout(JPEncLayout);
        JPEncLayout.setHorizontalGroup(
            JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEncLayout.createSequentialGroup()
                .addComponent(LBIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(BTNMinizise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNClose)
                .addGap(14, 14, 14))
        );
        JPEncLayout.setVerticalGroup(
            JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEncLayout.createSequentialGroup()
                .addGroup(JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPEncLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LBIcon))
                    .addGroup(JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPEncLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addGroup(JPEncLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTNMinizise)
                                .addComponent(BTNClose)))))
                .addGap(14, 14, 14))
        );

        getContentPane().add(JPEnc);
        JPEnc.setBounds(0, 0, 440, 40);

        setSize(new java.awt.Dimension(432, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLoginActionPerformed
        try {
            if (txtUser.getText().equals("") || !txtUser.getName().equals("have")) {
                txtUser.grabFocus();
                showStatus("Por favor ingresa tu nombre de usuario");
            } else {
                if (txtUser.getText().trim().length() > 15) {
                    txtUser.grabFocus();
                    showStatus("Tu nombre de usuario debe tener menos de 15 caracteres");
                } else {
                    String IP = txtIP.getText().trim();
                    if (txtIP.getText().equals("") || !txtIP.getName().equals("have")) {
                        IP = "localhost";
                        System.err.println("have");
                    }
                    String userName = txtUser.getText().trim();
                    Method.connect(profile_pic, userName, IP);
                    this.dispose();
                    Main.main(null);
                }

            }
        } catch (UnknownHostException e) {
            showStatus("Unknown host : " + txtIP.getText());
        } catch (java.rmi.UnknownHostException e) {
            showStatus("Unknown host : " + txtIP.getText());
        } catch (ConnectException e) {
            showStatus("Servidor no encontrado, Verifique la IP");
        } catch (java.rmi.ConnectException e) {
            showStatus("Servidor no encontrado, Verifique la IP");
        } catch (Exception e) {
            showStatus("Network is unreachable : connect");
            System.out.println(e);
        }

    }//GEN-LAST:event_BTNLoginActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if (evt.getKeyChar() == 10) {
            txtIP.grabFocus();
        }
        if (txtUser.getText().trim().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPKeyTyped
        if (evt.getKeyChar() == 10) {
            BTNLoginActionPerformed(null);
        }
    }//GEN-LAST:event_txtIPKeyTyped

    private void BTNMiniziseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNMiniziseMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_BTNMiniziseMouseClicked

    private void BTNMiniziseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMiniziseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNMiniziseActionPerformed

    private void BTNCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCloseMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            System.exit(0);
        }
    }//GEN-LAST:event_BTNCloseMouseClicked

    private void BTNCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCloseActionPerformed

    }//GEN-LAST:event_BTNCloseActionPerformed

    private void JPEncMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPEncMouseDragged
        this.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }//GEN-LAST:event_JPEncMouseDragged

    private void JPEncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPEncMousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();/*Obtiene la posicion x,y*/
        }
    }//GEN-LAST:event_JPEncMousePressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private ImageIcon profile_pic;
    private Timer timer = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            lbStatus.setText("");
            timer.stop();
        }
    });

    private void showStatus(String error) {
        if (timer.isRunning()) {
            lbStatus.setText("");
            timer.stop();
        }
        timer.start();
        lbStatus.setText(error);
    }

    private static String ms = "";

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (args.length == 1) {
                    ms = args[0];
                }
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNClose;
    private Designs.Button BTNLogin;
    private javax.swing.JButton BTNMinizise;
    private javax.swing.JPanel JPEnc;
    private javax.swing.JLabel LBIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
