package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;

        System.out.println("Enter a numbers (0 to stop): ");
        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            } else if (n < 0) {
                negSum = negSum + n;
            } else if (n > 0 && n % 2 == 0) {
                posEvenSum = posEvenSum + n;
            } else if (n > 0 && n % 2 != 0) {
                posOddSum = posOddSum + n;
            }
        }
        System.out.println("Sum of negative numbers: " + negSum);
        System.out.println("Sum of positive even numbers: " + posEvenSum);
        System.out.println("Sum of positive odd numbers: " + posOddSum);

        sc.close();

    }
}
