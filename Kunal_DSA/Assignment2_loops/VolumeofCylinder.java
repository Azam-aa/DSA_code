package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.142f;
        System.out.println("Enter the radius and height: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double v = pi*r*r*h;
        System.out.println("Volume of Cylinder"+v);
    }
}
