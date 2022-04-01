package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    
    JButton button = new JButton();

    ImageIcon icon= new ImageIcon("src/main/java/gui/pp.jpg");
    ImageIcon iconReturn = new ImageIcon("src/main/java/calc/return.png");
    Buttons(){
        button.setBounds(0,0,100,50);
        button.setText("Button");
        button.setIcon(icon);
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setIconTextGap(25);
        button.setForeground(Color.blue);
        button.setBackground(Color.cyan);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }
}
