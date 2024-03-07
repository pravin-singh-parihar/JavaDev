public class InstanceVariableDemo {
    //instance variable the inside the class but the outside the method that is called the instance variable
   // An instnce variable are the don't instilize than the variable give the defult value
    int b;

    int a=10;
    public static void main(String[] args) {
        // In a static method we can not be accesed the instance virble dircley, we accese by the creating  object.
        InstanceVariableDemo instance=new InstanceVariableDemo();
        System.out.println(instance.a);

    }
    // we are dircly accesed in the non-static method inststance variable
    public void demo(){
        System.out.println(a);
    }
}
