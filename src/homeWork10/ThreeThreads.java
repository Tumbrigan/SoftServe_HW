package homeWork10;

/**
 * Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.
 */

public class ThreeThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Hello the first Thread!");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Hi from the second Thread!");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Guten Tag ab dem dritten Thread");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
    }
}