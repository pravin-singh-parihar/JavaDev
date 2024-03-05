import java.util.Scanner;

public class N1N2 {
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
