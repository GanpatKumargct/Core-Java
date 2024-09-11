package MultiThreading;
class JoinTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class JoinTest1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new JoinTest(), "join -0");
        Thread t2 = new Thread(new JoinTest1(), "join -1");

        t1.start();
        t1.join();          //wait until t1 is finished

        t2.start();
    }
}
