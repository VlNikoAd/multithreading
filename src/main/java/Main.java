public class Main {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");

        Thread thread1 = new MyThread(threadGroup, "1 thread.");
        Thread thread2 = new MyThread(threadGroup, "2 thread.");
        Thread thread3 = new MyThread(threadGroup, "3 thread.");
        Thread thread4 = new MyThread(threadGroup, "4 thread.");

        System.out.println("Создаю потоки...");
        startThreads(thread1, thread2, thread3, thread4);

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadGroup.interrupt();
    }

    private static void startThreads(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }
}

