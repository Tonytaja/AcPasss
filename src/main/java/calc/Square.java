package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Square extends WindowFigures {
    private double a;

    public Square() {

        ImageIcon figure = new ImageIcon("src/main/java/calc/square.png");
        Image fig = figure.getImage().getScaledInstance(250,250,5);
        figure= new ImageIcon(fig);

        ImageIcon formula= new ImageIcon("src/main/java/calc/squareArea.png");
        Image fm= formula.getImage().getScaledInstance(300,170,Image.SCALE_SMOOTH);
        formula= new ImageIcon(fm);

        label3.setIcon(formula);
        label4.setIcon(figure);
        textField.setText("Enter a ");
        button1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  Double text= Double.valueOf((String) textField.getText());
                  double ty = text * text;
                  DecimalFormat df = new DecimalFormat("###.###");
                  solution.setText(df.format(ty));

              }
          });


    }


}
