package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float pi = 3.142F;
        int radius = sc.nextInt();
        double perimeter = 2*pi*radius;
        System.out.println("Perimeter Of Circle: "+perimeter);
    }
}
