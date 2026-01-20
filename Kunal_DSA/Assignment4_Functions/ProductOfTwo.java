package Kunal_DSA.Assignment4_Functions;

import java.util.Scanner;

public class ProductOfTwo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        int prod = ProdTwo(first, second);
        System.out.println("Product is: "+prod);
    }

    public static int ProdTwo(int first, int second){
        int sum = first * second;
        return sum;
    }
}


