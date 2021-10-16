package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    public static void main(String arg[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle room1 = calculator.getRoom();
        double area = calculator.calculateTotalArea(kitchen,room1);
        System.out.println("Total area is: "+area);
//        System.out.println("Kitchen area is: "+kitchen);
//        System.out.println("Room1 area is: "+room1);
    }

    public Rectangle getRoom(){
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        return new Rectangle(height,width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}