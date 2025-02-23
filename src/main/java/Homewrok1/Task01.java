package Homewrok1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    System.out.print("Enter the third number: ");
    int num3 = scanner.nextInt();

        if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
            System.out.println("The third number is between the first and the second");
        } else {
            System.out.println("The third number is not between the first and the second");
        }

    }
}
