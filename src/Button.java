import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener {
    private String label_text;
    private JLabel label = new JLabel();

    public Button(String button_name){
        this.label.setText(button_name);
        this.add(label);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setLabel_text("this");
    }

    //set the labeltext
    public void setLabel_text(String label_text) {
        this.label.setText(label_text);
    }

    //get the label text
    public String getLabel_text(){
        return this.label.getText();
    }
}
