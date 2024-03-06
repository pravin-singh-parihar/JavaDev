package stringbuffer;

public class StringDiffStringBuffer {
    public static void main(String[] args) {
        // what is the diffarnce betwenen the string and the string buffer
        //string
        String s1 = "Pravin";
        String s2= s1.concat(" Singh");
        System.out.println(s2);
        //String Buffer
        StringBuffer sb=new StringBuffer("Lavkeh");
        sb.append(" Parihar");
        System.out.println(sb);
        //The diffrance between the String and string bufffer that is the in string we are change in the string than the make new object
        //The string buffer not create a new object that's object are the changed
    }
}
