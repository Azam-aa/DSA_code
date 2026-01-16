package Kunal_DSA.Basic;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the INR: ");
        int inr = sc.nextInt();
        double usd = inr * 0.012;
        System.out.println("USD: "+usd);
    }
}
