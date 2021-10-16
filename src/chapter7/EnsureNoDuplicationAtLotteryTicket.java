package chapter7;

import java.util.Arrays;
import java.util.Random;

public class EnsureNoDuplicationAtLotteryTicket {

    public static final int LENGTH=6;
    public static final int MAX_VALUE=6;

    public static void main(String arg[]){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i=0; i<LENGTH; i++){
           int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_VALUE)+1;
            }while (search(ticket,randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    //Sequential Search
    public static boolean search(int[] array, int numberToSearchFor){
        for (int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    //Binary Search
    public static boolean binarySearch(int[] array, int numberToSearchFor){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array,numberToSearchFor);
        if (index>=0){
            return true;
        }
        else return false;
    }
    public static void printTicket(int ticket[]) {
        for (int i=0; i<LENGTH; i++){
            System.out.println(ticket[i] + " | ");
        }
    }
}
