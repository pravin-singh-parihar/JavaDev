package oops;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("me hu main");
         m1();

    }public static void m1(){
        System.out.println("Main hu m1");
        m2(20);
       try {
           System.out.println("try block");
           System.out.println(10/0);
       }catch (Exception e){
           e.printStackTrace();
           System.out.println(e.getMessage());
       }

    }public static void m2(int a){
        System.out.println("me hu m2");
     ;

    }
}
