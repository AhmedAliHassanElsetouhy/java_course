package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //1. Get the number of hours worked
        System.out.println("Enter Num of hours");
        Scanner scanner = new Scanner(System.in);
        int numOfHours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rateOfHours = scanner.nextDouble();

        //3. Multiply hours and pay rate
        double grossPayRate = numOfHours*rateOfHours;

        //4. Display the result
        System.out.println("Gross pay rate is: "+grossPayRate);
    }
}
