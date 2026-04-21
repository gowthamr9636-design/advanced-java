package java;
import javax.swing.*;
import java.awt.*;

public class TabbedPaneColorDemo extends JFrame {

    public TabbedPaneColorDemo() {
        // 1. Frame Setup
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create the Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // 3. Create Panels for each color
        JPanel redPanel = createColorPanel(Color.RED);
        JPanel bluePanel = createColorPanel(Color.BLUE);
        JPanel greenPanel = createColorPanel(Color.GREEN);

        // 4. Add tabs to the pane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // 5. Add Tabbed Pane to frame
        add(tabbedPane);
        setVisible(true);
    }

    // Helper method to create a panel with a specific background color
    private JPanel createColorPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TabbedPaneColorDemo());
    }
}
