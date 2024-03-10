package Inhartance;

class Parent {
    public String demo(){
        System.out.println("Demo");

    return "Demo";
    }
}
class Child extends Parent{
public String demo2(){
    System.out.println("Demo2");
return "Demo2";
}
}
public class PrentChild {
    public static void main(String[] args) {
        Child child=new Child();
        child.demo();
        System.out.println(child);
    }
}