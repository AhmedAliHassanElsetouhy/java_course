package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
        //Initialize known values
        int salary =1000;
        int bones = 250;

        //Get values from the unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales>10){
            salary += bones;
            System.out.println("This employee Pay's "+salary);
        }
        else {
            System.out.println("This employee Pay's " + salary);
        }
    }
}
