package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class TotalSurfaceAreaofCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Area: ");
        int a = sc.nextInt();
        int tsa = 6*(a*a);
        System.out.println("Total Surface Area of Cube: "+tsa);
    }
}
