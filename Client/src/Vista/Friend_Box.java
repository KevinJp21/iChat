package Vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import Controlador.Friend;

public class Friend_Box extends javax.swing.JPanel implements Friend {

    private ImageIcon icon;
    private int ID;
    private String fName;
    private String time;

    @Override
    public void set(int ID, String name, String time) {
        lbName.setText(name);
        lbTime.setText(time);
        this.ID = ID;
        this.fName = name;
        this.time = time;
    }

    public void ResaltarUser() {
        lbName.setForeground(new Color(0,204,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        profile = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 8));
        setMaximumSize(new java.awt.Dimension(210, 61));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-small.png"))); // NOI18N
        jLayeredPane1.add(profile);

        line.setBackground(new java.awt.Color(51, 0, 153));
        line.setOpaque(true);

        lbTime.setForeground(new java.awt.Color(255, 255, 255));
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTime.setText("12:00 PM");

        lbName.setBackground(new java.awt.Color(0, 204, 255));
        lbName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Friend Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
            .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTime))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Friend_Box() {
        initComponents();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel line;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
