package Oops;

class Animal{
    void makeSound(){
        System.out.println("Animal makes generic Sound....");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
//        super.makeSound();   //this call super method
        System.out.println("bark........!");

    }
}

class Cat extends Dog{
    @Override
    void makeSound() {
        System.out.println("Mew mew.....!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal dg = new Dog();
        dg.makeSound();

        Animal dg1 = new Cat();
        dg1.makeSound();


    }
}
