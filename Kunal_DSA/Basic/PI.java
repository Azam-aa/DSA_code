package Kunal_DSA.Basic;

import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Interest: ");
        int i = sc.nextInt();
        System.out.println("Enter Rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter Time");
        int t = sc.nextInt();
        double p = (i*100)/(r*t);
        System.out.println("Principal amount is :"+p);
    }
    
}
