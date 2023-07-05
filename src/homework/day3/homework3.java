package homework.day3;

import java.util.Scanner;

public class homework3 {
    public static int lowest(int[] numbers) {
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (lowest > numbers[i]) {
                lowest = numbers[i];
            }
        }
        return lowest;
    }

    public static void trueOrFalse(int number) {
        if (number % 2 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] numbers = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            numbers[i] = Integer.valueOf(inputArr[i]);
        }
        System.out.println("Lowest number: " + lowest(numbers));

        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        trueOrFalse(num);
    }
}
