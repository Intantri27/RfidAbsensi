package rsbuttom;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class RSButtonMetro extends JButton {

    private final Color colorNormal = new Color(43,121,221);
    private final Color colorHover = new Color(25, 118, 210);
    private final Color colorPressed = new Color(13, 71, 161);

    private final int radius = 0;

    public RSButtonMetro() {

        setContentAreaFilled(false);

        setFocusPainted(false);

        setBorderPainted(false);

        setForeground(Color.WHITE);

        setFont(new Font("Segoe UI", Font.BOLD, 14));

        setCursor(new Cursor(Cursor.HAND_CURSOR));

        setBackground(colorNormal);
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        if (getModel().isPressed()) {

            g2.setColor(colorPressed);

        } else if (getModel().isRollover()) {

            g2.setColor(colorHover);

        } else {

            g2.setColor(colorNormal);
        }

        g2.fillRoundRect(
                0,
                0,
                getWidth(),
                getHeight(),
                radius,
                radius
        );

        g2.setStroke(new BasicStroke(0));

        g2.dispose();

        super.paintComponent(g);
    }
}