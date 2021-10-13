package chapter4;

import java.util.Scanner;

public class ForLoopEnsureThatTextContainsSpecificLetter {
    public static void main(String arg[]) {
        System.out.println("Please enter the text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        boolean letterFound = false;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if(currentLetter=='S' || currentLetter=='s'){
                letterFound = true;
                break;
            }
        }
        if (letterFound)
        System.out.println("The text contains letter S");
    }
}