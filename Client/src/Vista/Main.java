package main;

import function.Method;
import function.Scrolling;
import java.awt.Adjustable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import message.Message;
import Designs.Get_Box;
import Designs.Friend_Box;
import Designs.Get_Box_New;
import Designs.Send_Box;
import Designs.Send_Box_New;

public class Main extends javax.swing.JFrame {
    int LayoutX;
    int LayoutY;
    public Main() {
        initComponents();
        open();
    }

    private void open() {
        Method.setFram(this);
        //Scroll manteniendo el click izquierdo
        new Scrolling(panelChat);
        new Scrolling(panelFriend);
        Method.setTextFieldSyle(txt,"");
        for (int i = 0; i < 10; i++) {
            BTNSendActionPerformed(null);
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        popUp_emoji = new javax.swing.JPopupMenu();
        popMix = new javax.swing.JPopupMenu();
        panel_bg = new javax.swing.JPanel();
        spChat = new javax.swing.JScrollPane();
        panelChat = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int width = getWidth();
                int height = getHeight();
                g.fillRect(0, 0, getWidth(), getHeight());
                RoundRectangle2D roundRect = new RoundRectangle2D.Float(0, 0, width, height, 20, 20); // Radio de las esquinas
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(getBackground());
                g2d.fill(roundRect);
            }
        }

        ;
        spFriend = new javax.swing.JScrollPane();
        panelFriend = new javax.swing.JPanel();
        txt = new javax.swing.JTextField(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(new Color(0,102,255));
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 0, 0);
            }
        };
        BTNSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNLogOut = new Designs.Button();
        lbStatus = new javax.swing.JLabel();
        LBLogOut = new javax.swing.JLabel();
        JPEnc = new javax.swing.JPanel();
        BTNMinizise = new javax.swing.JButton();
        BTNClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LBIcon = new javax.swing.JLabel();

        popUp.setBackground(new java.awt.Color(0,0,0,0));

        popUp_emoji.setBackground(new java.awt.Color(0,0,0,0));
        popUp_emoji.setMaximumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setMinimumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setPreferredSize(new java.awt.Dimension(504, 355));

        popUp.setBackground(new java.awt.Color(0,0,0,0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        setBackground(new java.awt.Color(2, 0, 8));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_bg.setBackground(new java.awt.Color(2, 0, 8));

        spChat.setBorder(null);
        spChat.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spChat.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelChat.setBackground(new java.awt.Color(2, 0, 8));
        panelChat.setLayout(new javax.swing.BoxLayout(panelChat, javax.swing.BoxLayout.Y_AXIS));
        spChat.setViewportView(panelChat);

        spFriend.setBorder(null);
        spFriend.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spFriend.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelFriend.setBackground(new java.awt.Color(2, 0, 8));
        panelFriend.setForeground(new java.awt.Color(2, 0, 8));
        panelFriend.setLayout(new javax.swing.BoxLayout(panelFriend, javax.swing.BoxLayout.Y_AXIS));
        spFriend.setViewportView(panelFriend);

        txt.setBackground(new java.awt.Color(2, 0, 8));
        txt.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt.setSelectionColor(new java.awt.Color(131, 188, 227));
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyTyped(evt);
            }
        });

        BTNSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/send.png"))); // NOI18N
        BTNSend.setBorder(null);
        BTNSend.setContentAreaFilled(false);
        BTNSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNSend.setFocusable(false);
        BTNSend.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/send-small.png"))); // NOI18N
        BTNSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSendActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amigos");

        jLabel2.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Chat");

        BTNLogOut.setBackground(new java.awt.Color(0, 102, 255));
        BTNLogOut.setFillBorder(20);
        BTNLogOut.setBorder(null);
        BTNLogOut.setForeground(new java.awt.Color(255, 255, 255));
        BTNLogOut.setText("Cerrar sesión");
        BTNLogOut.setBorderPainted(false);
        BTNLogOut.setColorClick(new java.awt.Color(0, 153, 204));
        BTNLogOut.setColorOver(new java.awt.Color(0, 204, 255));
        BTNLogOut.setFocusable(false);
        BTNLogOut.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BTNLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLogOutActionPerformed(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(255, 0, 51));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        LBLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(LBLogOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNSend, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(spFriend, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spChat, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spFriend, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spChat, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTNLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNSend, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(panel_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 880, 520));

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
        jLabel3.setText("iChat");

        javax.swing.GroupLayout JPEncLayout = new javax.swing.GroupLayout(JPEnc);
        JPEnc.setLayout(JPEncLayout);
        JPEncLayout.setHorizontalGroup(
            JPEncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEncLayout.createSequentialGroup()
                .addComponent(LBIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 700, Short.MAX_VALUE)
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

        getContentPane().add(JPEnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void BTNSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSendActionPerformed
        if (txt.getName().equals("have") && !txt.getText().equals("")) {
            try {
                Method.sendMessage(txt.getText().trim());
                txt.setText("");
                txt.grabFocus();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_BTNSendActionPerformed

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped
        if (evt.getKeyChar() == 10) {
            BTNSendActionPerformed(null);
        }
    }//GEN-LAST:event_txtKeyTyped

    private Thread th;
    private int currentID = 0;

    private void start() {
        th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("Esperando mensaje ...");
                        Message ms = (Message) Method.getIn().readObject();
                        String status = ms.getStatus();
                        if (status.equals("Message")) {
                            getMessage(ms.getID(), ms.getMessage());
                        } else if (status.equals("New")) {
                            newFriend(ms.getImage(), ms.getID(), ms.getName().split("!")[0], ms.getName().split("!")[1]);
                        } else if (status.equals("Error")) {
                            errorFrient(ms.getID());
                        }
                    }
                } catch (Exception e) {
                    String ms = e.getMessage();
                    if (ms.equals("Socket closed")) {
                        signOut("Sign out");
                    } else if (ms.equals("Connection reset")) {
                        signOut("Server has error");
                    } else {
                        signOut("Error : " + ms);
                    }

                }
            }
        });
        th.start();
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        start();
    }//GEN-LAST:event_formWindowOpened

    private void BTNLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLogOutActionPerformed
        int c = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (c == JOptionPane.YES_OPTION) {
            try {
                Method.getClient().close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_BTNLogOutActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

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

    private void signOut(String ms) {
        try {
            this.dispose();
            String[] v = {ms};
            Login.main(v);
        } catch (Exception e) {
        }
    }

    private void getMessage(int ID, String ms) {
        if (ID == Method.getMyID()) {
            if (ID == currentID) {
                Send_Box box = new Send_Box();
                box.setMessage(ms);
                panelChat.add(box);
            } else {
                Send_Box_New box = new Send_Box_New();
                box.setMessage(ID, ms);
                panelChat.add(box);
            }
        } else {
            if (ID == currentID) {
                Get_Box box = new Get_Box();
                box.setMessage(ms);
                panelChat.add(box);
            } else {
                Get_Box_New box = new Get_Box_New();
                box.setMessage(ID, ms);
                panelChat.add(box);
            }
        }
        currentID = ID;
        refresh(panelChat);
        scrollToBottom(spChat);
    }


    private void newFriend(ImageIcon image, int ID, String name, String time) {
        Friend_Box friend = new Friend_Box();
        friend.set(image, ID, name, time);
        Method.getFriends().put(ID, friend);
        if (Method.getMyName().equalsIgnoreCase(name)) {
            Method.setMyID(ID);
            friend.ResaltarUser();
        }
        panelFriend.add(friend);
        refresh(panelFriend);
    }

    private void errorFrient(int ID) {
        panelFriend.remove((Component) Method.getFriends().get(ID));
        Method.getFriends().remove(ID);
        refresh(panelFriend);
    }

    private void refresh(Component obj) {
        obj.revalidate();
        obj.repaint();
    }

    private void scrollToBottom(JScrollPane scrollPane) {
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

  
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
    private Designs.Button BTNLogOut;
    private javax.swing.JButton BTNMinizise;
    private javax.swing.JButton BTNSend;
    private javax.swing.JPanel JPEnc;
    private javax.swing.JLabel LBIcon;
    private javax.swing.JLabel LBLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JDesktopPane panelChat;
    private javax.swing.JPanel panelFriend;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPopupMenu popMix;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JPopupMenu popUp_emoji;
    private javax.swing.JScrollPane spChat;
    private javax.swing.JScrollPane spFriend;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
