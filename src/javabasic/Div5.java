package javabasic;

import java.util.Scanner;

public class Div5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (a%5==0){
            System.out.println("Number is divsable 5 = "+a);
        }else {
            System.out.println("Number is not divsable 5 = "+a);
        }
    }
}
