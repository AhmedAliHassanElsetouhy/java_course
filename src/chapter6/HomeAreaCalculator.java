package chapter6;

public class HomeAreaCalculator {
    public static void main(String arg[]){
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(30);

        Rectangle room2 = new Rectangle(20,20);
        System.out.println("Area = " + (room1.calculateArea() + room2.calculateArea()));
        System.out.println("Perimeter = " + (room1.calculatePerimeter()+room2.calculatePerimeter()));
    }
}
