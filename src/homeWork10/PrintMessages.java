package homeWork10;

/**
 * Output two messages «Hello, world» and «Peace in the peace»
 * 5 times each with the intervals of 2 seconds, and the second - 3 seconds.
 * After printing messages, print the text «My name is …»
 */

public class PrintMessages {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Hello, world!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Peace in the peace!");
                    Thread.sleep(3000);
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

        System.out.println("My name is Ihor");
    }
}