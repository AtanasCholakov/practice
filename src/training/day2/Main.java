package training.day2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Username: ");
    String username = scanner.nextLine();
    System.out.println("Password: ");
    String password = scanner.nextLine();
    if(username.length() > 0 && password.length() > 0) {
        System.out.println("Account created!");
    }
    else {
        System.exit(0);
    }

    String username2;
    String password2;
    do{
        System.out.println("\nEnter username: ");
        username2 = scanner.nextLine();
        System.out.println("Enter password: ");
        password2 = scanner.nextLine();
    } while(!username.equals(username2) || !password.equals(password2));

    System.out.println("Welcome, " + username);

    // zad 3
    System.out.println("\nEx3\n");
    System.out.println("Enter word: ");
    String word = scanner.nextLine();
    char[] wordChar = word.toCharArray();
    for (int i = 0; i < word.length(); i++){
        System.out.println(wordChar[i]);
    }

    // zad 4
    System.out.println("\nEx4\n");
    System.out.println("Enter weight: ");
    int weight = scanner.nextInt();

    if (weight > 50 && weight <= 70) {
        System.out.println("skinny");
    }
    else if (weight > 70 && weight <= 90) {
        System.out.println("skinny fat");
    }
    else if (weight > 90 && weight <= 110) {
        System.out.println("obese");
    }
    else if (weight > 110) {
        System.out.println("extra obese");
    }
    else{
        System.out.println("Invalid weight!");
    }

    // zad 5
    System.out.println("\nEx5\n");
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    for (int i = 0; i < days.length; i++) {
        System.out.println(days[i]);
    }

    }
}