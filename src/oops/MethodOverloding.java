package oops;
public class MethodOverloding {

   public int hemant(int a){
       return a;

   }public int hemant(int a,int b){
       return a+b;
    }

    public static void main(String[] args) {
        MethodOverloding fieand = new MethodOverloding();
         int a =fieand.hemant(12);
        System.out.println(fieand.hemant(10)+a);
    }


    }

