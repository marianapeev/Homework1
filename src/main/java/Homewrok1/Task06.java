package Homewrok1;

import java.util.Scanner;

public class Task06 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter a number 1 to 7 for the day of the week:");
        int dayNumber = scanner.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println ("The day is Mondey");
                break;

            case 2:
                System.out.println ("The day is Tuesday");
                break;

            case 3:
                System.out.println ("The day is Wednesday");
                break;

            case 4:
                System.out.println ("The day is Thursday");
                break;

            case 5:
                System.out.println ("The day is Friday");
                break;

            case 6:
                System.out.println ("The day is Saturday");
                break;

            case 7:
                System.out.println ("The day is Sunday");
                break;

            default:
                System.out.println ("Please enter a valid number (1 to 7):");
        }
    }
}
