package thread;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.printf("%s start... \n", Thread.currentThread().getName());
        try {
            if (Thread.currentThread().getName().equals("first"))
                Thread.sleep(1000);
            else Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finish... \n", Thread.currentThread().getName());
    }
}
