package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class WindowFigures extends Buttons  {

    JFrame frame =new JFrame();
    JButton button1= new JButton("Submit");
    JButton returnButton= new JButton();
    ImageIcon iconReturn = new ImageIcon("src/main/java/calc/return.png");
    Image icc = iconReturn.getImage().getScaledInstance(80,40,5);


    JTextField textField;
    JTextField solution;


    JLabel label1 =new JLabel();
    JLabel label2 =new JLabel();
    JLabel label3 =new JLabel();
    JLabel label4 = new JLabel();
    JPanel panel1= new JPanel();
    JPanel panel2= new JPanel();
    JPanel panel3= new JPanel();
    JPanel panel4= new JPanel();
    JPanel panel5= new JPanel();
    JPanel panel6= new JPanel();
    JPanel panel7= new JPanel();
    JPanel panel8= new JPanel();

    WindowFigures(){

        ImageIcon formula= new ImageIcon("src/main/java/calc/circleFromula.png");
        Image fm= formula.getImage().getScaledInstance(300,170,Image.SCALE_SMOOTH);
        formula= new ImageIcon(fm);

        iconReturn= new ImageIcon(icc);

        ImageIcon figure = new ImageIcon("src/main/java/calc/circle.png");
        Image fig = figure.getImage().getScaledInstance(250,250,5);
        figure= new ImageIcon(fig);

        label1.setText("Welcome please enter your values ");
        label1.setFont(new Font("MV Boli", Font.BOLD,20));

        label2.setText("Solution:");
        label3.setText("The Formula : ");
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.TOP);
        label3.setIconTextGap(25);
        label3.setIcon(formula);
        label4.setIcon(figure);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.ITALIC,25));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.white);
        textField.setCaretColor(Color.black);
        textField.setText("Enter the value ");

        solution= new JTextField();
        solution.setPreferredSize(new Dimension(250,40));
        solution.setFont(new Font("Consolas",Font.ITALIC,25));
        solution.setForeground(Color.GREEN);
        solution.setBackground(Color.white);
        solution.setCaretColor(Color.black);
        solution.setEditable(false);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        returnButton.setText("Return");
        returnButton.setBounds(50,50,100,50);
        returnButton.setIcon(iconReturn);
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Area area = new Area();
            }
        });



        panel1.setBackground(Color.orange);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.CYAN);
        panel4.setBackground(new Color(150,25,66));
        panel5.setBackground(Color.WHITE);
        panel6.setBackground(Color.green);
        panel7.setBackground(Color.WHITE);
        panel8.setBackground(Color.gray);



        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(50,50));
        panel3.setPreferredSize(new Dimension(50,100));
        panel4.setPreferredSize(new Dimension(310,150));
        panel5.setPreferredSize(new Dimension(310,270));
        panel6.setPreferredSize(new Dimension(310 ,60));
        panel7.setPreferredSize(new Dimension(310 ,240));
        panel8.setPreferredSize(new Dimension(310 ,240));

        panel1.add(label1);
        panel7.add(label3);
        panel5.add(label4);
        panel6.add(label2);
        panel6.add(solution);
        panel8.add(button1);
        panel8.add(textField);
        panel2.add(returnButton);
        panel4.add(panel5, BorderLayout.NORTH);
        panel4.add(panel6,BorderLayout.SOUTH);
        panel3.add(panel7,BorderLayout.NORTH);
        panel3.add(panel8,BorderLayout.EAST);


        frame.setTitle("Calculator AREA ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(620,620);
        frame.setLayout(new BorderLayout(10,10));
        Image image = Toolkit.getDefaultToolkit().getImage("src/main/java/calc/rp.png");
        frame.setIconImage(image);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.EAST);

        frame.setVisible(true);
    }
}
