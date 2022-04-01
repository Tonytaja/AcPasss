import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Drawing extends JComponent{




    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter X");
        int X = scanner.nextInt();
        System.out.println("Enter Y");
        int Y= scanner.nextInt();
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(00, 00, 640, 800);
        window.getContentPane().add(new Drawing());
        window.setVisible(true);

    }
    public void paint(Graphics g){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter X");
        int X = scanner.nextInt();
        System.out.println("Enter Y");
        int Y= scanner.nextInt();
        g.setColor(Color.BLUE);
        g.drawLine(X,Y,X,Y);
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(00, 00, 640, 800);
        window.getContentPane().add(new Drawing());
        window.setVisible(true);

    }


}
