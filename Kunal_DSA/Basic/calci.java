package Kunal_DSA.Basic;

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the opertor: ");
        char op = sc.next().charAt(0);
        System.out.println("num1: ");
        int num1 = sc.nextInt();
        System.out.println("num2");
        int num2 = sc.nextInt();
        
        if (op == '+') {
            System.out.println("Result :"+ (num1 + num2));  
        }else if (op == '-') {
            System.out.println("Result :"+(num1 - num2));  
        }else if (op == '*') {
            System.out.println("Result :"+ (num1 * num2));  
        }else if (op == '/') {
            System.out.println("Result :"+ (num1 / num2));  
        }


    }
    
}
