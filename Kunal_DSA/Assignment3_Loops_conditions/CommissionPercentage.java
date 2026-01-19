package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Sales: ");
        int sales = sc.nextInt();

        System.out.println("Commission Amount: ");
        int earned = sc.nextInt();

        double CommissionPercentage = (earned*100.0)*sales;

        System.out.println("Commission Percentage: "+CommissionPercentage+"%");
    }
    
}
