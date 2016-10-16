import javax.swing.*;
import java.awt.*;

/**
 * Created by danelennon on 10/10/16.
 */
public class JFlexiblePanel extends JPanel {
    private Color bg;
    private Color fg;

    JTextArea text;

    public JFlexiblePanel(Color bg, Color fg, String text, Font font) {
        this.bg = bg;
        this.fg = fg;

        this.text = new JTextArea(text);
        this.text.setFont(font);
        this.text.setForeground(fg);
        this.text.setBackground(bg);

        add(this.text);

        setBackground(bg);
        //setForeground(fg);
    }
}
