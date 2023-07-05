package day3;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
import java.util.ArrayList;

public class zadachi_den3 {
    public static void intArr(int[] arr){
        System.out.println("Possitive:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Negative:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Odd:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Even:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Cunt 5:");
        int count5 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 5) {
                count5++;
            }
        }
        System.out.println(count5);
    }

    public static String removeSymbols(String str1, String str2) {
        /*for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == str2.charAt(i)) {
                    str1 = str1.replace(str1.charAt(j), ' ');
                }
            }
        }*/
        return str1 = str1.replace(str2, "");
    }

    public static void wordReverse(String str1) {
        String[] strArr = str1.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--){
            System.out.print(strArr[i] + " ");
        }
    }

    public static void initials(String str1) {
        String[] strArr = str1.split(" ");
        for (int i = 0; i < strArr.length; i++){
            System.out.print(strArr[i].charAt(0));
        }
    }

    public static ArrayList<String> change(ArrayList<String> list) {
        String temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
        return list;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ex1
        int[] numbers = {10, 2, -1, 1, 5, 9, 7, 6, 5, -5};
        intArr(numbers);
        // ex2
        System.out.println();
        String str1 = "Plovdiv";
        String str2 = "div";
        System.out.println(removeSymbols(str1, str2));
        // ex3
        System.out.println();
        String word = "I Love Java";
        wordReverse(word);
        // ex4
        System.out.println();
        initials(word);
        // ex5
        System.out.println("\nEnter 5 words: ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(scanner.nextLine());
        }
        System.out.println(change(list));
    }

}
