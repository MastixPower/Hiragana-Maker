import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{
    private static int OptionMenuVrt;

    public MyFrame()
    {
        super("Hiragana maker");
        String tab2[][]={
                {"A","I","U","E","O"},
                {"KA","KI","KU","KE","KO"},
                {"SA","SHI","SU","SE","SO"},
                {"TA","CHI","TSU","TE","TO"},
                {"NA","NI","NU","NE","NO"},
                {"HA","HI","FU","HE","HO"},
                {"MA","MI","MU","ME","MO"},
                {"YA","YU","YO"},
                {"RA","RI","RU","RE","RO"},
                {"WA","WO"},
                {"N"}};
        String tab1[][]={
                {"あ","い","う","え","お"},
                {"か","き","く","け","こ"},
                {"さ","し","す","せ","そ"},
                {"た","ち","つ","て","と"},
                {"な","に","ぬ","ね","の"},
                {"は","ひ","ふ","へ","ほ"},
                {"ま","み","む","め","も"},
                {"や","ゆ","よ"},
                {"ら","り","る","れ","ろ"},
                {"わ","を"},
                {"ん"}};

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setVisible(true);
        setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(1280, 720);
        setLayout(null);

        JButton button1=new JButton("End It");
        button1.setBounds(565,610,140,60);
        button1.setFont(button1.getFont().deriveFont(25.0f));


        JButton button2=new JButton("Next");
        button2.setBounds(565,610-130,140,60);
        button2.setFont(button2.getFont().deriveFont(25.0f));

        JButton button3=new JButton("Options");
        button3.setBounds(565,610-65,140,60);
        button3.setFont(button3.getFont().deriveFont(25.0f));

        JLabel Label= new JLabel("Hiragana Maker", SwingConstants.CENTER);
        Label.setFont(Label.getFont().deriveFont(50.0f));
        Label.setForeground(Color.red);
        Label.setBounds(390,0,500,150);


        JLabel Label2;
        Label2 = new JLabel("<html>Do you know<br> how to Hiragana?</html> " , SwingConstants.CENTER);
        Label2.setFont(Label.getFont().deriveFont(45.0f));
        Label2.setBounds(390,240,500,150);
        Label2.setForeground(Color.white);

        JLabel Label3= new JLabel(" by MastixPower v1.1", SwingConstants.CENTER);
        Label3.setFont(Label.getFont().deriveFont(10.0f));
        Label3.setForeground(Color.white);
        Label3.setSize(110,10);
        Label3.setLocation(1280-150,650);

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("D:\\zet\\ppj-ćwiczenia\\MyFrame\\src\\japan_flag-wallpaper-1280x720.jpg")));
        add(Label);
        add(button2);
        add(button1);
        add(button3);
        add(Label2);
        add(Label3);

        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new AskingFrame();
                    }

                });
            }
        });

        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                //System.out.println(OptionMenuVrt);
                if(OptionMenuVrt==1) {
                    Label2.setText("");

                    Label2.setVisible(false);
                    int x = (int) (Math.random() * 4 + 3);
                    String test[] = new String[x];

                    String word;
                    for (int i = 0; i < x; i++) {
                        int y = (int) (Math.random() * (tab1.length));

                        int z = (int) (Math.random() * (tab1[y].length));
                        test[i] = (tab1[y][z]);
                        Label2.setText(Label2.getText() + test[i]);

                    }
                    Label2.setVisible(true);
                }
                else
                {
                    Label2.setText("");

                    Label2.setVisible(false);
                    int x = (int) (Math.random() * 4 + 3);
                    String test[] = new String[x];

                    String word;
                    for (int i = 0; i < x; i++) {
                        int y = (int) (Math.random() * (tab2.length));

                        int z = (int) (Math.random() * (tab2[y].length));
                        test[i] = (tab2[y][z]);
                        Label2.setText(Label2.getText() + test[i]);

                    }
                    Label2.setVisible(true);
                }
            }
        });
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });

    }
    public static void ChangeVrt(int vrt)
    {
        OptionMenuVrt=vrt;
        System.out.println("dupa "+ vrt+OptionMenuVrt);
    }
}
