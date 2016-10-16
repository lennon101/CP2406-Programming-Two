
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by danelennon on 10/10/16.
 */
public class JFontSelector extends JFrame{

    JButton tnr = new JButton("Times New Roman");
    JButton calibri = new JButton("Calibri");
    JButton bb = new JButton("Britannic Bold");
    JButton stencil = new JButton("Stencil");
    JButton eurostile = new JButton("Eurostile");

    JButton bigger = new JButton("Make Bigger");
    JButton smaller = new JButton("Make Smaller");

    JTextField fontTester = new JTextField("-----------Place holder---------");

    public JFontSelector() {
        super("Font Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(tnr);
        tnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fontSize = fontTester.getFont().getSize();
                fontTester.setFont(new Font("Times new roman", Font.PLAIN, fontSize));
            }
        });

        add(calibri);
        calibri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fontSize = fontTester.getFont().getSize();
                fontTester.setFont(new Font("Calibri", Font.PLAIN, fontSize));
            }
        });

        add(bb);
        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fontSize = fontTester.getFont().getSize();
                fontTester.setFont(new Font("Britannic Bold",Font.PLAIN,fontSize));
            }
        });

        add(stencil);
        stencil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fontSize = fontTester.getFont().getSize();
                fontTester.setFont(new Font("Stencil", Font.PLAIN,fontSize));
            }
        });

        add(eurostile);
        eurostile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fontSize = fontTester.getFont().getSize();
                fontTester.setFont(new Font("Eurostile",Font.PLAIN,fontSize));
            }
        });

        add(bigger);
        bigger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fontName = fontTester.getFont().getFontName();
                int fontSize = fontTester.getFont().getSize();
                ++fontSize;
                fontTester.setFont(new Font(fontName,Font.PLAIN,fontSize));
            }
        });

        add(smaller);
        smaller.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fontName = fontTester.getFont().getFontName();
                int fontSize = fontTester.getFont().getSize();
                --fontSize;
                fontTester.setFont(new Font(fontName,Font.PLAIN,fontSize));
            }
        });

        add(fontTester);
    }

    public static void main(String[] args) {
        JFrame fontSelector = new JFontSelector();
        fontSelector.setSize(400, 200);
        fontSelector.setVisible(true);
    }
}
