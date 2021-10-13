package chapter2;

import java.util.Scanner;

public class SeasionOfTheYear {
    public static void main(String arg[]){
        //1. Ask for the season of the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the season: ");
        String season = scanner.next();

        //2. Ask for adjective
        System.out.println("Enter the adjective: ");
        String adjective = scanner.next();

        //3. Ask for adjective
        System.out.println("Enter the Whole Number: ");
        int wholeNumber = scanner.nextInt();

        //3. Result
        System.out.println("on a "+season+ " " +adjective+" day, i drink a minimum of "+wholeNumber+" cups of coffee.");
    }
}
