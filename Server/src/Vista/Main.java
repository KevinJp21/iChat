package Vista;

import Controlador.Client;
import Controlador.Method;
import java.net.ServerSocket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    int LayoutX;
    int LayoutY;
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPEnc = new javax.swing.JPanel();
        BTNMinizise = new javax.swing.JButton();
        BTNClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LBIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        BTNStop = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BTNStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 0, 8));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-short.png"))); // NOI18N
        jLabel3.setText("iChat Servidor");

        javax.swing.GroupLayout JPEncLayout = new javax.swing.GroupLayout(JPEnc);
        JPEnc.setLayout(JPEncLayout);
        JPEncLayout.setHorizontalGroup(
            JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEncLayout.createSequentialGroup()
                .addComponent(LBIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
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
                            .addComponent(jLabel3))
                        .addGroup(JPEncLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTNMinizise)
                                .addComponent(BTNClose)))))
                .addGap(14, 14, 14))
        );

        getContentPane().add(JPEnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        jPanel1.setBackground(new java.awt.Color(2, 0, 8));

        txt.setEditable(false);
        txt.setBackground(new java.awt.Color(2, 0, 8));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setRows(5);
        txt.setCaretColor(new java.awt.Color(2, 0, 8));
        jScrollPane1.setViewportView(txt);

        jPanel2.setBackground(new java.awt.Color(255, 19, 29));
        jPanel2.setForeground(new java.awt.Color(255, 19, 29));
        jPanel2.setToolTipText("");

        BTNStop.setBackground(new java.awt.Color(255, 19, 29));
        BTNStop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BTNStop.setForeground(new java.awt.Color(255, 255, 255));
        BTNStop.setText("Desconectar");
        BTNStop.setBorder(null);
        BTNStop.setBorderPainted(false);
        BTNStop.setContentAreaFilled(false);
        BTNStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BTNStop, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTNStop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        BTNStart.setBackground(new java.awt.Color(0, 102, 255));
        BTNStart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BTNStart.setForeground(new java.awt.Color(255, 255, 255));
        BTNStart.setText("Conectar");
        BTNStart.setBorderPainted(false);
        BTNStart.setContentAreaFilled(false);
        BTNStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNStart.setFocusPainted(false);
        BTNStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTNStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTNStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 360, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ServerSocket server;
    private Thread run;

    private void startServer() throws Exception {
        Method.setClients(new ArrayList<>());
        run = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    server = new ServerSocket(5000);
                    Method.setTxt(txt);
                    txt.setText("Iniciando servidor ...\n");
                    while (true) {
                        new Client(server.accept());
                    }
                } catch (Exception e) {
                    System.out.println("Error" + e);
                    
                }
            }
        });
        run.start();
    }

    private void stopServer() throws Exception {
        int c = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres desconectar el servidor?", "Sotop Server", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (c == JOptionPane.YES_OPTION) {
            txt.setText("Servidor detenido");
            run.interrupt();
            server.close();
        }
    }
    private void BTNStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNStartActionPerformed
        try {
                startServer();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }//GEN-LAST:event_BTNStartActionPerformed

    private void BTNStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNStopActionPerformed
        try {
            stopServer();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }//GEN-LAST:event_BTNStopActionPerformed

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

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNClose;
    private javax.swing.JButton BTNMinizise;
    private javax.swing.JButton BTNStart;
    private javax.swing.JButton BTNStop;
    private javax.swing.JPanel JPEnc;
    private javax.swing.JLabel LBIcon;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
