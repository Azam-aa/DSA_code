package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total numbers?");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("Enter all the numbers: ");
        for(int i=1; i<=n; i++){
            sum = sum + sc.nextInt();
        }

        System.out.println("Sum of numbers are: "+sum);

    }
}
