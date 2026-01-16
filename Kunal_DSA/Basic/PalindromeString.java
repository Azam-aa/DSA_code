package Kunal_DSA.Basic;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        // MADAM = MADAM 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter word: ");
        String str = sc.nextLine();

        sc.close();

        StringBuilder word = new StringBuilder(str);
        word.reverse();

        String reverse = word.toString();

        if( str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
