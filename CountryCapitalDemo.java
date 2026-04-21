package java;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo extends JFrame {
    private JList<String> countryList;
    private Map<String, String> capitals;

    public CountryCapitalDemo() {
        // 1. Initialize Country-Capital Data
        capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Pretoria/Cairo/etc. (Continent)"); // Africa is a continent
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // 2. Setup Frame
        setTitle("Country Capital Finder");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 3. Create JList
        String[] countryNames = capitals.keySet().toArray(new String[0]);
        countryList = new JList<>(countryNames);
        add(new JScrollPane(countryList), BorderLayout.CENTER);

        // 4. Add Selection Listener
        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedCountry = countryList.getSelectedValue();
                if (selectedCountry != null) {
                    String capital = capitals.get(selectedCountry);
                    System.out.println("Country: " + selectedCountry + " | Capital: " + capital);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CountryCapitalDemo::new);
    }
}
