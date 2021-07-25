package com.raven.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Title extends JLabel {

    public Title() {
        setBorder(new EmptyBorder(5, 50, 5, 50));
        setFont(new java.awt.Font("sansserif", 1, 18));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth(), 3, 5, 5);
        int height = getHeight() - 1;
        Path2D.Float f = new Path2D.Float();
        f.moveTo(20, 0);
        f.lineTo(37, height - 3);
        f.curveTo(37, height - 3, 40, height, 43, height);
        f.lineTo(getWidth() - 43, height);
        f.curveTo(getWidth() - 43, height, getWidth() - 40, height, getWidth() - 37, height - 3);
        f.lineTo(getWidth() - 20, 0);
        g2.fill(f);
        super.paintComponent(grphcs);
    }
}
