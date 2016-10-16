import javax.swing.*;
import java.awt.*;

/**
 * Created by danelennon on 11/10/16.
 */
public class JPanelDemo {

    public static void main(String[] args) {

        JFrame frameWithPanel = new JFrame();
        frameWithPanel.setSize(400, 200);
        frameWithPanel.setVisible(true);
        frameWithPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameWithPanel.setLayout(new GridLayout(3,3));

        // ---- first panel ----
        Color red = new Color(255,0,0);
        Color lime = new Color(0,255,0);
        Font bb = new Font("Britannic Bold",Font.PLAIN,23);
        JFlexiblePanel panel1 = new JFlexiblePanel(red,lime,"green on red",bb);

        // ---- second panel ----
        Color blue = new Color(0,0, 255);
        Color yellow = new Color(255,255,0);
        Font tnr = new Font("Times new roman", Font.BOLD, 25);
        JFlexiblePanel panel2 = new JFlexiblePanel(blue,yellow,"yellow on blue",tnr);

        // ---- third panel ----
        Color black = new Color(0,0, 0);
        Color white = new Color(255,255, 255);
        Font stencil = new Font("Stencil", Font.PLAIN,25);
        JFlexiblePanel panel3 = new JFlexiblePanel(black,white,"white on black",stencil);

        frameWithPanel.add(panel1);
        frameWithPanel.add(panel2);
        frameWithPanel.add(panel3);

        frameWithPanel.pack();
    }
}
