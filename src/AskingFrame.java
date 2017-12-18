import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.awt.FlowLayout;
public class AskingFrame  extends JFrame {
    AskingFrame() {
        super("Rōmaji or Hiragana");
        setDefaultCloseOperation(AskingFrame.DISPOSE_ON_CLOSE);

        pack();
        setVisible(true);
        setResizable(false);
        setLocation(515,200);
        setSize(240, 435);
        setLayout(null);
        JButton button1=new JButton("Choose Rōmaji:");
        button1.setBounds(5,65,225,100);
        JButton button2=new JButton("Choose Hiragana:");
        button2.setBounds(5,180,225,100);
        JButton button3=new JButton("About");
        button3.setBounds(5,295,225,100);
        add(button1);
        add(button2);
        add(button3);
        JLabel Label= new JLabel("Rōmaji or Hiragana", SwingConstants.CENTER);
        Label.setFont(Label.getFont().deriveFont(23.0f));

        Label.setBounds(5,0,225,50);
        add(Label);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                MyFrame.ChangeVrt(0);
                dispose();
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                MyFrame.ChangeVrt(1);
                dispose();
            }
        });
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new AboutFrame();
                    }

                });
                dispose();
            }
        });
    }
}
