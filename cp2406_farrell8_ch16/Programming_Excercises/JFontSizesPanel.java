import javax.swing.*;
import java.awt.*;

/**
 * Created by danelennon on 17/10/16.
 */
public class JFontSizesPanel extends JPanel{
    private int numToPrint = 15;
    private int startFontSize = 5;

    private String msg = "hello world!";

    private JLabel[] textAreas = new JLabel[numToPrint];

    public JFontSizesPanel() {

        int fontSize = startFontSize;
        for (int i=0;i<textAreas.length;++i){
            ++fontSize;
            Font f = new Font("Arial", Font.PLAIN, fontSize);
            textAreas[i] = new JLabel("Font size " + fontSize + ": "+ msg);
            textAreas[i].setFont(f);

            add(textAreas[i]);
        }


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JFontSizesPanel());
        frame.setSize(250, 550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
