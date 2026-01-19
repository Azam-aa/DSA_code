package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class VolumeofSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        float pi = 3.142f;
        double v = (4.0/3)*pi*r*r*r;
        System.out.println("Volume of Sphere: "+v);
        
    }
    
}
