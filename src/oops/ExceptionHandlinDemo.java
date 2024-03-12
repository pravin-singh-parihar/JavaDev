package oops;

public class ExceptionHandlinDemo {
    public static void main(String[] args) {
        System.out.println("me hu main");
      m1();

    }public static void m1() {


        try {
            System.out.println("First catch");

            try {
                System.out.println("Secand catch");
               throw new ArithmeticException("me NHi dunga reasan jo karna hai kar lo");

            } catch (Exception e)  {
               e.addSuppressed(e);
                {
                    {

                    }
                    }
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());


        }finally {
          String  sc="Me to print ho ga hi chahe kuch bhi ho ";
            System.out.println(sc);
        }
    }
}
