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

        //Creating the frame.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating the main panel
        JPanel main_panel = new JPanel();
        BoxLayout box_layout= new BoxLayout(main_panel, BoxLayout.Y_AXIS);
        main_panel.setLayout(box_layout);

        //creating user heading panel
        JPanel user_heading = new JPanel();
        user_heading.add(new JLabel("Current Users"));
        main_panel.add(user_heading);

        //creating user buttons panel
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
        main_panel.add(user_buttons_panel);

        //Create new user button panel
        JPanel new_user_panel = new JPanel();
        JButton button = new JButton("New User");
        new_user_panel.add(button);
        main_panel.add(new_user_panel);

        //adding panels
        frame.add(main_panel);
        frame.pack(); //this is what dynamically handle frame size.
        frame.setVisible(true);
    }
}
