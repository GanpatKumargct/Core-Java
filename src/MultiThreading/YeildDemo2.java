package MultiThreading;

class yeildTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());

        }
        Thread.yield();             //pahle Thread 1 ko excute hone ke liye compiler ko bol dega
    }
}

class yeildTest1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }

    }
}
public class YeildDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new yeildTest(), "Yield test -0");
        Thread t2 = new Thread(new yeildTest1(), "Yield test -1");
        t1.start();
        t2.start();


    }
}
