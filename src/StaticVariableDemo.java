public class StaticVariableDemo {
    //Static variable are those the variable we are the intilize the static in front of the variable
    static int a=2;
    public static void main(String[] args) {
        // we are accesed the dirctly static variable in the static method
        System.out.println(a);

    }
    public void demo(){
        // in a non-static method we are accesed the directly static varicble
        System.out.println(a);
    }
}
