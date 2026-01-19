package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String ch = sc.next();

        if (ch.equals("a") || ch.equals("e") || ch.equals("i")
                || ch.equals("o") || ch.equals("u")) {
            System.out.println("Its a vowel");
        }else{
            System.out.println("Its a consonants");
        }
    }
    
}
