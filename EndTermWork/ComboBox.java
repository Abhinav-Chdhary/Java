package EndTermWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {
    private JLabel label;
    private JComboBox<String> comboBox;

    public ComboBox() {
        setTitle("JComboBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Select an option:");
        comboBox = new JComboBox<>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        comboBox.addItem("Option 3");
        comboBox.addItem("Option 4");

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) comboBox.getSelectedItem();
                label.setText("Selected option: " + selectedOption);
            }
        });
        add(label);
        add(comboBox);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ComboBox example = new ComboBox();
                example.setVisible(true);
            }
        });
    }
}

