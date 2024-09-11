package MultiThreading;

class sumTest implements Runnable{


    int Sum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Sum = Sum + i;
        }
        System.out.println("Sum = "+Sum);
    }
}

public class SumDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new sumTest(), "Sum1");
        Thread t2 = new Thread(new sumTest(), "Sum2");
        t1.start();
//        t1.join();
        t2.start();
    }
}
