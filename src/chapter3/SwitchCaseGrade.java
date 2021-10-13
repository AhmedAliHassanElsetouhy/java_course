package chapter3;

import java.util.Scanner;

public class SwitchCaseGrade {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        String msg;
        System.out.println("Please enter grade");
        String grade = scanner.next();
        switch (grade){
            case"A":
                msg = "Excellent";
                break;
            case"B":
                msg = "Very Good";
                break;
            default:
                msg = "Grade not existed";
                break;
        }
        System.out.println(msg);
    }
}