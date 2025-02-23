package Homewrok1;

import java.util.Scanner;

public class Task04 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print ("Enter working hours:");
        int workingHours = scanner.nextInt();
        System.out.print ("Enter your money:");
        double money = scanner.nextDouble();
        System.out.print ("Is day off? Enter true or false: ");
        boolean dayOff = scanner.nextBoolean();

        if (!dayOff) {
            System.out.println ("I will work");

        } else {
            if (money >=10){
                System.out.println ("I will go to the cinema");
            } else if (money <10 && money>0) {
                System.out.println("I will go for ice cream");
            } else {
                System.out.println ("I will stay at home and watch TV");

            }


    }
}
}

