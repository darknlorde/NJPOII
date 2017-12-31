package threads;

public class ThreadRecursion extends Thread2 {

    long time;

    ThreadRecursion() {

    }

    ThreadRecursion(int number) {
        System.out.println("Utworzono watek " + number);
    }

    public int powerRecursion(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * powerRecursion(i - 1);
        }
    }

    public long getTime() {
        return time;
    }

    @Override
    public void run() {
        long start = 0;
        long stop = 0;
        start = System.nanoTime();
        powerRecursion(number);
        stop = System.nanoTime();
        time = stop - start;
    }
}
