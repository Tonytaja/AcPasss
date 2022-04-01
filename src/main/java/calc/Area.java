package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area extends Buttons {
    JFrame frame =new JFrame();
    Buttons button1= new Buttons();
    Buttons button2= new Buttons();
    Buttons button3= new Buttons();
    Buttons button4= new Buttons();
    Buttons button5= new Buttons();
    Buttons button6= new Buttons();
    Buttons returnButton = new Buttons();
    ImageIcon iconCircle = new ImageIcon("src/main/java/calc/circle.png");
    ImageIcon iconSquare = new ImageIcon("src/main/java/calc/square.png");
    ImageIcon iconTriangle = new ImageIcon("src/main/java/calc/triangle.png");
    ImageIcon iconRectangle = new ImageIcon("src/main/java/calc/prostokat.png");
    ImageIcon iconRectangleTriangle = new ImageIcon("src/main/java/calc/triangle2.png");
    ImageIcon iconPentagram = new ImageIcon("src/main/java/calc/pentagram.png");
    ImageIcon iconTrapeze = new ImageIcon("src/main/java/calc/trapeze.png");
    Area(){
        JLabel label1 =new JLabel();
        label1.setText("Welcome, to area calculator" );
        label1.setFont(new Font("MV Boli", Font.BOLD,20));

        button1.button.setText("Circle");
        button1.button.setIcon(iconCircle);
        button1.button.setBounds(50,50,100,50);
        button1.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Circle circle =new Circle();

            }
        });

        button2.button.setText("Square");
        button2.button.setIcon(iconSquare);
        button2.button.setBounds(150,50,100,50);
        button2.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Square square = new Square();
            }
        });

        button3.button.setText("Triangle");
        button3.button.setIcon(iconTriangle);
        button3.button.setBounds(100,50,100,50);
        button3.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Triangle triangle = new Triangle();
            }
        });

        button4.button.setText("Rectangle");
        button4.button.setIcon(iconRectangle);
        button4.button.setBounds(250,50,100,50);
        button4.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Rectangular rectangular = new Rectangular();
            }
        });

        button5.button.setText("Trapeze");
        button5.button.setIcon(iconTrapeze);
        button5.button.setBounds(200,50,100,50);
        button5.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Trapeze trapeze = new Trapeze();
            }
        });

        button6.button.setText("Pentagon");
        button6.button.setIcon(iconPentagram);
        button6.button.setBounds(50,50,100,50);
        button6.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Pentagon pentagon = new Pentagon();
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
        panel3.add(button1.button);
        panel3.add(button2.button);
        panel3.add(button3.button);
        panel3.add(button4.button);
        panel3.add(button5.button);
        panel3.add(button6.button);
        panel2.add(returnButton.button);

        frame.setTitle("Calculator AREA ");
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
}
