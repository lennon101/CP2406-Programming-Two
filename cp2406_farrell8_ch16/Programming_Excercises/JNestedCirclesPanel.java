import javax.swing.*;
import java.awt.*;

/**
 * Created by danelennon on 17/10/16.
 */
public class JNestedCirclesPanel extends JPanel{
    int radius, corner;

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        corner = 150;
        radius = 2;
        for(int i = 0;i<15;++i) {
            radius +=20;
            gr.setColor(Color.BLACK);
            gr.drawOval(corner-radius/2, corner-radius/2, radius, radius);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedCirclesPanel());
        frame.setSize(340, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
