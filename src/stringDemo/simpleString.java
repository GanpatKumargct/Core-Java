package stringDemo;

public class simpleString {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "hey";
        String s3 = "hey";
        String s4 = new String("Hello");

        System.out.println(s1);
        System.out.println(s2);


        //reference
        System.out.println(s1==s4);  //false
        System.out.println(s2==s3);  //true

        //contents
        System.out.println(s1.equals(s4)); //true
        System.out.println(s2.equals(s3)); //true

        //string length
        System.out.println(s1.length());  //retrun length of the string

        //concatenation
        System.out.println(s1+s2);

        //To char Array()
        String s5 = "Roy";
        char arr[] = s5.toCharArray();
        System.out.println(arr);

        // to array - string
        char[] ch = {'a','b','c','d'};
        System.out.println(ch);
        System.out.println(s1.compareTo(s2));

        //substring
        String s6 = s1.substring(0,2); // 0 to 1 index tk ka value
        String s7 = s1.substring(3); //3 index ke baad sab
        System.out.println(s6 +"\n"+s7);

        //replace
        String s8 = "made in india mktd ltd";
        String res = s8.replace("mktd","ABH");
        System.out.println(res);

        //IndexOf
        System.out.println(s8.indexOf('a')); //first a ka index dega


        //immutable means
        String im1 = "ganpat";
        System.out.println(im1);      //ganpat
        String im2 = im1;
        System.out.println(im2);      //ganpat
        String im3 = im1;
        System.out.println(im3);      //ganpat
        im1 = im1 + "roy";
        System.out.println(im1);     //ganpatroy
        String im4 = im1;
        System.out.println(im4);     //ganpatroy

    }
}
