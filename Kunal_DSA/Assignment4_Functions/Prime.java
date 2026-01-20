package Kunal_DSA.Assignment4_Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        prime(n);
    }

    public static void prime(int n){
         if (n <= 1) {
            System.out.println("Not a Prime");
            return;
        }

         for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    
}
