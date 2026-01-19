package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.next();
        String rev="";

        for(int i=word.length()-1; i>=0; i--){
            rev = rev + word.charAt(i);
        }

        System.out.println(rev);
    }
}
