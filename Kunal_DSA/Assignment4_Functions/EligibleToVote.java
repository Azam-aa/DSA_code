package Kunal_DSA.Assignment4_Functions;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your age");
        int n = sc.nextInt();

        Vote(n);
    }

    public static void Vote(int n){
        if (n >= 18) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
