package AnotationDemo;

class Animal {

     public void sound(){
         System.out.println("Animal Makes generic Sound");
     }
}


class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dogs Barks");
    }
}

