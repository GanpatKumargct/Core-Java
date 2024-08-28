package MultiThreading;

 class YieldExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new MyThread("Thread 1");
        // Start the threads
        thread1.start();
    }
    static class MyThread extends Thread {
        public MyThread(String s) {
            
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                // Print thread name and value of i
                System.out.println(Thread.currentThread().getName() + ": " +i);
                // Call yield to give chance to other threads
                Thread.yield();
            }
        }
    }
}
