package thread;

/**
 * Затримка потоку. Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
 * і коли ці потоки успішно відпрацюють – вивести на екран повідомлення (завершення потім first, second і main).
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " start...");     // main start...
        MyTask firstTask = new MyTask();
        MyTask secondTask = new MyTask();
        Thread thread1 = new Thread(firstTask, "first");
        Thread thread2 = new Thread(secondTask, "second");
        thread2.start();                                                        // second start...
        thread1.start();                                                        // first start...
        thread1.join();
        thread2.join();
        System.out.println(Thread.currentThread().getName() + " finish...");
    }
}
