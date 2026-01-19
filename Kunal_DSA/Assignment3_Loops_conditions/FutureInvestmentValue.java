package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int p = sc.nextInt();
        System.out.print("Enter rate: ");
        int r = sc.nextInt();
        System.out.print("Enter Time");
        int t = sc.nextInt();

        double fv = p* Math.pow((1+(r/100.0)),t);
        System.out.println("Future Investment Value: "+fv);
    }   
}
