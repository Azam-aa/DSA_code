package Kunal_DSA.Basic;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = sc.nextLine();
        System.out.print("Welcome "+name);
    }
}
