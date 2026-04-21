package java;

import javax.swing.*;
import java.awt.*;

public class CMYTabbedPane extends JFrame {

    public CMYTabbedPane() {
        // 1. Frame Setup
        setTitle("Cyan Magenta Yellow Tabs");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create the Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // 3. Create and add panels for each color
        // Using Color.CYAN, Color.MAGENTA, and Color.YELLOW
        tabbedPane.addTab("Cyan", createPanel(Color.CYAN));
        tabbedPane.addTab("Magenta", createPanel(Color.MAGENTA));
        tabbedPane.addTab("Yellow", createPanel(Color.YELLOW));

        // 4. Add to frame
        add(tabbedPane);
        setVisible(true);
    }

    // Helper method to generate colored panels
    private JPanel createPanel(Color c) {
        JPanel panel = new JPanel();
        panel.setBackground(c);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CMYTabbedPane());
    }
}
