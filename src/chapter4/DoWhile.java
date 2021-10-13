package chapter4;

import java.util.Scanner;
public class DoWhile {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        do {
            System.out.println("Please enter first num: ");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter second num: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: "+sum);

            System.out.println("Are you want to repeat again? true || false");
            again = scanner.nextBoolean();
            if (again==true){
                System.out.println("Please enter values from true and false only");
                again = scanner.nextBoolean();
            }
            else {
                System.out.println("Thank You");
            }
        }while (again);
        scanner.close();
    }
}