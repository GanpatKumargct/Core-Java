package MultiThreading;

 public class YieldExample {
     static class MyThread extends Thread {
         public MyThread(String s) {
         }
         public void run() {
             for (int i = 0; i < 5; i++) {
                 System.out.println("Child Thread");
                 // Print thread name and value of i
                 System.out.println(Thread.currentThread().getName() + ": " +i);
                 // Call yield to give chance to other threads, it is only hint the compiler may or may not be executed
                 Thread.yield();
             }
         }
     }
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new MyThread("Thread 1");
        // Start the threads
        thread1.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread");
            // Print thread name and value of i
            System.out.println(Thread.currentThread().getName() + ": " +i);
            // Call yield to give chance to other threads
            Thread.yield();
        }
    }

}
