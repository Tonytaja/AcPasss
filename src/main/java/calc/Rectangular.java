package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Rectangular extends WindowFigures{
    Rectangular(){
        ImageIcon figure = new ImageIcon("src/main/java/calc/prostokat.png");
        Image fig = figure.getImage().getScaledInstance(250,250,5);
        figure= new ImageIcon(fig);

        ImageIcon formula= new ImageIcon("src/main/java/calc/RECTANGLE AREA.png");
        Image fm= formula.getImage().getScaledInstance(300,170,Image.SCALE_SMOOTH);
        formula= new ImageIcon(fm);

        JTextField textField1 = new JTextField();

        label3.setIcon(formula);
        label4.setIcon(figure);
        textField.setText("Enter A ");

        textField1.setText("Enter B ");
        textField1.setPreferredSize(new Dimension(250,40));
        textField1.setFont(new Font("Consolas",Font.ITALIC,25));
        textField1.setForeground(Color.GREEN);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
        panel8.add(textField1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double text= Double.valueOf((String) textField.getText());
                Double text2 = Double.valueOf((String) textField1.getText());
                double ty = (text * text2);
                DecimalFormat df = new DecimalFormat("###.###");
                solution.setText(df.format(ty));

            }
        });
    }
}
