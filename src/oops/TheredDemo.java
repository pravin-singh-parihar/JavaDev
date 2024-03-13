package oops;
class Demo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Jai shreee ram.......");

        }
    }
}
public class TheredDemo {
    public static void main(String[] args) {
        System.out.println("ME hu main");
        Demo demo = new Demo();
        Thread t1 = new Thread(demo);
       t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("RAMRAm.................");
            Thread.currentThread();

        }
    }
}
