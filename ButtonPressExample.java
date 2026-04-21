package java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonPressExample extends JFrame implements ActionListener {
    // Component declarations
    private JLabel messageLabel;
    private JButton indiaBtn, srilankaBtn;

    public ButtonPressExample() {
        // 1. Setup the frame
        setTitle("Event Handling Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 2. Initialize components
        indiaBtn = new JButton("India");
        srilankaBtn = new JButton("Srilanka");
        messageLabel = new JLabel("Press a button");

        // 3. Register buttons with the ActionListener
        indiaBtn.addActionListener(this);
        srilankaBtn.addActionListener(this);

        // 4. Add components to frame
        add(indiaBtn);
        add(srilankaBtn);
        add(messageLabel);

        setVisible(true);
    }

    // 5. Implement the event handling mechanism
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == indiaBtn) {
            messageLabel.setText("India is pressed");
        } else if (e.getSource() == srilankaBtn) {
            messageLabel.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new ButtonPressExample();
    }
}
