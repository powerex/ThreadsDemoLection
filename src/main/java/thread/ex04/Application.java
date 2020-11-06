package thread.ex04;

public class Application {
    public static void main(String args[]) {
        new MyThread("One"); // start threads
        new MyThread("Two");
        new MyThread("Three");

        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
