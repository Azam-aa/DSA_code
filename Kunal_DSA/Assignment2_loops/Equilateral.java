package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area: ");
        int a = sc.nextInt();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area of Rhombus: "+area);
    }

    
}
