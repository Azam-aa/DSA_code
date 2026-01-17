package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        float area = 0.5F*base*height;
        System.out.println("Area of Isoseles Traingle: "+area);
    }
}
