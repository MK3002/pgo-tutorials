import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            System.out.println("Podaj liczbę");
            Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("liczba jest ujemna");
        }
        else if (number > 0) {
            System.out.println("liczba jest dodatnia"); }
        else if (number == 0) {
            System.out.println("liczba to 0");
        }
    }
} 
