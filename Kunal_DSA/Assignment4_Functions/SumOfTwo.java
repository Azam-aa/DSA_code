package Kunal_DSA.Assignment4_Functions;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        int sum = SumTwo(first, second);
        System.out.println("Sum is: "+sum);
    }

    public static int SumTwo(int first, int second){
        int sum = first + second;
        return sum;
    }
}
