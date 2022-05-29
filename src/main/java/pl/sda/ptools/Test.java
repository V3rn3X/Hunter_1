package pl.sda.ptools;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number a: ");
        int number = scanner.nextInt();
        System.out.print("Insert number b: ");
        int number1 = scanner.nextInt();


        if (number > number1) {
            System.out.println(number + " is bigger than " + number1);
        } else if (number < number1) {
            System.out.println(number + " is smaller than " + number1);
        } else {
            System.out.println(number + " is equals " + number1);
        }

    }
}
