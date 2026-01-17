package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both diagonals: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int area = (p*q)/2;
        System.out.println("Area of Rhombus: "+area);

    }
    
}
