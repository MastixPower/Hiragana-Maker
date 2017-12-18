import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.awt.FlowLayout;
public class AboutFrame extends JFrame{
    AboutFrame()
    {
        super("Rōmaji or Hiragana");
        setDefaultCloseOperation(AskingFrame.DISPOSE_ON_CLOSE);

        pack();
        setVisible(true);
        setResizable(false);
        setLocation(515, 200);
        setSize(240, 435);
        setLayout(null);
        JLabel Label=new JLabel("Hiragana Maker v1.1", SwingConstants.CENTER);
        Label.setFont(Label.getFont().deriveFont(23.0f));

        Label.setBounds(5,0,225,50);
        add(Label);
        JLabel Label2=new JLabel("<html>Przed tobą program, który na celu ma tworzenie losowych słów w zapisie rōmaji oraz hiraganie w celu ułatwienia nauki nowych znaków</html>", SwingConstants.CENTER);
        Label2.setFont(Label.getFont().deriveFont(15.0f));

        Label2.setBounds(5,65,225,200);
        add(Label2);
        JButton button1=new JButton("Back");
        button1.setBounds(5,295,225,100);

        add(button1);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {

                dispose();
            }
        });

    }
}
