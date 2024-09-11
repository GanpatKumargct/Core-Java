package MultiThreading;




class ThreadDemo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread....");
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

public class ImplRunnable {
    public static void main(String[] args) {
        Runnable ThreadDemo;
        Thread t = new Thread(new ThreadDemo());
        t.setName("Gans!");
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread....");
            System.out.println(Thread.currentThread().getName()
            +i);
        }
    }
}
