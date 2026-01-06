package SolidPrinciples.Singleton.EagerExample;

public class main {
    public static void main(String[] args) {
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.log("Thread " + Thread.currentThread().getName());
            System.out.println("HashCode: " + logger.hashCode());
        };

        // Create multiple threads
        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
