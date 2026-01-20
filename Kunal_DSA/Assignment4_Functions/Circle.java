package Kunal_DSA.Assignment4_Functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();

        double circum = Circum(radius);
        double area = Area(radius);

        System.out.println("Circumference  of a circle"+circum);
        System.out.println("Area of a circle"+area);
    }

    public static float Circum(int r){
        float circum = 2*3.142f*r;
        return circum;
    }

    public static float Area(int r){
        float area = 3.142f*r*r;
        return area;
    }
}
