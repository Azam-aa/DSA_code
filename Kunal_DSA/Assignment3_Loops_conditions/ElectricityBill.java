package Kunal_DSA.Assignment3_Loops_conditions;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        float unit = sc.nextFloat();
        double total =0;
        if(unit<=100){
            total = unit *1.5;
        }else if (unit <= 200) {
            total = (100*1.5) + (unit-100)*2.5;
        }else{
            total = (100*1.5) + (100*2.5) + (unit-200)*4.0;
        }
        System.out.println("Units = " + unit);

        System.out.println("Electricity Bill = Rs. "+total);
        sc.close();
    }
    
}
