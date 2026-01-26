import javax.swing.*;

public class TicketUsed {

    public static String show_movie_list(Ticket... tickets) {
        StringBuilder sb = new StringBuilder();
        for (Ticket t : tickets) {
            sb.append(t.getTicket_id())
                    .append(": ")
                    .append(t.getMovie())
                    .append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket("T001", new Movie("Titanic",120,"PG-13"),"12:00","B7",280),
                new Ticket("T002", new Movie("Pokemon",102,"PG"),"11:00","G11",240),
                new Ticket("T003", new Movie("Silent Hill",125,"R-13"),"14:30","H2",240)
        };

        int start = JOptionPane.showConfirmDialog(
                null,
                "\nDo you want to book or use a ticket?"
        );

        if (start != JOptionPane.YES_OPTION) return;

        while (true) {
            String input = JOptionPane.showInputDialog(
                    show_movie_list(tickets) +
                            "\nEnter a ticket id for booking:"
            );

            Ticket selected = null;
            for (Ticket t : tickets) {
                if (t.getTicket_id().equalsIgnoreCase(input)) {
                    selected = t;
                    break;
                }
            }

            if (selected == null) continue;

            String menu = JOptionPane.showInputDialog(
                    selected.getMovie() +
                            "\nPress 1 to book a ticket" +
                            "\nPress 2 to use a ticket" +
                            "\nPress 3 to see ticket status\n" +
                            "\nEnter a menu:"
            );

            String result = "";
            switch (menu) {
                case "1": result = selected.bookTicket(); break;
                case "2": result = selected.useTicket(); break;
                case "3": result = ""; break;
            }

            JOptionPane.showMessageDialog(null,
                    (result.isEmpty() ? "" : result + "\n\n") + selected
            );

            int again = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use other tickets?"
            );
            if (again != JOptionPane.YES_OPTION) break;
        }
    }
}

