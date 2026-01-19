package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enert the number: ");
        int n = sc.nextInt();
        int original = n;
        double sum = 0;

        while(n > 0)
        {
            int digit = n%10;
            sum = sum + Math.pow(digit, 3);
            n = n/10;
        }


        if (sum == original) {
            System.out.println("Its Armstrong Number");
        }else{
            System.out.println("Its not a Armstrong Numbers");
        }
    }
}
 
// 153 
// % 
// /
// 1^ + 5^ + 3^ = 153
// compare