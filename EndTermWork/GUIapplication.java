package EndTermWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIapplication extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public GUIapplication() {
        setTitle("Simple GUI App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Submit");
        button.addActionListener(this);

        add(label);
        add(textField);
        add(button);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIapplication app = new GUIapplication();
                app.setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String name = textField.getText();
            JOptionPane.showMessageDialog(this, "Hello, " + name + "!");
            textField.setText("");
        }
    }
}

