package my_swing;

import function.Method;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Send_Box_New extends javax.swing.JPanel {

    public Send_Box_New() {
        initComponents();
    }

    public void setMessage(int ID, String ms) {
        txt.setText(ms);
        if (Method.getFriends().get(ID).getImage() != null) {
            profile.setIcon(Method.getFriends().get(ID).getImage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JTextField(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(new java.awt.Color(72, 173, 243));
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
                g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            }
        };
        jLayeredPane1 = new javax.swing.JLayeredPane();
        profile = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 0, 8));
        setMaximumSize(new java.awt.Dimension(600, 72));

        txt.setEditable(false);
        txt.setBackground(new java.awt.Color(2, 0, 8));
        txt.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 15)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt.setText("Your message here ..");
        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        txt.setMaximumSize(new java.awt.Dimension(510, 33));
        txt.setMinimumSize(new java.awt.Dimension(510, 33));
        txt.setSelectionColor(new java.awt.Color(131, 188, 227));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-small.png"))); // NOI18N
        jLayeredPane1.add(profile);

        lbName.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 15)); // NOI18N
        lbName.setForeground(new java.awt.Color(0, 204, 255));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbName.setText("Tú");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
