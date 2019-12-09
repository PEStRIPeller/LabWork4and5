package Nikita;

import javax.swing.*;

public class Start {
private JFrame window;
public Start(){
    window = new JFrame("Terminal Database");
    window.setSize(250,200);
    window.setLocationRelativeTo(null);
    window.setResizable(false);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.add(new Panel());

}
}
