import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by danelennon on 10/10/16.
 */
public class JMovieFrame extends JFrame {

    final JButton eastButton = new JButton("East of Edan");
    final JButton westButton = new JButton("West of Edan");
    final JTextField details = new JTextField("No details to show");

    public JMovieFrame() {
        super("Movies");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(eastButton,BorderLayout.EAST);
        eastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                details.setText("1995 starring James Dean");
            }
        });

        add(westButton,BorderLayout.WEST);
        westButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                details.setText("2015 starring Kieran Foster");
            }
        });

        add(details,BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        JFrame movieFrame = new JMovieFrame();
        movieFrame.setSize(350, 100);
        movieFrame.setVisible(true);

    }
}
