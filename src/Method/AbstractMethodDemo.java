package Method;


abstract class ab1{
    public void print(){
        System.out.println("This is a abstract class...");
    }

    abstract void message(String s);
}

class ab2 extends ab1{

    @Override
    void message(String s) {
        System.out.println("Abstract from child class");
    }
}

class A{
//    abstract int addd();            //error we cant create abstract method in normal class
}

public class AbstractMethodDemo {
   /* public abstract void print(){
        System.out.println("this is a abstract class");
    }*/             //it is not working coz abstract method is didn't take any task. just implement it.

    public static void main(String[] args) {
        ab1 a = new ab1() {
            @Override
            void message(String s) {
                System.out.println(".........");
            }
        };

        a.message("ggg");
        a.print();

        ab2 a1 = new ab2();
        a1.message("hf");
        a1.print();         //default override karke parent class ka method call kr lega
    }

}
