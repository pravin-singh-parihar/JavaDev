package string;

public class StringFunction {
    public static void main(String[] args) {
        //String length
        String s1="Pravin Singh";
        System.out.println(s1.length());
        //String Conecatention
        String s2="Hemant";
        String s3="Rushi";
        System.out.println(s3+s2);
        //toChararray
        String s4="Pradip";
        char arr[]=s4.toCharArray();
        for(char a:arr){
            System.out.println(a);
        }  //charAt()
        String s5= "Payal";
        System.out.println("char at = "+s5.charAt(3));
        //campare
        String s6="Badal";
        String s7="Nilanshu";
        System.out.println(s6.compareTo(s7));
        //refarnce == equals
        System.out.println(s6.equals(s7));
        //container
        String s8="Hellow wel come to in the uit confrance holl";
        System.out.println(s8.contains("Hellow"));
        //indexOf()
        System.out.println(s8.indexOf("a"));
        //repladce ()
        String ss= "Pravin";
        String res=ss.replace("P","H");
        System.out.println(res);
    }
}
