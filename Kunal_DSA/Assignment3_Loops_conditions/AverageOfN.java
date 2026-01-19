package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter the numbers: ");
        for(int i=1; i<=n; i++){
            sum = sum + sc.nextInt();
        }

        double avg = (double)sum/n;
        System.out.println("Average = "+avg);
        sc.close();
    }
    
}
