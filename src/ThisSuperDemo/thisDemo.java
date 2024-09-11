package ThisSuperDemo;

class Animal {
    String s;

    public Animal(String s) {
        this.s = s; //current class String
    }
}

class dog extends Animal{
    public dog(String s) {
        super(s);  //here parents class string will assign
    }
}

public class thisDemo {
    public static void main(String[] args) {
        Animal an = new Animal("gans......");
        System.out.println(an);

    }
}
