import sun.plugin2.util.ColorUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by danelennon on 10/10/16.
 */
public class JColourFrame extends JFrame {
    public JColourFrame() {
        super("Change my colour");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));

        Random rand = new Random();

        JButton clickMe = new JButton("Click Me");
        clickMe.setMaximumSize(new Dimension(20,20));

        add(clickMe,BorderLayout.CENTER);

        clickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Java 'Color' class takes 3 floats, from 0 to 1.
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();

                Color randomColor = new Color(r, g, b);

                getContentPane().setBackground(randomColor);
            }
        });
        pack();
        repaint();
    }

    public static void main(String[] args) {
        JFrame colourFrame = new JColourFrame();
        colourFrame.setSize(400, 200);
        colourFrame.setVisible(true);
    }
}
