package typeCasting;

public class typeCastingDemo {
    public static void main(String[] args) {
        int A = 10;
        double data = A;  //implicit
        System.out.println(A);

        double num = 50.25;
        int B = (int)num;  //Explict
        System.out.println(num);
        System.out.println(B); // may be data will be lost
    }
}
