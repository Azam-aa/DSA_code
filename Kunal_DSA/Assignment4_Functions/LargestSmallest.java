package Kunal_DSA.Assignment4_Functions;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        System.out.print("Enter the third number: ");
        int third = sc.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.println("Largest number is: "+largest);
        System.out.println("Smallest number is: "+smallest);
    }

    public static int largest(int first, int second, int third){
        int max = first;

        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        return max;
    }


    public static int smallest(int first, int second, int third){
        int min = first;

        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }
}
