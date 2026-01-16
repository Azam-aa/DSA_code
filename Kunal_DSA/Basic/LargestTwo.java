package Kunal_DSA.Basic;

import java.util.Scanner;

public class LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("Largest is: "+a);
        }else{
             System.out.println("Largest is: "+b);
        }
    }
    
}
