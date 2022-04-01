package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Pentagon extends WindowFigures{
    public Pentagon(){

        ImageIcon formula= new ImageIcon("src/main/java/calc/pentagramArea.png");
        Image fm= formula.getImage().getScaledInstance(300,170,Image.SCALE_SMOOTH);
        formula= new ImageIcon(fm);

        ImageIcon figure = new ImageIcon("src/main/java/calc/pentagram.png");
        Image fig = figure.getImage().getScaledInstance(250,250,5);
        figure= new ImageIcon(fig);



        label3.setIcon(formula);
        label4.setIcon(figure);
        textField.setText("Enter a:");


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double text = Double.valueOf((String) textField.getText());
                double y = Math.sqrt(5);
                double x = 5*(5+2 *y);
                double ty= 0.25*((text*text)*Math.sqrt(x));
                DecimalFormat df = new DecimalFormat("###.###");
                solution.setText(df.format(ty));

            }});
    }
}
