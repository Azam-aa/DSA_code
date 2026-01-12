package Kunal_DSA;
import java.util.*;

public class Leap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.print("Leap year");
        }else{
            System.out.print("Not a Leap year");
        }

        sc.close();
    }
}