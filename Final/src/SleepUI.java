import javax.swing.*;
import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class SleepUI extends JFrame {

    private JTextField nameField;
    private JTextField sleepField;
    private JTextField awakeField;

    public SleepUI() {

        setTitle("Sleep Input");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JLabel sleepLabel = new JLabel("Sleep Time (HH:mm):");
        JLabel awakeLabel = new JLabel("Awake Time (HH:mm):");

        nameField = new JTextField();
        sleepField = new JTextField();
        awakeField = new JTextField();

        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");

        okBtn.addActionListener(e -> calculate());

        cancelBtn.addActionListener(e -> {
            nameField.setText("");
            sleepField.setText("");
            awakeField.setText("");
        });

        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(sleepLabel);
        panel.add(sleepField);
        panel.add(awakeLabel);
        panel.add(awakeField);
        panel.add(okBtn);
        panel.add(cancelBtn);

        add(panel);
        setVisible(true);
    }

    private void calculate() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

            LocalTime sleep = LocalTime.parse(sleepField.getText(), formatter);
            LocalTime awake = LocalTime.parse(awakeField.getText(), formatter);

            Duration duration;

            if (awake.isBefore(sleep)) {
                duration = Duration.between(sleep, awake.plusHours(24));
            } else {
                duration = Duration.between(sleep, awake);
            }

            long hours = duration.toHours();
            long minutes = duration.toMinutes() % 60;

            new ResultUI(
                    hours,
                    minutes,
                    sleepField.getText(),
                    awakeField.getText(),
                    nameField.getText()
            );

            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter time in HH:mm เช่น 23:30");
        }
    }
}
