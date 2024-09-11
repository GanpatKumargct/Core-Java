package Oops;

abstract class Vehicle{
    public abstract void engine();
    public void horn(){
        System.out.println("pee pee");
    }
}
class BMW extends Vehicle{
    @Override
    public void engine() {
        System.out.println("4000c Engine");
    }
    public void display(){
        System.out.println("Color red");
    }

    /*
    public void abstract gan(){             //its not possible

    }*/
}


class Tata extends Vehicle{
    @Override
    public void engine() {
        System.out.println("2100c Engine");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Vehicle vehicle1=new BMW();
        vehicle1.engine();

        Vehicle vehicle2=new Tata();
        vehicle2.engine();
    }

}
