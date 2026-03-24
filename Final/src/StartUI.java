import javax.swing.*;
import java.awt.*;

public class StartUI extends JFrame {

    public StartUI() {
        setTitle("Welcome");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("Welcome", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 32));

        JButton startBtn = new JButton("< Start >");
        startBtn.setFont(new Font("Arial", Font.BOLD, 18));

        startBtn.addActionListener(e -> {
            new SleepUI();
            dispose();
        });

        setLayout(new BorderLayout());
        add(title, BorderLayout.CENTER);
        add(startBtn, BorderLayout.SOUTH);

        setVisible(true);
    }
}
