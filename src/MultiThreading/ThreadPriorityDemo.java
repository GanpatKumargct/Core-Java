package MultiThreading;

class priorityTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}

class priorityTest1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new priorityTest(), "Gans!");
        Thread t2 = new Thread(new priorityTest1(), "Gannu!");
//        t1.setPriority(Thread.MAX_PRIORITY);        //pahle t1 ko chaalyega
//        t2.setPriority(Thread.MAX_PRIORITY);            //pahle t2 ko chaalyega
        t1.setPriority(1);              //min priority
        t1.start();

        t2.start();
    }
}
