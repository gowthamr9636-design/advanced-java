package java;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo extends JFrame {
    private JList<String> countryList;

    public CountryListDemo() {
        // Set up the JFrame
        setTitle("Country Selection JList");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 1. Define the countries array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark", 
            "France", "Great Britain", "Japan", "Africa", 
            "Greenland", "Singapore"
        };

        // 2. Create the JList with the country array
        countryList = new JList<>(countries);
        
        // 3. Add JList to a JScrollPane for scrollability
        JScrollPane scrollPane = new JScrollPane(countryList);
        add(scrollPane, BorderLayout.CENTER);

        // 4. Implement event handling with ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Ensure the event isn't mid-adjustment (prevents double prints)
                if (!e.getValueIsAdjusting()) {
                    // Display selected country on the console
                    String selected = countryList.getSelectedValue();
                    if (selected != null) {
                        System.out.println("Selected Country: " + selected);
                    }
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI application
        SwingUtilities.invokeLater(() -> new CountryListDemo());
    }
}
