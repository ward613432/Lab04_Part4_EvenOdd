import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Give me a number.");
        number = scanner.nextInt();
        System.out.println("That number is " + (number % 2 == 0 ? "even" : "odd") + "!");
    }
}