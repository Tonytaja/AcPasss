package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Volume extends Buttons {
    JFrame frame =new JFrame();
    JButton button1= new JButton();
    JButton button2= new JButton();
    JButton button3= new JButton();
    JButton button4= new JButton();
    JButton button5= new JButton();
    JButton button6= new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    Buttons returnButton = new Buttons();

    ImageIcon iconSphere =new ImageIcon("src/main/java/calc/sphere.png");
    ImageIcon iconCone = new ImageIcon("src/main/java/calc/cone.png");
    ImageIcon iconCube = new ImageIcon("src/main/java/calc/cube.png");
    ImageIcon iconCylinder= new ImageIcon("src/main/java/calc/cylinder.png");

    Volume(){
        button1.setText("Cone");
        button1.setIcon(iconCone);
        button1.setBounds(50,50,100,50);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Cone cone= new Cone();

            }
        });

        button2.setText("Sphere");
        button2.setIcon(iconSphere);
        button2.setBounds(150,50,100,50);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Sphere sphere= new Sphere();

            }
        });

        button3.setText("Cube");
        button3.setIcon(iconCube);
        button3.setBounds(100,50,100,50);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Cube cube = new Cube();

            }
        });

        button4.setText("Cylinder");
        button4.setIcon(iconCylinder);
        button4.setBounds(200,50,100,50);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Cylinder cylinder =new Cylinder();

            }
        });

        button5.setText("Rectangular Tank");
        button5.setIcon(iconReturn);
        button5.setBounds(250,50,100,50);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                RecTang recTang = new RecTang();

            }
        });

        button6.setText("Square Pyramid");
        button6.setIcon(iconReturn);
        button6.setBounds(300,50,100,50);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                SquarePyramid squarePyramid = new SquarePyramid();

            }
        });
        button7.setText("Tube Volume");
        button7.setIcon(iconReturn);
        button7.setBounds(350,50,100,50);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                TubeVolume tubeVolume = new TubeVolume();

            }
        });
        button8.setText("Capsule");
        button8.setIcon(iconReturn);
        button8.setBounds(400,50,100,50);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Capsule capsule = new Capsule();

            }
        });
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
        label1.setText("Welcome, to Volume calculator" );
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
        panel3.add(button1);
        panel3.add(button2);
        panel3.add(button3);
        panel3.add(button4);
        panel3.add(button5);
        panel3.add(button6);
        panel3.add(button7);
        panel3.add(button8);


        frame.setTitle("Calculator  VOLUME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720,620);
        frame.setLayout(new BorderLayout(10,10));
        Image image = Toolkit.getDefaultToolkit().getImage("src/main/java/calc/rp.png");
        frame.setIconImage(image);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
