package Oops;



class Demo{
    public void add(int a , int b){
        int Sum = a+b;
        System.out.println(Sum);
    }
    Demo(){
        System.out.println("Constructor Created.....");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Demo de = new Demo();
        //here only constructor called automatically
        de.add(10,50);
    }
}
