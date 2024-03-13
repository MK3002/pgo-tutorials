import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Is the person a resident of Warsaw? (yes/no): ");
        String isResident = scanner.next();
        System.out.println("City:");
        String City = scanner.next();
        System.out.print("Is today Thursday? (yes/no): ");
        String isThursday = scanner.next();
        System.out.println("What day of the week is it?");
        String DOTW = scanner.next();
        double ticketPrice = 40.0; // Base ticket price
        if (age < 10) {
            ticketPrice = 0;
        } else if (age >= 10 && age <= 18) {
            ticketPrice *= 0.5;
        }
        if (isResident.equalsIgnoreCase("yes")) {
            ticketPrice *= 0.9;
        }
        if (isThursday.equalsIgnoreCase("yes")) {
            ticketPrice = 0;
        }
        System.out.println("Data: " + City + "," + " Weekday price is: " + ticketPrice);
        scanner.close();
    }
}
