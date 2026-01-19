package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price: ");
        int p = sc.nextInt();

        System.out.println("Enter discount percentage: ");
        int d = sc.nextInt();

        int discount = (d*p)/100;
        int total = p-discount;

        System.out.println("Final price is: "+total);

    }
    
}
