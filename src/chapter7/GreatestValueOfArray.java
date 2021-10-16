package chapter7;

import java.util.Scanner;

public class GreatestValueOfArray {

    private static  int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
        System.out.println("Please enter num of grades: ");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println("Greatest grade is: "+getGreatest());
    }

    public static void getGrades(){

        for (int i=0; i<grades.length; i++){
            System.out.println("Enter Grade Value #"+i);
            grades[i] = scanner.nextInt();
        }
    }

    public static int getGreatest(){
        int highest = grades[0];
        for (int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }
}
