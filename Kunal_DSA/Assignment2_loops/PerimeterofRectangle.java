package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width: ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int p = 2*(l+w);
        System.out.println("Perimeter of Rectangle: "+p);
    }
}
