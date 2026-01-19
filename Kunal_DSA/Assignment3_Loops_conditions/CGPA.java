package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of semesters: ");
        int n = sc.nextInt();
        System.out.println("Enter the SGPA points of each semester with space: ");
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + sc.nextInt();
        }
        int cgpa = sum/n;
        System.out.println("CGPA: "+cgpa);
    }
}
