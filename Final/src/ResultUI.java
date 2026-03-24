import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class ResultUI extends JFrame {

    public ResultUI(long hours, long minutes, String sleepTime, String awakeTime, String name) {

        setTitle("Result");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String totalText = "Total Sleep: " + hours + "h " + minutes + "m";
        JLabel totalLabel = new JLabel(totalText, SwingConstants.CENTER);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel nameLabel = new JLabel("Name: " + name, SwingConstants.CENTER);

        String resultText;

        if (hours < 7) {
            resultText = "😴 You sleep not enough";
        } else if (hours <= 9) {
            resultText = "🙂 You sleep enough";
        } else {
            resultText = "🛌 You sleep too much";
        }

        JLabel resultLabel = new JLabel(resultText, SwingConstants.CENTER);

        JButton endBtn = new JButton("End");
        endBtn.addActionListener(e -> System.exit(0));

        setLayout(new GridLayout(4,1,10,10));
        add(nameLabel);
        add(totalLabel);
        add(resultLabel);
        add(endBtn);

        // 👉 บันทึกไฟล์
        saveToFile(name, sleepTime, awakeTime, hours, minutes, resultText);

        setVisible(true);
    }

    private void saveToFile(String name, String sleep, String awake, long h, long m, String result) {

        try {
            FileWriter writer = new FileWriter("sleep_log.txt", true);

            writer.write(
                    "Name: " + name +
                            " | Sleep: " + sleep +
                            " | Awake: " + awake +
                            " | Total: " + h + "h " + m + "m" +
                            " | Result: " + result + "\n"
            );

            writer.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving file");
        }
    }
}
