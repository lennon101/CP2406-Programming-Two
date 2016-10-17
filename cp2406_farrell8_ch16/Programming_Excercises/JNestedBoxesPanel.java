import javax.swing.*;
import java.awt.*;

/**
 * Created by danelennon on 17/10/16.
 */
public class JNestedBoxesPanel extends JPanel {
    int width, corner;

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        corner = 150;
        width = 2;
        for(int i = 0;i<15;++i) {
            width +=20;
            gr.setColor(Color.BLACK);
            gr.drawRect(corner- width /2, corner- width /2, width, width);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setSize(340, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
