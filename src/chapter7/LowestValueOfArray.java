package chapter7;

import java.util.Scanner;

public class LowestValueOfArray {
    private static int[] grades ;
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
       System.out.println("Enter num of grades: ");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println("Lowest value in Arr is: "+getLowest());
    }

    public static void getGrades(){
        for (int i=0; i<grades.length; i++){
            System.out.println("Enter value #"+i);
            grades[i] = scanner.nextInt();
        }
    }

    public static int getLowest(){
        int lowest = grades[0];
        for (int grade : grades){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
