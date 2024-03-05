package javabasic;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        int div=2;
       while (div<num){
           if (num%div==0){
               System.out.println("number is not prime");
               break;
           }else {
               div=div+1;
               System.out.println("number is the prime " );
               break;
           }
        }




    }
}
