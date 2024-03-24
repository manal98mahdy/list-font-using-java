/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list_font;

import javax.swing.*;
import java.awt.*;

public class DrawingGUI extends JFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame("Available Fonts");

        DrawingPanel drawingPanel = new DrawingPanel();
        f.add(drawingPanel);
        f.setSize(400, 450);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        SwingUtilities.invokeLater(DrawingGUI::new);
    }
}

class DrawingPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        g.drawRect(75, 350, 250, 20);

        // Draw a line
        g.drawLine(105, 70, 50, 220);
        g.drawLine(287, 70, 350, 220);
        g.drawLine(170, 260, 140, 350);
        g.drawLine(230, 260, 260, 350);
        g.drawArc(50, 180, 300, 80, 180, 180);
        
        // Draw an ellipse
        g.drawOval(100, 50, 190, 50);
        g.drawOval(100, 130, 40, 70);
        g.drawOval(165, 110, 70, 130);
        g.drawOval(260, 130, 40, 70);

        g.setColor(Color.pink);
        g.fillOval(100, 50, 190, 50);

        g.fillOval(100, 130, 40, 70);
        g.fillOval(165, 110, 70, 130);
        g.fillOval(260, 130, 40, 70);
    }
}
