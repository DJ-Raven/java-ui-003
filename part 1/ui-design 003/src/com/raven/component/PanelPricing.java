package com.raven.component;

import com.raven.model.Model_Data;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;

public class PanelPricing extends javax.swing.JPanel {

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
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
    }
    private Color color1 = new Color(20, 203, 144);
    private Color color2 = new Color(17, 139, 40);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetail = new com.raven.component.PanelDetail();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
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

    public void addEventBuy(ActionListener event) {
        panelDetail.addEventBuy(event);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.PanelDetail panelDetail;
    // End of variables declaration//GEN-END:variables
}
