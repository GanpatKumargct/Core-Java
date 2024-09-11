package Oops;

class Sum{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}

public class methodOverloading {
    public static void main(String[] args) {

        Sum ad = new Sum();

        int add = ad.add(8,9);
        int re1 = ad.add(8,9,7,8);
        System.out.println(add);
        System.out.println(re1);

    }
}
