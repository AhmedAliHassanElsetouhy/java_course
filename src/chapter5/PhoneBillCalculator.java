package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double payForMinute = .25;
    static double tax = .15;

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter num of minutes: ");
        double numOfMinutes = scanner.nextDouble();
        calculatePayment(numOfMinutes);

        System.out.println("Please Enter paid: ");
        double paidMoney = scanner.nextDouble();
        feesPaid(paidMoney);

//        System.out.println("The total fee is: "+ calculateTotal(calculatePayment(numOfMinutes),calculateTax(received),feesPaid(paidMoney)));
    }

    public static double calculatePayment(double numOfMinutes){
        double received =  numOfMinutes * payForMinute;
        return received;
    }

    public static double calculateTax(double received){
        double totalTax =  received * tax;
        return totalTax;
    }

    public static double feesPaid(double paidMoney){
        return paidMoney;
    }

    public static double calculateTotal(double received, double totalTax, double paidMoney){
        return received-paidMoney-totalTax;
    }
}