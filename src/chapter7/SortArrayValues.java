package chapter7;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class SortArrayValues {

    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String arg[]){

        System.out.println("Enter number of values to enter: ");
        grades = new int[scanner.nextInt()];
        getVlaues();
        System.out.println("Values are: "+sortArrayInBinaryWay());
    }

    public static void getVlaues(){
        for (int i=0; i<grades.length; i++){
            System.out.println("Enter value #"+i);
            grades[i] = scanner.nextInt();
        }
    }

    public static String sortArrayInBinaryWay(){
        Arrays.sort(grades);
        return Arrays.toString(grades);
    }
}
