package homeWork10;

/**
 * Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000))
 */

public class StudyJava {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("I study Java");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
