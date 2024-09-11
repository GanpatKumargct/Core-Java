package Oops;


class oop {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class encapsulationDemo1{
    public static void main(String[] args) {
        oop obj1=new oop();
        obj1.setName("Rishabh");
        String nam= obj1.getName();
        System.out.println(nam);
        obj1.setAge(21);
        int stud1= obj1.getAge();
        System.out.println(stud1);
    }
}
