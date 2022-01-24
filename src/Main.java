import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,100);

        //creating user heading panel
        JPanel user_heading = new JPanel();
        user_heading.add(new JLabel("Current Users"));

        //creating user buttons panel, and buttons.
        JPanel user_buttons_panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        user_buttons_panel.add(button1);
        user_buttons_panel.add(button2);

        //adding panels
        frame.getContentPane().add(BorderLayout.NORTH, user_heading);
        frame.getContentPane().add(BorderLayout.SOUTH, user_buttons_panel);
        frame.setVisible(true);
    }
}
