package Kunal_DSA.Basic;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table number: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num +" x "+ i +" = "+ (num*i));
        }
    }
    
}
