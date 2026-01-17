package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int area = b*h;
        System.out.println("Area of parallelogram: "+area);
    }
}
