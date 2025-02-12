package Homewrok1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Въведете първото число: ");
    int num1 = scanner.nextInt();
    System.out.print("Въведете второто число: ");
    int num2 = scanner.nextInt();
    System.out.print("Въведете третото число: ");
    int num3 = scanner.nextInt();

        if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
            System.out.println("Третото число е между първото и второто.");
        } else {
            System.out.println("Третото число не е между първото и второто.");
        }

    }
}
