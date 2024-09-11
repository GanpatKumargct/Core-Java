package AccessModifier;

class A {
    protected int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }
}

class B extends A{
   /* public int sum(int a, int b){
        return a+b +1;
    }*/

    @Override
    public int sum(int a, int b) {
        System.out.println("this is child class");
        return super.sum(a, b);
    }

    @Override
    public int sum(int a, int b, int c) {
        return super.sum(a, b, c);
    }

    public int sum(int a, int b, int c, int... d) {
        int sum = a+b+c;
        for (int i : d) {
            sum = sum+i;
        }
        return sum;
    }
}

public class accessModifierDemo {
    public static void main(String[] args) {
        A add = new B();
        int addition = add.sum(8,5);
        int addition1 = add.sum(8,5, 8);
//        int addition2 = add.sum(8,5, 8, 9,10);            //error qki yeh A class me implemented nahi hai
        System.out.println(addition);
        System.out.println(addition1);
        System.out.println("**********");
        B ad = new B();
        int addition3 = ad.sum(8,9);
        int res4 = ad.sum(8,6,9);
        int res5 = ad.sum(8,9,6,5,4,3);
        System.out.println(addition3);
        System.out.println(res4);
        System.out.println(res5);

    }
}
