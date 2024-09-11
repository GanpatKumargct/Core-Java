package MultiThreading;

class savingAccount{
    public synchronized void withdraw(String name)  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Withdrawing money by : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());;
            }

        }
        System.out.println("*****************Transaction completed****************");

    }
}

class myThreadAccount extends Thread{
    savingAccount s;
    String name;

    public myThreadAccount(savingAccount s, String name) {
        this.s = s;
        this.name = name;
    }

    @Override
    public void run() {
        s.withdraw(name);
    }
}

public class synchronizationDemo {
    public static void main(String[] args) {
        savingAccount sv = new savingAccount();
        Thread t1 = new Thread(new myThreadAccount(sv,"wife"));
        Thread t2 = new Thread(new myThreadAccount(sv,"Husband"));
        t1.start();
        t2.start();
    }

}
