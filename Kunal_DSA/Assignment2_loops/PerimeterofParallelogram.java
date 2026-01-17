package Kunal_DSA.Assignment2_loops;

import java.util.Scanner;

public class PerimeterofParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = 2*(a+b);
        System.out.println("Perimeter of Paralllelogram: "+p);
    }
}
