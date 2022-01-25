import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    private static Boolean DEBUGGING = true;
    private static Debug main_debug = new Debug("Main");

    public static void main(String[] args){
        //creating a user list.
        //this will eventually be moved to being done via gui.
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("cj"));
        users.add(new User("bob"));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,100);

        //creating user heading panel
        JPanel user_heading = new JPanel();
        user_heading.add(new JLabel("Current Users"));

        //creating user buttons panel, and buttons.
        JPanel user_buttons_panel = new JPanel();

        //dynamically creating user buttons.
        for(User user : users){
            JButton button = new JButton(user.getName());
            user_buttons_panel.add(button);
            if(DEBUGGING){
                main_debug.start_debug();
                System.out.println("Adding Button for user: " + user.getName());
            }
        }

        //adding panels
        frame.getContentPane().add(BorderLayout.NORTH, user_heading);
        frame.getContentPane().add(BorderLayout.SOUTH, user_buttons_panel);
        frame.setVisible(true);
    }
}
