package javabasic;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Num you want to see the table");
        int n =scanner.nextInt();
       if (n>=2){
           System.out.println((n*1));
           System.out.println((n*2));
           System.out.println((n*3));
           System.out.println((n*4));
           System.out.println((n*5));
           System.out.println((n*6));
           System.out.println((n*7));
           System.out.println((n*8));
           System.out.println((n*9));
           System.out.println((n*10));


        }else {
           System.out.println("Not found");
       }


    }
}
