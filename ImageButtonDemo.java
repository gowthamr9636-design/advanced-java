package java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JButton clockBtn, glassBtn;

    public ImageButtonDemo() {
        // 1. Setup the frame
        setTitle("Image Button Event Handling");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 2. Load images (Ensure clock.png and hourglass.png are in your project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon glassIcon = new ImageIcon("hourglass.png");

        // 3. Initialize buttons with images
        clockBtn = new JButton("Digital Clock", clockIcon);
        glassBtn = new JButton("Hour Glass", glassIcon);
        
        // Initialize the message label
        messageLabel = new JLabel("Press an image button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // 4. Register action listeners
        clockBtn.addActionListener(this);
        glassBtn.addActionListener(this);

        // 5. Add components to the frame
        add(clockBtn);
        add(glassBtn);
        add(messageLabel);

        setVisible(true);
    }

    // 6. Event handling mechanism
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clockBtn) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == glassBtn) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new ImageButtonDemo());
    }
}
