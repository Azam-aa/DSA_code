package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class CalculateBattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        System.out.println("Total runs Scored: ");
        int runs = sc.nextInt();
        System.out.println("No. of times out: ");
        int out = sc.nextInt();

        int avg = runs/out;
        System.out.println("Batting Average: "+avg);
    }
}
