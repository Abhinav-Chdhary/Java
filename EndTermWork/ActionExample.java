package EndTermWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionExample extends JFrame {
    private JButton button;

    public ActionExample() {
        setTitle("ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create the button
        button = new JButton("Click Me");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform specific actions when the button is clicked
                JOptionPane.showMessageDialog(ActionExample.this, "Button Clicked!");
            }
        });

        // Add the button to the frame
        add(button);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ActionExample example = new ActionExample();
                example.setVisible(true);
            }
        });
    }
}

