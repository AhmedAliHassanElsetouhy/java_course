package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {

    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {

        System.out.println("Enter the number of grades you want to enter: ");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println("Sum is: " + calculateSum());
        System.out.println("Average is: " + calculateAverage());
        System.out.println("Highest is: " + getHighest());
        System.out.println("Lowest is: "+ lowest());
        System.out.println("Sorted array is: " + binarySort()); //Sorted array

    }

    public static String binarySort(){
        Arrays.sort(grades);
        return Arrays.toString(grades);
    }

    //Fun to scan array of numbers
    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + i);
            grades[i] = scanner.nextInt();
        }
    }

    //Fun to calculate sum of array
    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static int calculateAverage() {
        return calculateSum() / grades.length;
    }

    //Fun to get highest
    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int lowest(){
        int lowest = grades[0];
        for (int grade : grades){
            if (grade<lowest){
                lowest=grade;
            }
            return lowest;
        }
        return lowest;
    }

//    public static int sort(){
//        int i;
//        for ( i=0; i<grades.length; i++){
//            int temp;
//            for (int j=0; j<i; j++){
//                if (grades[j]>grades[j-1]){
//                    temp = grades[j];
//                    grades[j-1]=grades[j];
//                    grades[j-1]=temp;
//                }
//            }
//        }
//        return grades[i];
//    }
}
