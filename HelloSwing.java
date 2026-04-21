package java;




import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame("Hello Swing Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new FlowLayout());

        // Create the label with specified text
        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");

        // Set the font to Plain with size 32
        // Font constants: Font.PLAIN, Font.BOLD, Font.ITALIC
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set the text color to blue
        label.setForeground(Color.BLUE);

        // Add the label to the frame and make it visible
        frame.add(label);
        frame.setVisible(true);
    }
}
