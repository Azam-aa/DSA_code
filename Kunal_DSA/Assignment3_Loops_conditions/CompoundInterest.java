package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int p = sc.nextInt();
        System.out.println("Rate of interest");
        int r = sc.nextInt();
        System.out.println("Enter time: ");
        int t = sc.nextInt();

        double amount = p * Math.pow((1+ r/100.0), t);
        double CI = amount-p;

        System.out.println("Compound Interest: "+CI);
        sc.close();

    }
}
