package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1: ");
        int x1 = sc.nextInt();
        System.out.print("x2: ");
        int x2 = sc.nextInt();

        int dx = x2-x1;
        

        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();

        int dy = y2-y1;

        int f = (dx*dx) + (dy*dy);
        double distance = Math.sqrt(f);

        System.out.print("Distance between two points: "+distance);
    }
}
