import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class tls extends JFrame {

    private JLabel messageLabel;

    public tls() {
   setTitle("Traffic Light Simulator..");
     setSize(680,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(messageLabel);

        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton yellowButton = new JRadioButton("Yellow");
        JRadioButton greenButton = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        add(redButton);
        add(yellowButton);
        add(greenButton);

        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateMessage("STOP", Color.RED);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateMessage("READY", Color.YELLOW);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateMessage("GO", Color.GREEN);
            }
        });

        setVisible(true);
    }

    private void updateMessage(String message, Color color) {
        messageLabel.setText(message);
        messageLabel.setForeground(color);
    }

    public static void main(String[] args) {
        new tls();
    }
}