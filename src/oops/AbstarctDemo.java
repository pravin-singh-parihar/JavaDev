package oops;

 abstract  class AbstarctDemo {
     int  a;
     abstract void pravin();
     AbstarctDemo(){
     }
 }
  class Vehcle extends AbstarctDemo{
      @Override
      void pravin() {
          System.out.println("Pravin Car");

      }
  }
   class Abstraction{
     public static void main(String[] args) {
AbstarctDemo vehcle=new Vehcle();
vehcle.pravin();
         System.out.println(vehcle.a);
    }
}
