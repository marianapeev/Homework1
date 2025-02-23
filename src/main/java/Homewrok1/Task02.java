package Homewrok1;

import java.util.Scanner;

public class Task02 {
    // todo implement task02
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer number:");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer number:");
        int int2 = scanner.nextInt();
        System.out.print("Enter first double number:");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double number:");
        double double2 = scanner.nextDouble();

        int tempInt = int1;
        int1 = int2;
        int2 = tempInt;

        double tempDouble = double1;
        double1 = double2;
        double2 = tempDouble;

        System.out.println("After swap:");
        System.out.println("First integer is:" + " " + int1);
        System.out.println("Second integer is:" + " " + int2);
        System.out.println("First double is:" + " " + double1);
        System.out.println("Second double is:" + " " + double2);

        double sumDouble = (double) int1 + (double) int2;
        System.out.println("Sum after casting is:" + " " + sumDouble);

        int sumInt = (int) double1 + (int) double2;
        System.out.println("Sum after casting is:" + " " + sumInt);


    }
}
