package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow  extends Buttons {
    JFrame frame =new JFrame();
    JButton button1= new JButton();
    JButton button2= new JButton();
    JButton button3= new JButton();
    MainWindow(){

        JLabel label1 =new JLabel();
        label1.setText("Welcome, please pick what you want to do ");
        label1.setFont(new Font("MV Boli", Font.BOLD,20));

        ImageIcon icon = new ImageIcon("src/main/java/calc/pp.jpg");
        Image images = icon.getImage();
        Image modifiedImage= icon.getImage().getScaledInstance(100,50,Image.SCALE_SMOOTH);
        icon= new ImageIcon(modifiedImage );



        button1.setBounds(200,100,100,50);
        button1.setText("Volume");
        button1.setIcon(icon);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Volume volume=new Volume();
            }
        });

        button2.setBounds(200,0,100,50);
        button2.setText("Area");
        button2.setIcon(icon);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Area area= new Area();
            }
        });

        button3.setBounds(200,50,100,50);
        button3.setText("PICK");
        button3.setIcon(icon);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                PICK pick= new PICK();
            }
        });


        
        

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
        panel3.add(button1);
        panel3.add(button2);
        panel3.add(button3);

        frame.setTitle("Calculator ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620,620);
        frame.setLayout(new BorderLayout(10,10));
        Image image = Toolkit.getDefaultToolkit().getImage("src/main/java/calc/rp.png");
        frame.setIconImage(image);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.setVisible(true);


    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        frame.dispose();
//
//        if (e.getSource()== button2){
//
//            Area area= new Area();
//        }else if (e.getSource()==button1){
//
//            Volume volume=new Volume();
//        } else
//        if (e.getSource()==button3){
//
//            PICK pick= new PICK();
//        }
//    }
}
