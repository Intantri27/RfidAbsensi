/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.panels;

/**
 *
 * @author lenovo
 */

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class CambiaPanel {

    public CambiaPanel(JPanel container, JPanel content) {

        container.removeAll();

        container.setLayout(new BorderLayout());

        container.add(content, BorderLayout.CENTER);

        container.revalidate();

        container.repaint();
    }
}