package WeekTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression: ");
        String equation = scanner.nextLine();
        String[] equationArr = equation.split(" ");
        List<String> equationArr2 = new ArrayList<>();
        for (int i = 0; i < equationArr.length; i++) {
            equationArr[i].trim().toLowerCase();
        }

        for (int i = 0; i < equationArr.length; i++) {
            if (!equationArr[i].equals("")) {
                equationArr2.add(equationArr[i]);
            }
        }

        if (equationArr2.get(1).equals("plus") || equationArr2.get(1).equals("+")) {
            System.out.println(addition(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
        } else if (equationArr2.get(1).equals("minus") || equationArr2.get(1).equals("-")) {
            System.out.println(subtraction(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
        } else if (equationArr2.get(1).equals("multiply") || equationArr2.get(1).equals("*")) {
            System.out.println(multiplication(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
        } else if (equationArr2.get(1).equals("divide") || equationArr2.get(1).equals("/")) {
            System.out.println(division(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
        } else {
            throw new IllegalArgumentException();
        }
    }
}
