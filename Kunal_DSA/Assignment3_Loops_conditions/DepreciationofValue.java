package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        System.out.print("Cost Price: ");
        int cp = sc.nextInt();
        System.out.print("Salavege Value: ");
        int sv = sc.nextInt();
        System.out.print("Useful Life: ");
        int duration = sc.nextInt();

        int depreciation = (cp-sv)/duration;
        System.out.println("Depreciation per year: "+depreciation);

    }
}
