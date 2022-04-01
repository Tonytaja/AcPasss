package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PICK extends Buttons{
    JFrame frame =new JFrame();
    Buttons returnButton = new Buttons();

    PICK(){
        returnButton.button.setText("Return");
        returnButton.button.setIcon(iconReturn);
        returnButton.button.setBounds(50,50,100,50);
        returnButton.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MainWindow mainWindow = new MainWindow();
            }
        });

        JLabel label1 =new JLabel();
        label1.setText("Welcome, to PICK calculator" );
        label1.setFont(new Font("MV Boli", Font.BOLD,20));
        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3= new JPanel();

        panel1.setBackground(Color.orange);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.CYAN);


        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(50,100));
        panel3.setPreferredSize(new Dimension(50,100));

        panel1.add(label1);
        panel2.add(returnButton.button);

        frame.setTitle("Calculator  PICK ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620,620);
        frame.setLayout(new BorderLayout(10,10));
        Image image = Toolkit.getDefaultToolkit().getImage("src/main/java/gui/rp.png");
        frame.setIconImage(image);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
