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

    public static String calculate  (String[] equationArr) {
        String[] result = new String[1];
        if (equationArr.length > 0) {
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
                if (equationArr.length > 3) {
                    String[] equationArrTemp = new String[equationArr.length - 2];
                    equationArrTemp[0] = String.valueOf(addition(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    for (int i = 1; i < equationArr.length - 2; i++) {
                        equationArrTemp[i] = equationArr[i + 2];
                    }
                    result[0] = calculate(equationArrTemp);
                }
                else {
                    result[0] = String.valueOf(addition(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    return result[0];
                }

            } else if (equationArr2.get(1).equals("minus") || equationArr2.get(1).equals("-")) {
                if (equationArr.length > 3) {
                    String[] equationArrTemp = new String[equationArr.length - 2];
                    equationArrTemp[0] = String.valueOf(subtraction(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    for (int i = 1; i < equationArr.length - 2; i++) {
                        equationArrTemp[i] = equationArr[i + 2];
                    }
                    result[0] = calculate(equationArrTemp);
                }
                else {
                    result[0] = String.valueOf(subtraction(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    return result[0];
                }

            } else if (equationArr2.get(1).equals("multiply") || equationArr2.get(1).equals("*")) {
                if (equationArr.length > 3) {
                    String[] equationArrTemp = new String[equationArr.length - 2];
                    equationArrTemp[0] = String.valueOf(multiplication(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    for (int i = 1; i < equationArr.length - 2; i++) {
                        equationArrTemp[i] = equationArr[i + 2];
                    }
                    result[0] = calculate(equationArrTemp);
                } else {
                    result[0] = String.valueOf(multiplication(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    return result[0];
                }

            } else if (equationArr2.get(1).equals("divide") || equationArr2.get(1).equals("/")) {
                if (equationArr.length > 3) {
                    String[] equationArrTemp = new String[equationArr.length - 2];
                    equationArrTemp[0] = String.valueOf(division(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    for (int i = 1; i < equationArr.length - 2; i++) {
                        equationArrTemp[i] = equationArr[i + 2];
                    }
                    result[0] = calculate(equationArrTemp);
                } else {
                    result[0] = String.valueOf(division(Double.valueOf(equationArr2.get(0)), Double.valueOf(equationArr2.get(2))));
                    return result[0];
                }

            } else {
                throw new IllegalArgumentException();
            }
        }
        return result[0];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression: ");
        String equation = scanner.nextLine();
        String[] equationArr = equation.split(" ");
        System.out.println(calculate(equationArr));
    }
}
