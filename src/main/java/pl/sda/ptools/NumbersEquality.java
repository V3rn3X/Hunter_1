package pl.sda.ptools;

import java.util.Scanner;

public class NumbersEquality {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number a: ");
        int number = scanner.nextInt();
        System.out.print("Insert number b: ");
        int number1 = scanner.nextInt();


        if (number > number1) {
            printMessage("a is greater than b");
        } else if (number < number1) {
            printMessage("a is smaller than b");
        } else {
            System.out.println(number + " is equals " + number1);
        }
    }
        private static void printMessage(String message)
        {
            System.out.println(message);
        }


}