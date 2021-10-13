package chapter5;

import java.util.Scanner;

public class Greeting {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the text");
        String name = scanner.next();
        greetName(name);
        System.out.println("Greeting " + name);
    }

    public static String greetName(String name){
        return name;
    }
}

