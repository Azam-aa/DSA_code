package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the baseArea and height: ");
        int a = sc.nextInt();
        int h = sc.nextInt();
        int p = a * h;
        System.out.println("Volume of Prism: "+p);
    }
    
}
