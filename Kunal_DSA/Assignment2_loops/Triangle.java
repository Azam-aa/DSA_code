package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // 0.5 * l * b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the breadth");
        int b = sc.nextInt();
        float area = 0.5F*l*b;
        System.out.println("Area of triangle is: "+area);

    }
    
}
