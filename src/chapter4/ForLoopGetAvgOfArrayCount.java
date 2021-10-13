package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopGetAvgOfArrayCount {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        int arr[] = {1,2,3,4,5};
        int total=0;
        int avg =0;
        for (int i=0; i< arr.length;i++){
             total+=arr[i];
             avg = total/arr.length;
        }
        System.out.println("Average of total is: "+avg);
    }
}
