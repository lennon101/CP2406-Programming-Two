import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by danelennon on 17/10/16.
 */
public class JUpsideDownPanel extends JPanel {

    private JLabel label = new JLabel();
    String rightSide = "hello world";
    String upside = "μԍɼɼo ʍoɩɼq";
    JButton clickMe = new JButton("click me");

    private int state = 0;

    public JUpsideDownPanel() {

        label.setText(rightSide);
        add(label);
        add(clickMe);

        clickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (state == 0){
                    state = 1;
                    label.setText(upside);
                }else{
                    state = 0;
                    label.setText(rightSide);
                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JUpsideDownPanel());
        frame.setSize(340, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
