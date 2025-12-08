public class Ex401 {
    public static void main(String[] args) {
        String message = "INT-108 Object-Oriented Programming 2025";

        System.out.println("Lenght message = " + message.length());

        System.out.println("Uppercase message = " + message.toUpperCase());
        System.out.println("Lowercase message = " + message.toLowerCase());

        System.out.println("First Letter = " + message.charAt(0));
        System.out.println("Last  Letter = " + message.charAt(message.length()-1));
    }
}
