package com.raven.component;

import com.raven.model.Model_Data;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class PanelPricing extends javax.swing.JPanel {

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
        title1.setForeground(color1);
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
        panelDetail.setButtonColor(color2);
    }

    public PanelPricing() {
        initComponents();
        setOpaque(false);
        setPreferredSize(new Dimension(300, 430));
        panelDetail.setButtonColor(color2);
        title1.setForeground(color1);
    }
    private Color color1 = new Color(20, 203, 144);
    private Color color2 = new Color(17, 139, 40);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetail = new com.raven.component.PanelDetail();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        title1 = new com.raven.swing.Title();

        jLayeredPane1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lb1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("$59.");
        lb1.setBorder(null);
        jLayeredPane1.add(lb1);

        lb2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("99");
        lb2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        jLayeredPane1.add(lb2);

        jLayeredPane2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        title1.setText("TITLE");
        jLayeredPane2.add(title1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        int x = 25;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(x, 0, getWidth() - x, getHeight(), 25, 25);
        fillBox(g2);
        super.paintComponent(grphcs);
    }

    private void fillBox(Graphics2D g2) {
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(50, 25, 100, 100);
        g2.fillOval(getWidth() - 115, getHeight() - 115, 100, 100);
        g2.fillOval(getWidth() - 180, getHeight() - 50, 150, 150);
    }

    public void addItem(Model_Data data) {
        panelDetail.getList().addItem(data);
    }

    public void setPrice(String title, double price) {
        this.title1.setText(title);
        DecimalFormat df = new DecimalFormat("#,#00");
        String p = price + "";
        String priceArray[] = p.split("\\.");
        if (priceArray.length == 2) {
            lb1.setText("$" + df.format(Double.valueOf(priceArray[0])) + ".");
            lb2.setText(df.format(Double.valueOf(priceArray[1])));
        } else {
            lb1.setText("$" + df.format(Double.valueOf(priceArray[0])) + ".");
            lb2.setText("");
        }
    }

    public void addEventBuy(ActionListener event) {
        panelDetail.addEventBuy(event);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private com.raven.component.PanelDetail panelDetail;
    private com.raven.swing.Title title1;
    // End of variables declaration//GEN-END:variables
}
