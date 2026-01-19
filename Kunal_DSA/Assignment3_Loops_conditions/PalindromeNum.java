package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class PalindromeNum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int original = n;
    int rev = 0;

    while (n>0) {
        int digit = n%10;
        rev = rev *10 + digit;
        n = n/10;
    }
    
    if (rev==original) {
        System.out.println("Its a palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
   } 
}
