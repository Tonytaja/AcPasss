package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Cone extends WindowVolumeFigures {
    private final double PI = 3.14;

    public Cone() {
        ImageIcon formula= new ImageIcon("src/main/java/calc/coneFormula.png");
        Image fm= formula.getImage().getScaledInstance(300,170,Image.SCALE_SMOOTH);
        formula= new ImageIcon(fm);

        ImageIcon figure = new ImageIcon("src/main/java/calc/cone.png");
        Image fig = figure.getImage().getScaledInstance(250,250,5);
        figure= new ImageIcon(fig);

        JTextField textField1 = new JTextField();

        label3.setIcon(formula);
        label4.setIcon(figure);
        textField.setText("Enter radius:");

        textField1.setText("Enter height:  ");
        textField1.setPreferredSize(new Dimension(250,40));
        textField1.setFont(new Font("Consolas",Font.ITALIC,25));
        textField1.setForeground(Color.GREEN);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);

        panel8.add(textField1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double text = Double.valueOf((String) textField.getText());
                Double text2 = Double.valueOf((String) textField1.getText());
                double pow= Math.pow(text,2);
                double ty= ((PI*pow)*(text2/3.0));
                DecimalFormat df = new DecimalFormat("###.###");
                solution.setText(df.format(ty));

            }});


    }
}
