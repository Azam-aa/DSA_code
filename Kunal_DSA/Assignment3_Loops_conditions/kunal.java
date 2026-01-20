package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class kunal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of days in augest: ");
        int days = sc.nextInt();
        int count = 0;

        for(int i=1; i<=days; i++){
        if(i%2==0){
            count++;
          }
        }

        System.out.println("Number of days kuanl can go out: "+count);
        sc.close();
    }
}

//  even n%2 == 0;
// 
