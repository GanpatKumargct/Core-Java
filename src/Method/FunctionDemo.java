package Method;

public class FunctionDemo {

    public int add(int a, int b){
        return a+b;
    }


    public void ArithmeticOperator(){
        System.out.println("...........Arithmetic Operator.......");

    }

    public static void main(String[] args) {
        FunctionDemo FD = new FunctionDemo();

        int sum = FD.add(5,8);
        System.out.println(sum);


        FD.ArithmeticOperator();
    }
}
