package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Sphere extends WindowVolumeFigures{

    private final double PI=3.14285714286;
    public Sphere(){
        ImageIcon formula= new ImageIcon("src/main/java/calc/sphereFormula.png");
        Image fm= formula.getImage().getScaledInstance(300,170,Image.SCALE_SMOOTH);
        formula= new ImageIcon(fm);

        ImageIcon figure = new ImageIcon("src/main/java/calc/sphere.png");
        Image fig = figure.getImage().getScaledInstance(250,250,5);
        figure= new ImageIcon(fig);



        label3.setIcon(formula);
        label4.setIcon(figure);
        textField.setText("Enter radius:");


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double text = Double.valueOf((String) textField.getText());
                double t= 1.33333333333333;
                double div = Math.sqrt(t);
                double ty= (PI*t)*(Math.pow(text,3));
                DecimalFormat df = new DecimalFormat("###.###");
                solution.setText(df.format(ty));

            }});

    }
//    @Override
//    public double calculateTheVolume() {
//        double div= (double) 4/3;
//        return PI *div * Math.pow(radius,3);
//    }
}
