package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class CurvedSurfaceAreaofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.142f;
        System.out.println("Enter the radius and height: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double csa =  2*pi*r*h;
        System.out.println("Curved Surface Area of Cylinder: "+csa);

    }
}
