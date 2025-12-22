public class Ex601 {
    public static void main(String[] args) {
        int[] numbers = {38, 7, 91, 54, 12, 83, 26};

        System.out.println("Array Lenght = " + numbers.length);
        System.out.println("First data = " + numbers[0]);
        System.out.println("Last data = " + numbers[numbers.length-1]);

        System.out.print("All data in array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
