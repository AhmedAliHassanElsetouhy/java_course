package chapter4;

import javax.swing.*;
import java.util.Scanner;

public class NestedLoop {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 24;
        int numberOfTests = 4;
        for (int i=0; i< numberOfStudents;i++){
            double total = 0;
          for (int j=0;j<numberOfTests;j++){
              System.out.println("Enter the score for test " + (j+1));
              double score = scanner.nextDouble();
              total = total + score;
          }
          double avg = total/numberOfTests;
          System.out.println("The test average for student " + (i+1) +"is" + avg);
        }
    }
}
