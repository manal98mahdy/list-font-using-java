package list_font;

import javax.swing.*;
import java.awt.*;


class mypanel extends JPanel {
 @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from 
        
        //String [] s = Toolkit.getDefaultToolkit().getFontList();
       GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] availableFonts = ge.getAvailableFontFamilyNames();
        int i=10;
        for(String f : availableFonts){
        Font font= new Font(f,Font.ITALIC,15);
        g.setFont(font);
        g.drawString(f, 180, i+=20);
         
        }
        
        String [] s = Toolkit.getDefaultToolkit().getFontList();
        int x=10;
        for(String f : s){
        Font font= new Font(f,Font.ITALIC,15);
        g.setFont(font);
        g.drawString(f, 30, x+=50);
         
        }
    
}
}

public class List_font extends JFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame("Available Fonts");
        mypanel panel = new mypanel();
        f.setContentPane(panel);
        f.setSize(500, 900);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
