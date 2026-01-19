package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        long factorial = 1;

        if(n<0){
            System.out.println("Negatives numbers are invalid");
        }else{

        for(int i=1; i<=n; i++){
            factorial*=i;
          }
          System.out.println("Factorial of "+n+" is: "+factorial);
        }
    }
}
