package stringbuffer;

public class StringBufferFunction {
    public static void main(String[] args) {
        //append
        StringBuffer sb=new StringBuffer("Hemant");
        sb.append(" Katekar");
        System.out.println(sb);
        //insert()
        sb.insert(3,"Pravin");
        System.out.println(sb);
        //replce()
        sb.replace(2,7,"Pravin");
        System.out.println(sb);
        //revarse()
        sb.reverse();
        System.out.println(sb);
    }
}
