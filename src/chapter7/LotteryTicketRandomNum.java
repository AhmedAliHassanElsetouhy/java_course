package chapter7;

import java.util.Random;

public class LotteryTicketRandomNum {

    private static final int length=6;
    private static final int max_ticket_num=69;

    public static void main(String arg[]){
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[length];
        Random random = new Random();
        for (int i=0; i<length;i++){
            ticket[i]=random.nextInt(max_ticket_num)+1;
        }
        return ticket;
    }

    public static void printTicket(int ticket[]){
//        for (int i=0; i<length; i++){
//            System.out.println(ticket[i] + " | ");
//        }
//        int i=0;
//        while (i<length){
//            System.out.println(ticket[i] + " | ");
//            i++;
//        }

        int i=0;
        do {
            System.out.println(ticket[i] + " | ");
            i++;
        }while (i<length);
    }
}
