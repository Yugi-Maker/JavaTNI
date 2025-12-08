import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {

        while (true) {
            String id = JOptionPane.showInputDialog(null,
                    "Enter student-id:");
            if (id.length() == 10) {

                String major = "";

                if (id.substring(2, 5).equals("131"))
                    major = "Information Technology (IT)";
                else if (id.substring(2, 5).equals("132"))
                    major = "Multimedia Technology (MT)";
                else if (id.substring(2, 5).equals("133"))
                    major = "Digital Business Information Technology (BI)";
                else if (id.substring(2, 5).equals("134"))
                    major = "Digital Technology in Mass Communication (DC)";
                else if (id.substring(2, 5).equals("135"))
                    major = "Data Science and Data Analytics (DS)";
                else
                    major = "Cannot found major";

                JOptionPane.showMessageDialog(null,
                        "Student ID: " + id +
                                "\nMajor: " + major);

                break;
                    }
                }
            }
        }
