package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent: ");
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        double power = Math.pow(base, exponent);
        System.out.println("Power: "+power);
    }
    
}
