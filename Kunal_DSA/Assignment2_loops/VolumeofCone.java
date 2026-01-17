package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height: ");
        float pi = 3.142f;
        int r = sc.nextInt();
        int h = sc.nextInt();
        double v = (1.0/3)*pi*r*r*h;
        System.out.println("Volume of cone: "+v);

    }
}
