package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x=a, y=b;

        while (y!=0) {
            int temp = y;
            y = x%y;
            x = temp;
        }

        int hcf = x;
        int lcm = (a*b)/hcf;

        System.out.println("Lcm: "+lcm);
        sc.close();
    }
}
