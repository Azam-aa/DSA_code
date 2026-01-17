package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // pi r r
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float pi = 3.142F;
        int r = sc.nextInt();
        float area = pi*r*r;
        System.out.println("Area of circle is: "+area);
    }
}
