package MultiThreading;

class Counter{
    private int count = 0;
    public synchronized void incr(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

class counterThread extends Thread{
    private Counter counter;

    public counterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

        }
    }
}

public class counterTest {
    public static void main(String[] args) {
        
    }
}
