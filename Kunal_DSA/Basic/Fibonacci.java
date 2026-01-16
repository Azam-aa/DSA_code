package Kunal_DSA.Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        System.out.println("Enter number ");
        int n = sc.nextInt();
        
        for(int i=0; i<=n; i++){
            int next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;

        }
    }
    
}
