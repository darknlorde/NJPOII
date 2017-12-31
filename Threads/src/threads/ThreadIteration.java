package threads;

public class ThreadIteration extends Thread2 {

    long time;
    long start = 0;
    long stop = 0;

    ThreadIteration() {

    }

    ThreadIteration(int number) {
        System.out.println("Utworzono watek " + number);
    }

    public int powerIteration(int n) {
        int z = 1;
        int s = 1;
        while (z <= n) {
            s = s * z;
            z++;
        }
        return s;
    }

    public long getTime() {
        return time;
    }

    @Override
    public void run() {
        start = System.nanoTime();
        powerIteration(number);
        stop = System.nanoTime();
        time = stop - start;
    }
}
