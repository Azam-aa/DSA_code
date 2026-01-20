package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;

        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
            if (sum == n && n !=0) {
                System.out.println("Its a perfect number");
            }else{
                System.out.println("It is not a perfect number");
            }
        
    }
}
