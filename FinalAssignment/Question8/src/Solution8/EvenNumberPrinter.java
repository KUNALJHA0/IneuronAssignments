package Solution8;

public class EvenNumberPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
