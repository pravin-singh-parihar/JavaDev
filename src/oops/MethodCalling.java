package oops;

public class MethodCalling {
    public static void main(String[] args) {
        System.out.println("Main");
        m1();
        System.out.println("by main");
        Secand object=new Secand();
        object.m2();
    } static int m1(){
        int a=20;
        System.out.println(a);

    return a;
    }
}
 class Secand {
     public static  void m2(){
         System.out.println("Secand methed");

     }

}