package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class VolumeofPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BaseArea and Height: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        float v = (1.0f/3)*h*r;
        System.out.println("Volume of Pyramid: "+v);
    }
    
}
