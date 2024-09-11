package variableTypes;

class Parent
{
    String name ="Sita";
}
class Demo extends Parent{
    String name="Krishna";  //instance variable
    int a; //default
    void print()
    {
        String dog="radha"; //local variable
        int b=10;
        System.out.println(name);
        b=20;
        System.out.println(dog);
        System.out.println("a=="+a);
        System.out.println(b);
    }

    void display(){
        System.out.println(name);
        //System.out.println(dog); //erro
    }


    void namstey(String name,int a)
    {
        System.out.println(name);
        System.out.println(a);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}


public class VariableDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.name);
        d.print();

        d.namstey("Gana",10);
    }
}
