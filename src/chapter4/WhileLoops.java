package chapter4;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String arg[]){
        int rate = 15;
        int maxHours =40;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the hours worked: ");
        Double hoursWorked = scanner.nextDouble();
        while (hoursWorked > maxHours) {
            System.out.println("Invalid value, Please enter valid Hours Worked: ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double gross = rate * hoursWorked;
        System.out.println("Gross is: "+gross);
    }
}
