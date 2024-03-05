package javabasic;

import java.util.Scanner;

public class OddEvenDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        if (a%2==0){
            System.out.println("Number is the odd "+a);
        }else {
            System.out.println("Number is the even = "+a );
        }
    }
}
