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

    public static class PrintingNum {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();

            switch (n){
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                case 10:
                    System.out.println("TEN");
                    break;

                default:
                    System.out.println("Not found");
            }
        }
    }

    public static class N1N2 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the num for add 1");
            System.out.println("Enter the num for sub 2");
            System.out.println("Enter the num for div 3");
            System.out.println("Enter the num for mul 4");
            System.out.println("Enter the num in below");
            int en=scanner.nextInt();
            System.out.println("Eneter the first num");
            int n1=scanner.nextInt();
            System.out.println("Enter the secand num");
            int n2=scanner.nextInt();
            if (en==1){
                System.out.println("Added "+(n1+n2));
            }else if(en==2)
            {
                System.out.println("subtected "+(n1-n2));
            } else if (en==3) {
                System.out.println("div"+(n1/n2));

            }else if (en==4){
                System.out.println("Multiped"+(n1*n2));

            }else {
                System.out.println("Not found");
            }
            {

            }

        }
    }
}
