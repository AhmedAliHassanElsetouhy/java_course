package chapter5;

import java.util.Scanner;

public class CreditCheck {
    static int realMadeCount = 25000;
    static int realCreditScore = 700;
    public static void main(String arg[]){

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter made count: ");
            int madeCount = scanner.nextInt();
            System.out.println("Please enter score count: ");
            int creditScore = scanner.nextInt();
            checkCredit(madeCount,creditScore);
            if (checkCredit(madeCount,creditScore)){
                System.out.println("Success");
            }
            else {
                System.out.println("Fail");
            }
        }while (true);


    }

    public static boolean checkCredit(int madeCount, int creditScore) {
        if (madeCount > realMadeCount && creditScore >= realCreditScore) {
            return true;
        }
        else {
            return false;
        }
    }
}