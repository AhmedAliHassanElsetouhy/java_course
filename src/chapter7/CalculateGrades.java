package chapter7;

import java.util.Scanner;

public class CalculateGrades {

    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
        System.out.println("Please enter the number of grades you want to enter: ");
        grades = new int[scanner.nextInt()];
        getGrades();
    }

    public static void getGrades(){
        for (int i=0; i<grades.length;i++){
            System.out.println("Please enter grade #" +i);
            grades[i] = scanner.nextInt();
            System.out.println("Sum is: "+ calculateSum());
            System.out.println("Average is: "+ average());
        }
    }

    public static int calculateSum(){
        int sum =0;
        for (int grade : grades){
            sum+=grade;
        }
        return sum;
    }

    public static int average(){
        return calculateSum()/grades.length;
    }
}
