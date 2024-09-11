package ExceptionHandling;

import java.util.Collections;

public class tryCatchDemo {
    public static void main(String[] args) {
        try {
            int divide =10 /0;
            System.out.println(divide);
        }catch (ArithmeticException e ){
            System.out.println("............catch block............");

            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace());


        }
    }
}
