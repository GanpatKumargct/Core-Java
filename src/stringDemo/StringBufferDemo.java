package stringDemo;

import org.w3c.dom.ls.LSOutput;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Raj");
        sb.append("kumar");

        StringBuffer sb1 = sb.append("yadav");
        System.out.println(sb);
        System.out.println(sb1);
    }


}
