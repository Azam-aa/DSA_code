package Kunal_DSA.Assignment4_Functions;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        Evenodd(n);
    }

    public static void Evenodd(int n){
        if (n % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
